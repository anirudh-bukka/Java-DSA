/*
    You are given n pairs of numbers. In every pair, the first number is always smaller than the second number.
    A pair (c, d) can follow another pair (a, b) if b < c. Chain of pairs can be formed in this fashion.
    Find the longest chain which can be formed from a given set of pairs.

    Link: https://www.geeksforgeeks.org/maximum-length-chain-of-pairs-dp-20/
 */

import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthChainOfPairs {
    public static void main(String[] args) {
        int[][] ar = {{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};
        System.out.println(func(ar, ar.length));
    }

    public static int func(int[][] ar, int n) {
        Arrays.sort(ar, Comparator.comparingDouble(x -> x[1]));
        int count = 1;
        int lastSelected = ar[0][1];

        for(int i = 1; i < n; i++) {
            if(ar[i][0] > lastSelected) {
                count++;
                lastSelected = ar[i][1];
            }
        }
        return count;
    }
}
