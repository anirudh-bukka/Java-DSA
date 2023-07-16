package binarysearch;

public class MountainArray {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 4, 2, 1};
        System.out.println(findPeak(ar));
    }
    public static int findPeak(int[] ar) {
        int start = 0;
        int end = ar.length - 1;

        while(start <= end) {
            int mid = start + (end - start)/2;

            if((mid < ar.length-1)) {
                return mid-1;
            } else if(ar[mid] > ar[mid + 1]) {
                start = mid+1;
            }
        }
        return -1;
    }
}
