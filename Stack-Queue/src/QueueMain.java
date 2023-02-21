public class QueueMain {
    public static void main(String[] args) throws QueueException {
        CustomQueue queue = new CustomQueue(5);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);

        System.out.print("Entire Queue: ");
        queue.display();
        System.out.println("Front of queue: " + queue.displayFront());

        queue.remove();
        queue.remove();
        queue.remove();

        System.out.print("Entire Queue: ");
        queue.display();
        System.out.println("Front of queue: " + queue.displayFront());
    }
}
