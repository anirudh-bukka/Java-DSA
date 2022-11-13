package linkedlists;

public class RemoveDuplicatesI {

    Node head;
    Node tail;
    int size;

    public Node DeleteDuplicates(Node head) {
        Node tempHead = head;

        if(head == null)
            return head;

        while(head.next != null) {
            if(head.value == head.next.value)
                head.next = head.next.next;
            else
                head = head.next;
        }

        return tempHead;
    }
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
        RemoveDuplicatesI list = new RemoveDuplicatesI(); // now Linked List of size = 0 will be initialised.
        list.insertLast(0);
        list.insertLast(0);
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(2);
        list.insertLast(99);
        list.display();

        list.DeleteDuplicates(list.head);
        list.display();

    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.next = next;
            this.value = value;
        }
    }
}
