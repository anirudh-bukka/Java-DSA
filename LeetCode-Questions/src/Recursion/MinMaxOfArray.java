package Recursion;

/* Link: https://www.geeksforgeeks.org/recursive-programs-to-find-minimum-and-maximum-elements-of-array/

    Input: arr = {1, 4, 3, -5, -4, 8, 6};
    Output: min = -5, max = 8

 */
public class MinMaxOfArray {
    public static void main(String[] args) {
        int[] ar = {1, 4, 3, -5, -4, 8, 6};
        int n = ar.length;
        System.out.println(findMin(ar, n));
        System.out.println(findMax(ar, n));
    }

    static int findMin(int[] ar, int n) {
        if(n == 1)
            return ar[0];

        return Math.min(ar[n-1], findMin(ar, n-1));
    }

    static int findMax(int[] ar, int n) {
        if(n == 1)
            return ar[0];

        return Math.max(ar[n-1], findMax(ar, n-1));
    }
}
