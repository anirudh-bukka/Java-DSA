public class CustomCircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int first = 0;
    int end = 0;
    int size = 0;

    public CustomCircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomCircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean insert(int item) {
        if(isFull())
            return false;

        data[end++] = item;
        end = end % data.length; // we can't increment by 1 after it reaches the limit. Else it would cross the limit and cause ArrayOutOfBounds
        size++;
        return true;
    }

    public int remove() throws CircularQueueException {
        if(isEmpty())
            throw new CircularQueueException("Circular Queue is empty.");

        int removed = data[first++];
        first = first % data.length;
        size--;
        return removed;
    }

    public int front() throws CircularQueueException {
        if(isEmpty())
            throw new CircularQueueException("Circular Queue is empty.");
        return data[0];
    }

    public void display() {
        if(isEmpty()) {
            System.out.println("Empty");
            return;
        }

        int i = first;
        do {
            System.out.print(data[i] + " ");
            i++;
            i = i % data.length;
        } while(i != end);
        System.out.println("END");
    }

    public boolean isFull() {
        return size == data.length; // because end will not be equal to data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
