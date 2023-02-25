package stacks_queues;
// Link: https://leetcode.com/problems/design-a-stack-with-increment-operation/

public class IncrementStackItems {
    int[] stack;
    int ptr = -1;
    int maxSize;

    public IncrementStackItems(int maxSize) {
        this.stack = new int[maxSize];
    }

    public void push(int x) {
        if(ptr < maxSize-1)
            stack[++ptr] = x;
    }

    public int pop() {
        if(ptr == -1)
            return -1;
        return stack[ptr--];
    }

    public void increment(int k, int value) {
        int tillWhere = (int)Math.min(k, stack.length);
        for(int i = 0; i < tillWhere; i++)
            stack[i] += value;
    }

    public void display() {
        for(int i = 0; i < maxSize; i++)
            System.out.print(stack[i] + " ");
        System.out.println("END");
    }

    public static void main(String[] args) {
//        int size = 4;
        IncrementStackItems stack = new IncrementStackItems(4);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.display();
        stack.increment(2, 100);
        stack.display();
        stack.increment(3, 100);
        stack.display();
        System.out.println("Popped: " + stack.pop());
        stack.increment(4, 100);
        stack.display();
        stack.display();
    }
}
