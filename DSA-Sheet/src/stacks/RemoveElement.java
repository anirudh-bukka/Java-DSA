package stacks;
// LINK: https://leetcode.com/problems/remove-element/

import java.util.Stack;

public class RemoveElement {
    public static void main(String[] args) {
        int[] ar = {3, 2, 2, 3};
        int value = 3;
        System.out.println(removeFunc(ar, value));
    }

    static int removeFunc(int[] nums, int val) {
//        Stack<Integer> stack = new Stack<>();
//        Stack<Integer> ans = new Stack<>();
//
//        for(int i : nums) {
//            stack.push(i);
//        }
//
//        while(stack.size() > 0) {
//            int peek = stack.peek();
//            if(peek == val) {
//                stack.pop();
//            } else {
//                ans.push(peek);
//                stack.pop();
//            }
//        }
//
//        return ans;
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val)
                nums[count++] = nums[i];
        }

        return count;
    }
}
