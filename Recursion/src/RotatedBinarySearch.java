public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] ar = {5, 6, 7, 8, 9, 1, 2, 3, 4};
        int target = 4;
        System.out.println(search(ar, target, 0, ar.length-1));
    }

    static int search(int[] ar, int target, int start, int end) {
        int mid = start + (end - start)/2;

        if(target == ar[mid])
            return mid;

        if(ar[start] <= ar[mid]) {
            if(target < ar[mid] && target >= ar[start])
                search(ar, target, start, mid-1);
            else
                return search(ar, target, mid+1, end);
        }

        if(target <= ar[end] && target > ar[mid]) {
            if(ar[end] >= ar[mid])
                return search(ar, target, mid+1, end);
        }

        return search(ar, target, start, mid-1);
    }
}