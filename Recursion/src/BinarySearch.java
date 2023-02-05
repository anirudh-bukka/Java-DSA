public class BinarySearch {
    public static void main(String[] args) {
        int[] ar = {1, 3, 5, 2, 4, 9, 0};
        int length = ar.length;
        int target = 9;
        int end = ar.length-1;
        int start = 0;
        int mid = start + (end - start) / 2;
        int ans1 = withoutRecursion(ar, length, target, end, start, mid);
        System.out.println(target + " is found at " + ans1);
        int ans2 = withRecursion(ar, length, target, end, start, mid);
        System.out.println(target + " is found at " + ans2);
    }

    static int withRecursion(int[] ar, int length, int target, int end, int start, int mid) {
        while (start <= end) {

            mid = start + (end - start) / 2;

            if(target == ar[mid])
                return mid;
            else if(target < ar[mid])
                return withRecursion(ar, length, target, mid-1, start, mid);
            else
                return withRecursion(ar, length, target, end, mid+1, mid);
        }
        return mid;
    }


    static int withoutRecursion(int[] ar, int length, int target, int end, int start, int mid) {
        while(start <= end) {

            mid = start + (end - start) / 2;

            if(target == ar[mid])
                return mid;
            else if(target < ar[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return mid;
    }
}
