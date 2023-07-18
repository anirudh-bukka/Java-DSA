// Link: https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/1

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] ar = {6, 8, 0, 1, 3};
        System.out.println(Arrays.toString(findGreater(ar, ar.length)));
    }

    public static int[] findGreater(int[] ar, int n) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> resultStack = new Stack<>();

        for(int i : ar)
            stack.push(i);

        int top = -1;
        resultStack.push(top);

        while(stack.size() > 1) {
            int popped = stack.pop();
            int peek = stack.peek();
            top = Math.max(top, popped);
            if(popped > peek && popped < top) {
                resultStack.push(popped);
            } else if(top > peek) {
                resultStack.push(top);
            } else {
                resultStack.push(-1);
            }
        }

        ArrayList<Integer> alist = new ArrayList<>();
        while(resultStack.size() > 0) {
//            System.out.println(resultStack.pop());
            alist.add(resultStack.pop());
        }

        int[] array = new int[alist.size()];
        for(int i = 0; i < alist.size(); i++)
            array[i] = alist.get(i);

        return array;
    }
}
