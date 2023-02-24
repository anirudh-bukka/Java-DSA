package stacks_queues;

import java.util.Stack;
import java.util.stream.Collectors;

public class RemoveAdjacentDuplicates {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder("");

        for(char c : s.toCharArray()) {
            if(stack.isEmpty() || c != stack.peek())
                stack.push(c);
            else if(!stack.isEmpty() && c == stack.peek()) {
                stack.pop();
            }
        }
        return stack.stream().map(a -> a.toString()).collect(Collectors.joining(""));
    }
}
