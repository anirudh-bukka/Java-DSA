package stacks_queues;
import java.util.*;

// Link: #2211 - https://leetcode.com/problems/count-collisions-on-a-road/description/
public class CarsCollision {
    public static void main(String[] args) {
        String s = "RLRSLL";
        System.out.println(countCollisions(s));
    }
    public static int countCollisions(String directions) {
        Stack<Character> stack = new Stack<>();

        char[] directionsArray = directions.toCharArray();
        for(int i = directionsArray.length - 1; i >= 0; i--) {
            stack.push(directionsArray[i]);
        }
//        for(char c : directions.toCharArray()) {
//            stack.push(c);
//        }

        int count = 0;

        while(!stack.isEmpty()) {
            if (stack.pop() == 'R') {
                if (stack.peek() == 'L') {
                    count += 2;
                    stack.set(stack.size()-1, 'S');
//                    stack.set(stack.indexOf(stack.peek()), 'S');
                } else if (stack.peek() == 'S') {
                    count += 1;
                } else {
                    count += 0;
                }
            }
            if (stack.peek() == 'L') {
//                stack.pop();
                count += 0;
//                continue;
            }
            if (stack.peek() == 'S') {
                stack.pop();
                if (stack.peek() == 'L') {
                    count += 1;
                    stack.set(stack.size()-1, 'S');
//                    stack.set(stack.indexOf(stack.peek()), 'S');
                } else if (stack.peek() == 'R') {
                    count += 0;
                }
            }
        }
        return count;
    }
}
