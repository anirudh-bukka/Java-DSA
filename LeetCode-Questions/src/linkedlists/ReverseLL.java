package linkedlists;

public class ReverseLL {
    public static void main(String[] args) {
        ReverseLL list = new ReverseLL();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.display();
        recursiveReverse(list.head);
        System.out.println(iterativeReverse(list.head));
    }

    public static void recursiveReverse(Node head) {
        Node node = head;
        if(node == tail) {
            head = tail;
            return;
        }
        recursiveReverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    public static Node iterativeReverse(Node head) {
        if(size < 2) {
            return head;
        }

        Node prevNode = null;
        Node pres = head;
        Node nextNode = pres.next;
        prevNode.next = pres;

        while(pres != null) {
            pres.next = prevNode;
            prevNode = pres;
            pres = nextNode;
            if(nextNode != null )
                nextNode = nextNode.next;
        }
        return prevNode;
    }


    // ------------------------------------------------------------

    public static Node head;
    public static Node tail;
    public static int size;

    public ReverseLL() {
        this.size = 0;
    }

    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    // Insert using recursion.
    public void recursiveInsert(int value, int index) {
        head = recursiveInsert(value, index, head);
    }

    private Node recursiveInsert(int value, int index, Node node) {
        if(index == 0) {
            Node temp = new Node(value, node);
            size++;
            return temp;
        }

        node.next = recursiveInsert(value, index--, node.next);
        return node;
    }
    // ----

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null) {
            tail = head;
        }

        size += 1;
    }

    public void insertLast(int value) {     // <-- Time complexity = constant.
        if(tail == null) {
            insertFirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}

