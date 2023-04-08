package SlidingWindow;
// find the length of the shortest subset whose sums are <= k

import java.util.ArrayList;

public class SumOfSubsets2 {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 5, 6};
        int n = ar.length;
        int k = 7;
        System.out.println(minLengthSubarray(ar, n, k));
    }

    public static int minLengthSubarray(int[] ar, int n, int k) {
        int right = 1, left = 0, count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        int minLength = Integer.MAX_VALUE;
        int sum = ar[left];

        while(right < n) {
            sum += ar[right];
            right++;
            if(sum < k) {
                sum += ar[right];
                right++;
                count++;
                minLength = Math.min(minLength, count);
            } else {
                left++;
            }
        }
    }
}
