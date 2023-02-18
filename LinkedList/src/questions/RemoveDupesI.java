package questions;
//import com.anirudh.LL;

import com.anirudh.LL;

public class RemoveDupesI {
    public static void main(String[] args) {
        RemoveDupesI list = new RemoveDupesI();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(2);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(4);
        list.display();
        list.removeDuplicates();
        list.display();
    }

    public void removeDuplicates() {
        Node node = head;

        while(node.next != null) {
            if(node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    // -----------------------------------------------------------------------------------------------
    // LINKEDLIST METHODS
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

    public void insertAtPosition(int value, int index) {
        if(index == 0) {
            insertFirst(value);
            return;
        }
        if(index == size-1) {
            insertLast(value);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(value, temp.next);
        temp.next = node;

        size++;
    }

    public int deleteFirst() {
        int value = head.value;
        head = head.next;
        if(head == null)
            tail = null;
        size--;
        return value;
    }

    public Node getNode(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;

        }
        return temp;
    }

    public int deleteLast() {
        if(size <= 1)
            return deleteFirst();

        Node secondLast = getNode(size-2);
        int value = tail.value;
        tail = secondLast;
        tail.next = null;
        return value;
    }

    public int deleteAtPosition(int index) {
        if(index == 0) {
            return deleteFirst();
        }
        if(index == size-1)
            return deleteLast();

        Node prev = getNode(index - 1);
        int value = prev.next.value;
        prev.next = prev.next.next;

        return value;
    }

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    
    // -----------------------------------------------------------------------------------------------
    // INNER CLASS FOR NODE
    
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
    Node head;
    Node tail;
    int size;
    public RemoveDupesI() {this.size = 0;}
}
