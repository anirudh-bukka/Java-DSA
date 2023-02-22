public class CircularQueueMain {
    public static void main(String[] args) throws CircularQueueException {
//        CustomCircularQueue queue = new CustomCircularQueue(5);
        DynamicQueue queue = new DynamicQueue(3);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);

        queue.display();

        System.out.println(queue.remove());
        System.out.println(queue.remove());

        queue.display();

        queue.insert(99);
        queue.display();
        queue.insert(1919);
        queue.display();
    }
}
