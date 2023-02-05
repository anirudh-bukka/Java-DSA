//package slidingwindow;
//import java.util.*;
//
//public class FruitBasket {
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int t = in.nextInt();
//
//        for(int i = 0; i < t; i++) {
//            int n = in.nextInt();
//            int[] A = new int[n];
//            for(int j = 0; j < n; j++) {
//                int A[j] =
//            }
//        }
//    }
//
//    public int totalFruit(int[] fruits) {
//        // Hash map 'basket' to store the types of fruits.
//        Map<Integer, Integer> basket = new HashMap<>();
//        int left = 0, right;
//
//        // Add fruit from right side (right) of the window.
//        for (right = 0; right < fruits.length; ++right) {
//            basket.put(fruits[right], basket.getOrDefault(fruits[right], 0) + 1);
//
//            // If the current window has more than 2 types of fruit,
//            // we remove one fruit from the left index (left) of the window.
//            if (basket.size() > 2) {
//                basket.put(fruits[left], basket.get(fruits[left]) - 1);
//                if (basket.get(fruits[left]) == 0)
//                    basket.remove(fruits[left]);
//                left++;
//            }
//        }
//
//        // Once we finish the iteration, the indexes left and right
//        // stands for the longest valid subarray we encountered.
//        return right - left;
//    }
//}
