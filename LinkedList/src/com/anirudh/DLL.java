package com.anirudh;

public class DLL {

    private Node head;
//    private Node prev;
//    private Node next;
    private Node tail;
    private int size;

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        node.prev = null;

        if(head != null) {
            head.prev = node;
        }

        head = node;
        size++;
    }

    public void insertLast(int value) {
//        if(tail == null) {
//            insertFirst(value);
//            return;
//        }
        if(size == 0) {
            insertFirst(value);
            return;
        }
//        if(head == null) {
//            insertFirst(value);
//        }

        Node last = head;
        while(last.next != null) {
            last = last.next;
        }

        Node node = new Node(value);
        node.next = null;
        last.next = node;
        node.prev = last;

    }

    public void insertAfterValue(int after, int value) {
        Node p = findNode(after);

        if(p == null) {
            System.out.println("Does not exist.");
            return;
        }

        Node node = new Node(value);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next != null)
            node.next.prev = node;
    }

    public Node getNode(int index) {
        Node node = head;

        for(int i = 0; i < index; i++)
            node = node.next;

        return node;
    }

    public void deleteFirst() {
        Node temp = head;

        head = temp.next;
        head.prev = null;

    }

    public void deleteLast() {
        Node node = head;
        Node secondLast = head;
        while(node.next != null) {
            secondLast = node;
            node = node.next;
        }
        secondLast.next = null;
    }

    public void deleteAtIndex(int index) {

        if(index == 0) {
            deleteFirst();
            return;
        }

        Node node = head;
        for(int i = 0; i < index; i++) {
            node = node.next;
        }
        Node temp = node;
        Node previous = temp.prev;
        Node nextNode = temp.next;
        previous.next = nextNode;
        nextNode.prev = previous;
    }

    public void deleteElement(int value) {
        Node toDelete = findNode(value);

        Node previous = toDelete.prev;
        Node nextNode = toDelete.next;

        previous.next = nextNode;
        nextNode.prev = previous;
    }

    public Node findNode(int value) {
        Node node = head;

        while(node != null) {
            if(node.value == value)
                return node;
            node = node.next;
        }
        return null;
    }

    public void display() {
        Node temp = head;
//        Node last = null;
        while(temp != null) {
            System.out.print(temp.value + " -> ");
//            last = temp;
            tail = temp;
            temp = temp.next;
        }
        System.out.println("END");

        // ALTERNATIVE TO
//        System.out.println("Print Reverse: ");
//
//        while(last != null) {
//            System.out.print(last.value + " -> ");
//            last = last.prev;
//        }
//        System.out.println("END");

    }

    public void  displayReverse() {
        System.out.println("Print Reverse: ");
        Node temp = tail;
        while(temp != null) {
            System.out.print(temp.value + " <- ");
            temp = temp.prev;
        }
        System.out.println("START");

    }

    private class Node {
        private int value;
        private Node prev;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        // public Node(int value, Node next, Node prev) {}
        public Node(int value, Node prev, Node next) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
