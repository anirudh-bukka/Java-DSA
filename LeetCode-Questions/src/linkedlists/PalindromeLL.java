package linkedlists;

public class PalindromeLL {
    public static Node head;
    public static Node next;
    public static Node previous;
    public static Node tail;
    public static int size = 0;

    public static Node middleNode(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    public static boolean isPalindrome(Node list) {
        Node first = head;
        Node second = head;

        return false;
    }

//    ----------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {
        PalindromeLL list = new PalindromeLL();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(2);
        list.insertLast(1);
//        System.out.println("Middle element: " + middleNode(list.head));
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