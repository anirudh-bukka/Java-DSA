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

        for(char c : directions.toCharArray()) {
            stack.push(c);
        }

        int count = 0;

        if(stack.pop() == 'R') {
            if(stack.peek() == 'L') {
                count += 2;
                stack.set(-1, 'S');
            } else if(stack.peek() == 'S') {
                count += 1;
            } else {
                count += 0;
            }
        } else if(stack.pop() == 'L') {
            count += 0;
        } else if(stack.pop() == 'S') {
            if(stack.peek() == 'L') {
                count += 1;
                stack.set(-1, 'S');
            } else if()
        }
    }
}
