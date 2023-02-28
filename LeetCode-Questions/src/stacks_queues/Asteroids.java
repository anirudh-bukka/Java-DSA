package stacks_queues;

import java.util.Stack;

public class Asteroids {
    public static void main(String[] args) {
        int[] ar = {5, 10, -5};
        System.out.println(asteroidCollision(ar));
    }

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < asteroids.length; i++) {
            if(stack.isEmpty() || asteroids[i]>0) {
                stack.push(asteroids[i]);
            } else {
                while(true) {
                    int peek = stack.peek();
                    if(peek < 0) {
                        stack.push(asteroids[i]);
                        break;
                    } else if(peek == -asteroids[i]) {
                        stack.pop();
                        break;
                    } else if(peek > -asteroids[i]){
                        break;
                    } else {
                        stack.pop();
                        if(stack.isEmpty()) {
                            stack.push(asteroids[i]);
                            break;
                        }
                    }
                }
            }
        }

        int[] ans = new int[stack.size()];
        for(int i = stack.size()-1; i >= 0; i--) {
            ans[i] = stack.pop();
        }
        return ans;
    }
}
