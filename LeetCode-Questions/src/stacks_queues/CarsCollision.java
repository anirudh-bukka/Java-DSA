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
        int ptr = stack.size();

        while (!stack.isEmpty()) {
//        while(ptr >= 0) {
            if(stack.peek() == 'R') {
                if(stack.indexOf(stack.peek() - 1) == 'L') {
                    count += 2;
                    stack.pop();
                    stack.set(stack.peek(), 'S');
                } else if(stack.get(stack.indexOf(stack.peek()) - 1) == 'S') {
                    count += 1;
                    stack.pop();
                } else if(stack.get(stack.indexOf(stack.peek()) - 1) == 'R') {
                    count += 0;
                }
                ptr--;
            } else if(stack.peek() == 'L') {
                if(stack.get(stack.indexOf(stack.peek()) - 1) == 'R') {
                    count += 0; // Because 'L' goes left and 'R' goes Right and they never meet;
                } else if(stack.get(stack.indexOf(stack.peek()) - 1) == 'S') {
                    count += 0;
                }
                stack.pop();
                ptr--;
            } else if(stack.peek() == 'S') {
                if(stack.get(stack.indexOf(stack.peek()) - 1) == 'L') {
                    count += 1;
                    stack.set(stack.peek() - 1, 'S');
                } else if(stack.get(stack.indexOf(stack.peek()) - 1) == 'R') {
                    count += 0; // Because 'S' remains but 'R' goes Right and they never meet;
                }
                stack.pop();
                ptr--;
            }
        }
        return count;
    }
}
