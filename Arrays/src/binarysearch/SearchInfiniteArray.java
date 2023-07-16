package binarysearch;

import java.util.*;

public class SearchInfiniteArray {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3 ,4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};
        System.out.println(findStartAndEnd(ar, 14));
    }

    public static int findStartAndEnd(int[] ar, int target) {
//        int[] window = {-1, -1};
        int start = 0;
        int end = 1;
        int newStart = 0;
        while(target > ar[end]) {
            if(target > end) {
                newStart = end + 1;
                end = end + (end - start + 1)*2;
                start = newStart;
            }
        }
        return searchFunc(ar, target, start, end);
    }

    public static int searchFunc(int[] ar, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end - start)/2;

            if(target == ar[mid]) {
                return mid;
            } else if (target < ar[mid]) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return -1;
    }
}
