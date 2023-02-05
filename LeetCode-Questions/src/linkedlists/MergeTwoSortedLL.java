package linkedlists;

public class MergeTwoSortedLL {

    int size = 0;
    Node tail;
    Node head;
    Node next;

    public static MergeTwoSortedLL merge(MergeTwoSortedLL first, MergeTwoSortedLL second) {
        Node f = first.head;
        Node s = second.head;

        MergeTwoSortedLL ans = new MergeTwoSortedLL();

        while(f != null && s != null) {
            if(f.value < s.value) {
                ans.insertLast(f.value);
                f = f.next;
            }
            else {
                ans.insertLast(s.value);
                s = s.next;
            }
        }
        while(f != null) {
            ans.insertLast(f.value);
            f = f.next;
        }
        while(s != null) {
            ans.insertLast(s.value);
            s = s.next;
        }

        return ans;
    }

//        -------------------------------------------------------------------------------------------------------------

    // Insert at the end
    public void insertLast(int value) {
        if(tail == null) {
            insertFirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size += 1;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null)
            tail = head;

        size += 1;
    }

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public static void main(String[] args) {
        MergeTwoSortedLL list1 = new MergeTwoSortedLL();
        MergeTwoSortedLL list2 = new MergeTwoSortedLL();

        list1.insertFirst(3);
        list1.insertFirst(1);
        list1.insertFirst(1);
        list2.insertFirst(5);
        list2.insertFirst(4);
        list2.insertFirst(2);
        list1.display();
        list2.display();

        MergeTwoSortedLL ans = MergeTwoSortedLL.merge(list1, list2);
        ans.display();
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

}
