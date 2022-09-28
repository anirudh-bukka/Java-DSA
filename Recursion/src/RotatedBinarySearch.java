public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] ar = {5, 6, 7, 8, 9, 1, 2, 3, 4};
        int target = 8;
        System.out.println(search(ar, target, 0, ar.length-1));
    }

    static int search(int[] ar, int target, int start, int end) {
        if (start > end)
            return -1;

        int mid = start + (end - start) / 2;
        if (ar[mid] == target)
            return mid;

        if (ar[start] <= ar[mid]) {
            if (target >= ar[start] && target <= ar[mid]) // this means, this part of the array is sorted.
                search(ar, target, start, mid - 1);

            else
                return search(ar, target, mid + 1, end);
        }

        if(target >= ar[mid] && target <= ar[end])
            return search(ar, target, mid + 1, end);

        return search(ar, target, start, mid - 1);
    }

}
