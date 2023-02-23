package stacks_queues;
import java.util.Stack;

// Efficient insert, inefficient remove.
public class QueueUsingStackI {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStackI() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void add(int item) {
        // insertEfficient
        first.push(item);
    }

    public int remove() throws Exception {

        while(!first.isEmpty()) {
            second.push(first.pop());
        }
        int removed = second.pop();

        while(!second.isEmpty()) {
            first.push(second.pop());
        }
        return removed;
    }

    public int peek() throws Exception {
        while(!first.isEmpty())
            second.push(first.pop());

        int peeked = second.peek();

        while(!second.isEmpty())
            first.push(second.pop());

        return peeked;
    }

    public boolean isEmpty() {
        return first.isEmpty();
    }
}
