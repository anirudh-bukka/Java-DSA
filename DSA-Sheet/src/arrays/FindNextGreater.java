package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class FindNextGreater {
    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < nums2.length; i++) {
            list2.add(nums2[i]);
        }

        for(int i = 0; i < nums1.length; i++) {
            int index = list2.indexOf(nums1[i]);
            for(int j = index; j < nums2.length; j++) {
                if(nums2[j] > nums1[i]) {
                    result.add(nums2[j]);
                    break;
                }
                if(j == nums2.length -1 && !(nums2[j]>nums1[i])) {
                    result.add(-1);
                    break;
                }
            }
        }

        int[] resultArray = new int[result.size()];
        for(int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }
        return resultArray;
    }
}
