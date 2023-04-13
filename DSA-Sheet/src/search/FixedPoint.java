package search;
// Link: https://www.geeksforgeeks.org/find-a-fixed-point-in-a-given-array/

public class FixedPoint {
    public static void main(String[] args) {
//        int[] ar = {-10, -5, 0, 3, 7};
        int[] ar = {0, 1, 2, 3, 4};
//        int[] ar = {-10, -5, 3, 4, 7, 9};
        System.out.println(findFixedPoint(ar));
    }

    public static int findFixedPoint(int[] ar) {
        int start = 0, end = ar.length - 1;

        while(start <= end) {
            int mid = start + (end - start)/2;

            if(ar[mid] < 0) {
                start = mid + 1;
            }

            if(ar[mid] == 0) {
                if (mid == 0) {
                    return mid;
                }
            } else {
                start = mid + 1;
            }

            if(ar[mid] == mid)
                return mid;
        }
        return -1;
    }
}
