package com.anirudh;

public class CLL {

    private Node head;
    private Node tail;
    int size;

    private class Node {
        int value;
        Node prev;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node prev, Node next) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public CLL() {
        this.head = null;
        this.tail = null;
        this.size = size;
    }

    public void display() {
        Node node = head;
//        for (int i = 0; i < size; i++) {
//            System.out.print(node.value + " -> ");
//            node = node.next;
//        }
//        System.out.println("END");
        if(head != null) {
            do {
                System.out.print(node.value + " -> ");
                node = node.next;
            } while(node != head);
            System.out.println("END");
        }
    }

    public void insertFirst(int value) {
//        Node node = new Node(value);
//        node.next = head;
//
//        if(head != null)
//            head.prev = node;
//        if(tail == null)
//            node.prev = null;
//        else
//            node.prev = tail;
//
//        head = node;
//        size++;

        Node node = new Node(value);
        if(head == null) {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void insertLast(int value) {
        Node node = new Node(value);
        if(head == null) {
            insertFirst(value);
            return;
        }

        Node last = head;
        while(last.next != head)
            last = last.next;

        node.prev = last;
        node.next = head;
        size++;
    }

    public void insertAtIndex(int value, int index) {
        Node node = new Node(value);
        Node temp = head;
        if(index == 0) {
            insertFirst(value);
            return;
        }
        if(index == size - 1) {
            insertLast(value);
            return;
        }

        for (int i = 0; i < index; i++)
            temp = temp.next;

        temp.prev.next = node;
        temp.prev = node;

        size++;
    }

//    public void insertAfterValue(int value) {
//
//    }
//
//    public Node getNode(int index) {
//
//    }
//
//    public Node findNode(int value) {
//
//    }
//
//    public void deleteFirst() {
//
//    }
//
//    public void deleteLast() {
//
//    }
//
//    public void deleteAtIndex(int index) {
//
//    }
//
//    public void deleteElement(int value) {
//
//    }
}
