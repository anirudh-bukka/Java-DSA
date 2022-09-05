public class BinarySearch {
    public static void main(String[] args) {
        int[] ar = {1, 3, 5, 7, 8, 9, 10};
        int target = 5;
        int low = 0;
        int high = ar.length - 1;
        int mid = low + (high - low) / 2;
        int ans1 = recursiveBinarySearch(ar, low, high, mid, target);
        System.out.println(ans1);
        int ans2 = nonRecursiveBinarySearch(ar, low, high, target);
        System.out.println("Element found at: " + ans2);
    }

    public static int recursiveBinarySearch(int[] ar, int low, int high, int mid, int target) {
        mid = low + (high - low) / 2;

        if(low <= high) {
            if(target == ar[mid])
                return mid;
            else if(target < ar[mid])
                return recursiveBinarySearch(ar, low, mid-1, mid, target);
            else if(target > ar[mid])
                return recursiveBinarySearch(ar, mid+1, high, mid, target);
        }
        return mid;
    }

    public static int nonRecursiveBinarySearch(int[] ar, int low, int high, int target) {
        int mid = low + (high - low)/2;
        while(low <= high) {
            mid = low + (high - low) / 2;

            if (target == ar[mid])
                return mid;

            else if (target < ar[mid])
                high = mid - 1;

            else if (target > ar[mid])
                low = mid + 1;
        }
        return mid;
    }
}