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

//        if(end - start == 1) {
//            return ar[start] + diff;
//        }
        while(start < end) {
            if (first < second) {
                //            start = mid + 1;
                //            if(end - start == 1)
                //                return(ar[start] + diff);
                ////                  break;
                //            else {
                //                return missingNumber(ar, n, start, end);
                return missingNumber(ar, n, mid + 1, end);
                //            }
            } else {
                //            end = mid - 1;
                //            if (end - start == 1)
                //                return(ar[start] + diff);
                ////                ans = ar[start] + diff;
                //            else {
                //                return missingNumber(ar, n, start, end);
                return missingNumber(ar, n, start, mid - 1);
                //            }
            }
        }
        return ar[start-1] + diff;
    }
}
