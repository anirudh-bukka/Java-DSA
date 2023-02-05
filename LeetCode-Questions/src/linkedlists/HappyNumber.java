package linkedlists;

// https://leetcode.com/problems/happy-number
public class HappyNumber {

    Node head;
    Node tail;
    int size = 0;

    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while(fast != slow);

        if(slow == 1)
            return true;

        return false;
    }

    private static int findSquare(int n) {
        int ans = 0;

        while(n > 0) {
            int rem = n % 10;
            ans += rem*rem;
            n = n/10;
        }
        return ans;
    }

    // Insert at the beginning
    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null)
            tail = head;

        size += 1;
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

    public static void main(String[] args) {
//        HappyNumber list = new HappyNumber();
//        list.insertLast(19);
        System.out.println(isHappy(19));
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.next = next;
        }
    }
}
