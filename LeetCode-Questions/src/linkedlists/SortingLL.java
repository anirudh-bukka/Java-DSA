//package linkedlists;
//
//public class SortingLL {
//    public static void main(String[] args) {
//         SortingLL list = new SortingLL();
//
////        list.insertLast(1);
////        list.insertLast(3);
////        list.insertLast(5);
////        list.insertLast(4);
////        list.insertLast(1);
////        list.insertLast(0);
////        list.insertLast(2);
////        list.insertLast(9);
////
////        System.out.println(sortList(list));
//
//    }
//
//    public static Node sortList(Node head) {
//        if(head == null || head.next == null)
//            return head;
//
//        Node mid = getMid(head);
//        Node left = sortList(head);
//        Node right = sortList(mid);
//
//        return merge(left, right);
//    }
//
//    public static Node merge(Node list1, Node list2) {
//        Node dummyHead = new Node();
//        Node tail = dummyHead;
//
//        while(list1 != null && list2 != null) {
//            if(list1.value < list2.value) {
//                tail.next = list1;
//                list1 = list1.next;
//                tail = tail.next;
//            } else {
//                tail.next = list2;
//                list2 = list2.next;
//                tail = tail.next;
//            }
//        }
//
//        tail.next = (list1 != null) ? list1 : list2;
//        return dummyHead.next;
//    }
//
//    public static Node getMid(Node head) {
//        Node fast = head;
//        Node slow = head;
//
//        while(fast != null || fast.next != null) {
//            fast = fast.next.next;
//            slow = slow.next;
//        }
//
//        return slow;
//    }
//
//    // ------------------------------------------------------------------------------------
//    class Node {
//      int value;
//     Node next;
//     Node (int x) {
//          value = x;
//          next = null;
//      }
//  }
////    Node head;
////    Node tail;
////    int size;
////
////    public static class Node {
////        public int value;
////        public Node next;
////
////        public Node(int value) {
////            this.value = value;
////        }
////
////        public Node(int value, SingleLinkedListClass.Node next) {
////            this.value = value;
////            this.next = next;
////        }
////
////        public Node() {}
////    }
////
////    public void insertFirst(int value) {
////        SingleLinkedListClass.Node node = new SingleLinkedListClass.Node(value);
////        node.next = head;
////        head = node;
////
////        if(tail == null) {
////            tail = head;
////        }
////
////        size += 1;
////    }
////
////    public void insertLast(int value) {     // <-- Time complexity = constant.
////        if(tail == null) {
////            insertFirst(value);
////            return;
////        }
////
////        SingleLinkedListClass.Node node = new SingleLinkedListClass.Node(value);
////        tail.next = node;
////        tail = node;
////        size++;
////    }
////
////    public void insertAtPosition(int value, int index) {
////        if(index == 0) {
////            insertFirst(value);
////            return;
////        }
////        if(index == size-1) {
////            insertLast(value);
////            return;
////        }
////
////        SingleLinkedListClass.Node temp = head;
////        for (int i = 1; i < index; i++) {
////            temp = temp.next;
////        }
////
////        SingleLinkedListClass.Node node = new SingleLinkedListClass.Node(value, temp.next);
////        temp.next = node;
////
////        size++;
////    }
////
////    public int deleteFirst() {
////        int value = head.value;
////        head = head.next;
////        if(head == null)
////            tail = null;
////        size--;
////        return value;
////    }
////
////    public SingleLinkedListClass.Node getNode(int index) {
////        SingleLinkedListClass.Node temp = head;
////        for (int i = 0; i < index; i++) {
////            temp = temp.next;
////
////        }
////        return temp;
////    }
////
////    public int deleteLast() {
////        if(size <= 1)
////            return deleteFirst();
////
////        SingleLinkedListClass.Node secondLast = getNode(size-2);
////        int value = tail.value;
////        tail = secondLast;
////        tail.next = null;
////        return value;
////    }
////
////    public int deleteAtPosition(int index) {
////        if(index == 0) {
////            return deleteFirst();
////        }
////        if(index == size-1)
////            return deleteLast();
////
////        SingleLinkedListClass.Node prev = getNode(index - 1);
////        int value = prev.next.value;
////        prev.next = prev.next.next;
////
////        return value;
////    }
////
////    public void display() {
////        SingleLinkedListClass.Node temp = head;
////        while(temp != null) {
////            System.out.print(temp.value + " -> ");
////            temp = temp.next;
////        }
////        System.out.println("END");
////    }
//}
