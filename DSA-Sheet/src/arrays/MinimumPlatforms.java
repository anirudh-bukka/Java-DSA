package arrays;

import java.util.ArrayList;

public class MinimumPlatforms {
    public static void main(String[] args) {

        int n = 6;
        int[] ar = {900, 940, 950, 1100, 1500, 1800};
        int[] dep = {910, 1200, 1120, 1130, 1900, 2000};

        System.out.println(minPlatforms(ar, dep, n));
    }

    public static int minPlatforms(int[] ar, int[] dep, int n) {
        int[] platforms = new int[2361]; // since day = 0000 to 2359 = 2360 hrs total
        int count = 0;
        int minRequired = 0;

        for(int i = 0, j = 0; i < n; ) {
           if(ar[i] <= dep[j]) {
               count++;
               minRequired = Math.max(count, minRequired);
               i++;
           } else {
               count--;
               j++;
           }
        }

        return minRequired;
    }
}
