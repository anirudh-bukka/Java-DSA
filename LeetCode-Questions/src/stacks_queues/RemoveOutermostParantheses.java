package stacks_queues;

/*
LINK: https://leetcode.com/problems/remove-outermost-parentheses/description/

1.  Input: s = "(()())(())"
    Output: "()()()"
2.  Input: s = "(()())(())(()(()))"
    Output: "()()()()(())"
 */

import java.util.ArrayList;
import java.util.Stack;

public class RemoveOutermostParantheses {
    public static void main(String[] args) {
        String s = "(()())(())(()(()))";
        System.out.println(removeOuterParantheses(s));
    }

    public static String removeOuterParantheses(String s) {
        Stack<Character> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        char[] ar = s.toCharArray();

        for(int i = 0; i < ar.length; i++) {
            if(stack.size() == 0) {
                list.add(i);
                stack.push(ar[i]);
                continue;
            }
            if(ar[i] == '(' && stack.peek() == ')') {
                stack.pop();
                if(stack.peek() == 0) {
                    list.add(i);
                }
            }
            if(ar[i] == ')' && stack.peek() == '(') {
                stack.pop();
                if(stack.size() == 0) {
                    list.add(i);
                }
            } else {
                stack.push(ar[i]);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < list.size(); i+=2) {
            sb.append(s.substring(list.get(i) + 1, list.get(i+1)));
        }

        return sb.toString();
    }
}
