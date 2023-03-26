package arrays;

/*
Given a list of non-negative integers, find the minimum number of merge operations to make it a palindrome.
A merge operation can only be performed on two adjacent elements. The result of a merge operation is that the two
adjacent columns are replaced with their sum. To make any array a palindrome, we can simply apply the merge
operation n-1 times, where n is the size of the array (because a single-element array is always palindromic,
similar to a single-character string). In that case, the size of the array will be reduced to 1.
 */

public class MakePalindrome {
    public static void main(String[] args) {
        int ar[] = new int[]{1, 2, 4, 5, 9, 1} ;
        System.out.println("Count of minimum operations is "+ findMinOps(ar));
    }

    public static int findMinOps(int[] ar) {
        int ans = 0;
        int start = 0;
        int end = ar.length - 1;

        while(start <= end) {
            if (ar[start] == ar[end]) {
                start++;
                end--;
            }

            else if (ar[start] < ar[end]) {
                start++;
                ar[start] += ar[start - 1];
                ans++;
            }

            else {
                end--;
                ar[end] += ar[end + 1];
                ans++;
            }
        }
        return ans;
    }
}
