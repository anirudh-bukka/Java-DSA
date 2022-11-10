package com.anirudh;

public class DLL {

    private Node head;
    private Node prev;
    private Node next;
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

    public void insertAtIndexFront(int index, int value) {
        if(index == 0) {
            insertFirst(value);
            return;
        }
        if(index == size-1) {
            insertLast(value);
            return;
        }


    }

    public void insertAtIndexLast(int index, int value) {

    }

    public void insertAfterIndex(int index, int value) {

    }

    public Node getNode(int index) {
        Node node = head;

        for(int i = 0; i < index; i++)
            node = node.next;

        return node;
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
