package search;

import java.util.Arrays;

public class FirstAndLastIndex {
    public static void main(String[] args) {
//        int[] ar = {1, 2, 3, 3, 3, 3, 3, 3, 4, 5};
//        int target = 3;
        int[] ar = {1, 2, 2, 2, 3, 4, 5, 6, 7, 8};
        int target = 2;
        System.out.println(Arrays.toString(searchRange(ar, target)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = firstIndex(nums, target);
        result[1] = lastIndex(nums, target);
        return result;
    }

    public static int firstIndex(int[] nums, int target) {
        int index = -1, start = 0, end = nums.length - 1;

        while(start <= end) {
            int mid = start + (end - start)/2;

            if(target <= nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

            if(target == nums[mid]) {
                index = mid;
            }
        }

        return index;
    }

    public static int lastIndex(int[] nums, int target) {
        int index = -1, start = 0, end = nums.length - 1;

        while(start <= end) {
            int mid = start + (end - start)/2;

            if(target >= nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

            if(target == nums[mid])
                index = mid;
        }

        return index;
    }
}
