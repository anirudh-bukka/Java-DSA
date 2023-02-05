package linkedlists;

public class MiddleOfLL {

    Node head;
    Node next;
    Node previous;
    Node tail;
    int size = 0;

    public static int middleNode(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow.value;
    }

//    ----------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {
        MiddleOfLL list = new MiddleOfLL();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(100);
        list.insertLast(22);
        list.insertLast(33);
        System.out.println("Middle element: " + middleNode(list.head));
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null) {
            tail = head;
        }

        size += 1;
    }

    public void insertLast(int value) {
        if(head == null) {
            insertFirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size += 1;
    }

    private class Node {
        private Node next;
        private int value;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
