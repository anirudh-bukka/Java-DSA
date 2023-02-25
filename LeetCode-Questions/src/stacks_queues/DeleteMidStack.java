package stacks_queues;
import java.util.*;

// Link: https://practice.geeksforgeeks.org/problems/delete-middle-element-of-a-stack/1

public class DeleteMidStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        Stack<Integer> temp = new Stack<>();
        System.out.println(removeMid(stack, temp, 0));

    }

    public static Stack removeMid(Stack stack, Stack temp, int k) {
        while(stack.size() != temp.size() + 1) {
            temp.push(stack.pop());
        }
        stack.pop();

        while(temp.size() != 0) {
            stack.push(temp.pop());
        }

        return stack;
    }

}


//    public static Stack removeMid(Stack stack, Stack temp, int k) {
//        if(k == 0)
//            return stack;
//
//        while(temp.size() + 1 != stack.size()) {
//            temp.push(stack.pop());
//            return removeMid(stack, temp, k++);
//        }
////        if(temp.size() + 1 == stack.size()) {
////            temp.push(stack.pop());
////            while(k != 0)
////                stack.push(temp.pop());
////            return temp;
////        }
//
//        temp.push(stack.pop());
//        return removeMid(stack, temp, k++);
//    }