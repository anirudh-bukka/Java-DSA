public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustomStack() {
        this(DEFAULT_SIZE); // --> Calling a constructor with another constructor.
    } // When nothing is passed, use the default size.

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {
        if(isFull()) {
            System.out.println("Stack is full.");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws StackException {
        if(isEmpty())
            throw new StackException("Cannot pop from an empty stack.");

        int removed = data[ptr];
        ptr--;
        return removed;
    }
//    public int pop() throws Exception{
//        if(isEmpty()) {
//            System.out.println("Stack is empty.");
//            return false;
//        }
//        int removed = data[ptr];
//        ptr--;
//        return removed;
//    }

    public int peek() throws StackException {
        if(isEmpty())
            throw new StackException("Cannot peek an item, because stack is empty.");

        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length - 1; // ptr is at last index, and if you move pointer further it will go out of bound.
    }

    public boolean isEmpty() {
        return ptr == -1;
    }
}
