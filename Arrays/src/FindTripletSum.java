import java.util.*;

import static java.lang.Math.abs;

public class FindTripletSum {
    public static void main(String[] args) {
        int[] ar = {-1, 2, 1, -4};
        int target = 1;
        System.out.println(findClosestSum(ar, target));
    }

    public static int findClosestSum(int[] ar, int target) {
        Arrays.sort(ar);

        int closestSum = Integer.MAX_VALUE;

        for(int i = 0; i < ar.length - 2; i++) {
            int start = i + 1, end = ar.length - 1;
            while(start < end) {

                int sum = ar[i] + ar[start] + ar[end];

                if(abs(target - sum) < abs(target - closestSum))
                    closestSum = sum;

                if(sum > target)
                    end--;
                else
                    start++;
            }
        }
        return closestSum;
    }
}
