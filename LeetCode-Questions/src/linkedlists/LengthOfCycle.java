package linkedlists;

public class LengthOfCycle {

    int size;
    Node head;
    Node tail;

    public int countLengthOfCycle(Node head) {
        Node f = head;
        Node s = head;
        
        while(f != null && f.next != null) {
            f = f.next.next;
            s = s.next;
            if(s == f) {
                int length = 0;
                Node tempS = s;
                do {
                    tempS = tempS.next;
                    length++;
                } while (s == tempS);
                return length;
            }
        }

        return 0;
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
        LengthOfCycle list = new LengthOfCycle(); // now Linked List of size = 0 will be initialised.
        list.insertLast(0);
        list.insertLast(0);
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(2);
        list.insertLast(99);
        list.display();

        System.out.println(list.countLengthOfCycle(list.head));

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
