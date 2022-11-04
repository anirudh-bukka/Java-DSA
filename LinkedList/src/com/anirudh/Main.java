package com.anirudh;

public class Main {
    public static void main(String[] args) {
        LL list = new LL(); // now Linked List of size = 0 will be initialised.
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(222);
        list.insertAtIndex(1111, 3);
        list.display();
        list.deleteAtIndex(2);
        list.display();
        System.out.println("Deleted Element: " + list.deleteFirst());
        list.display();
        System.out.println("Deleted Element: " + list.deleteLast());
        list.display();
//        list.deleteAtIndex(1);
//        System.out.println(list.getNode(2));

    }
}
