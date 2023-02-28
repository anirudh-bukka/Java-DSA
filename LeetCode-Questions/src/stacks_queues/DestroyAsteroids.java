package stacks_queues;

import java.util.*;

public class DestroyAsteroids {
    public static void main(String[] args) {
        int[] asteroids = {4,9,23,4};
//        int[] asteroids = {3,9,19,5,21};
//        int[] asteroids = {156,197,192,14,97,160,14,5};
        int mass = 5;
        System.out.println(asteroidsDestroyed(mass, asteroids));
    }
    public static boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        long newMass = mass;
        Arrays.sort(asteroids);

        for(int i = asteroids.length - 1; i >= 0; i--) {
            stack.push(asteroids[i]);
        }

         while(!stack.isEmpty()) {
             int peek = stack.peek();
             if(newMass >= peek) {
                 newMass += stack.pop();
             } else {
                 return false;
             }
         }
         return true;
    }
}
