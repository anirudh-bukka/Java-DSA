package SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;

public class SumOfSubarrays {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 5, 6};
        int n = ar.length;
        int k = 3;
        System.out.println(Arrays.toString(calculateSum(ar, n, k)));
    }

    public static int[] calculateSum(int[] ar, int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int left = 0, right = 1;
        int sum = ar[left];

        while (right < n) {
            if (right < k) {
                sum += ar[right];
                right += 1;
            }
            else if(right == k) {
                list.add(sum);
                sum = sum + ar[right] - ar[left];
                list.add(sum);
                right++;
            }
            else if(right > k) {
                left++;
                sum = sum + ar[right] - ar[left];
                list.add(sum);
                right++;
            }
        }
//      *********************************************
        int[] result = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
            result[i] = list.get(i);
        return result;
    }
}
