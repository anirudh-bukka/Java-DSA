package stacks_queues;

import java.util.Stack;

public class ValidParanthesis {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()) {
            if(c == '(' || c == '{' || c == '[')
                stack.push(c);
            else {
                if (stack.isEmpty() || c == ')') { // first check if the stack is empty or not, because in previous iterations, due to pop(), the stack could become empty.
                    if (stack.pop() != '(')
                        return false;
                }
                if (stack.isEmpty() || c == '}') {
                    if (stack.pop() != '{')
                        return false;
                }
                if (stack.isEmpty() || c == ']') {
                    if (stack.pop() != '[')
                        return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
