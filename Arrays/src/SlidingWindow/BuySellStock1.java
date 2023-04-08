package SlidingWindow;

import java.util.ArrayList;
import java.util.Collections;

public class BuySellStock1 {
    public static void main(String[] args) {
        int[] ar = {7,6,4,3,1};
//        int[] ar = {7,1,5,3,6,4};
        int n = ar.length;
        System.out.println(maxProfit(ar, n));
    }

    public static int maxProfit(int[] prices, int n) {
        int left = 0, right = 1;
        int profit = 0;
        int maxP = 0;
        while(right < n) {
            if(prices[right] <= prices[left]) {
                left = right;
            } else {
                profit = prices[right] - prices[left];
                maxP = Math.max(maxP, profit);
            }
            right += 1;
        }

        return maxP;
    }
}
