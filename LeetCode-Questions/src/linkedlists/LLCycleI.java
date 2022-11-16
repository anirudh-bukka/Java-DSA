package linkedlists;

// LL consists of a cycle? ----> Just check this code, not the output
public class LLCycleI {
    
    int size;
    Node head;
    Node tail;

    public boolean checkCycle(Node head) {
        Node f = head;
        Node s = head;

        while(f != null && f.next != null) {
            s = s.next;
            f = f.next.next;

            if(s == f)
                return true;
        }
        return false;
    }

    public void insertLast(int value) {
        if(tail == null) {
            insertFirst(value);
            return;
        }

        LLCycleI.Node node = new LLCycleI.Node(value);
        tail.next = node;
        tail = node;
        size += 1;
    }
    public void insertFirst(int value) {
        LLCycleI.Node node = new LLCycleI.Node(value);
        node.next = head;
        head = node;

        if(tail == null)
            tail = head;

        size += 1;
    }
    public void display() {
        LLCycleI.Node temp = head;
        while(temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public static void main(String[] args) {
        LLCycleI list = new LLCycleI(); // now Linked List of size = 0 will be initialised.
        list.insertLast(0);
        list.insertLast(0);
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(2);
        list.insertLast(99);
        list.display();

        System.out.println(list.checkCycle(list.head));

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
