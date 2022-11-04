package com.anirudh;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    // Insert at the beginning
    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null)
            tail = head;

        size += 1;
    }

    // Insert at the end
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

    // Display the entire LL
    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    // Get a node by index
    public Node getNode(int index) {
        Node node = head;
        for(int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    // Get a node by value
    public Node findNode(int value) {
        Node node = head;
        while(node != null) {
            if(node.value == value)
                return node;
            node = node.next;
        }
        return null;
    }

    // Insert at an index
    public void insertAtIndex(int value, int index) {
        if(index == 0) {
            insertFirst(value);
            return;
        }

        if(index == size) {
            insertLast(value);
            return;
        }

        // This also works ->
//        Node temp = head;
//        for(int i = 1; i < index; i++)
//            temp = temp.next;
//
//        Node current = temp.next;
//        Node node = new Node(value, current);
//        temp.next = node;
//        size++;

        Node node = new Node(value);
        Node prev = getNode(index-1);
        Node next = getNode(index+1);
        prev.next = node;
        node.next = next;
        size++;
    }

    // Delete last number
    public int deleteLast() {
        if(size <= 1)
            return deleteFirst();

        Node secondLast = getNode(size-2);
        int value = tail.value;
        tail = secondLast;
        tail.next = null;
        return value;
    }

    // Delete first number
    public int deleteFirst() {
//        Node second = getNode(1);
//        System.out.println("Deleted Node: " + head);
//        head = second;

        int value = head.value;
        head = head.next;
        if(head == null)
            tail = null;
        size--;
        return value;
    }

    // Delete a particular element by index
    public void deleteAtIndex(int index) {
        Node element = getNode(index);
        Node prev = getNode(index - 1);
        Node next = getNode(index + 1);
        System.out.println("Deleted Node: " + element);
        prev.next = next;
        size--;
    }

    // The Node
    private class Node {
        private int value;
        private Node next;

        // In some cases, only value is required as the argument.
        public Node(int value) {
            this.value = value;
        }

        // In some cases, value and next are both required as arguments.
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}