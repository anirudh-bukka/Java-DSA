package stacks_queues;
// Link: https://leetcode.com/problems/132-pattern/description/

import java.util.Stack;

public class Pattern132 {
    public static void main(String[] args) {
        int[] ar = {3, 1, 4, 2};
        System.out.println(existPattern(ar));
    }

    public static boolean existPattern(int[] ar) {
        Stack<Integer> stack = new Stack<>();
        for(int i : ar)
            stack.push(i);

        int smallest = Integer.MIN_VALUE;
        int largest = smallest;

        while(!stack.isEmpty()) {
            smallest = stack.pop();
            if(stack.peek() < smallest) {
                smallest = stack.pop();
            } else if(stack.peek() > largest){
                largest = stack.pop();
            } else if(stack.peek() < largest && stack.peek() > smallest) {
                return true;
            } else {
                largest = stack.pop();
            }
        }
        return false;
    }
}
