package binarysearch;

import java.util.*;

public class LastOccurance {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 2, 3, 1, 5, 1};
        Arrays.sort(ar);
        System.out.println(Arrays.toString(whatToSearch(ar, 3)));
    }

    public static int[] whatToSearch(int[] ar, int target) {
        int[] ans = {-1, -1};
        int start = search(ar, target, true);
        int last = search(ar, target, false);

        ans[0] = start;
        ans[1] = last;
        return ans;
    }

    public static int search(int[] ar, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = ar.length-1;

        while(start <= end) {
            int mid =  start + (end - start)/2;

            if(target < ar[mid]) {
                end = mid - 1;
            } else if(target > ar[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if(findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
