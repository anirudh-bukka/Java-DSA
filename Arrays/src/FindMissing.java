import java.util.*;

public class FindMissing {
    public static void main(String[] args) {
//        int n = 5;
//        int[] ar = {5, 7, 9, 11, 15};
        int n = 6;
        int[] ar = {5, 10, 15, 20, 25, 35};
        System.out.println(missingNumber(ar, n, 0, n-1));
    }
    public static int missingNumber(int[] ar, int n, int start, int end) {
        int diff = ar[1] - ar[0];

        int mid = start + (end - start)/2;
        int first = ar[mid] - ar[start];
        int second = ar[end] - ar[mid];

        while(start < end) {
            if (first < second) {
                return missingNumber(ar, n, mid + 1, end);
            } else {
                return missingNumber(ar, n, start, mid - 1);
            }
        }
        return ar[start-1] + diff;
    }
}
