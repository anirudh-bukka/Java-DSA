package Practice;

import java.util.Stack;

public class SubarraySum {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4};
        int n = ar.length;
        System.out.println(findSum(ar, n));
    }

    public static int findSum(int[] ar, int n) {
        Stack<Integer> stack = new Stack<>();
        for(int i : ar)
            stack.push(i);
        Object copy = stack.clone();

        int cumsum = 0;
        while(n > 0 && stack.size() > 0) {
            cumsum += stack.peek();
            cumsum += stack.pop();
            n--;
        }
        return cumsum;
    }
}
