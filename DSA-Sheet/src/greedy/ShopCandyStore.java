package greedy;
// Link: https://practice.geeksforgeeks.org/problems/shop-in-candy-store1145/1

import java.util.*;

public class ShopCandyStore {
    public static void main(String[] args) {
//        int[] ar = {3, 2, 1, 4};
        int[] ar = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = ar.length, k = 1;
        System.out.println(func(ar, n, k));
    }

    public static ArrayList<Integer> func(int[] candies, int n, int k) {
//        Arrays.sort(candies, candies+n);

        // for minimum spend
        int maxExpense = 0;
        for(int i = candies.length - 1; i >= k; i--) {
            maxExpense += candies[i];
        }

        // for minimum spend
        int minExpense = 0;
        for(int i = 0; i < candies.length - k; i++) {
            minExpense += candies[i];
        }

        ArrayList<Integer> alist = new ArrayList<>();
        alist.add(minExpense);
        alist.add(maxExpense);

        return alist;
    }
}
