package arrays;
import java.util.*;

public class RemoveDupsFromSortedArray {
    public static void main(String[] args) {
        int[] ar = {1, 2, 2, 2, 3, 3};
        System.out.println(removeDups(ar));
        System.out.println(removeDupsInplace(ar));
    }

    public static int removeDupsInplace(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == nums[i-1]) {
                if(count >= 2)
                nums[i] = nums[i+1];
                count = 0;
            } else {
                count++;
            }
        }
        return nums.length;
    }

    public static int removeDups(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : nums) {
            if(!map.containsKey(i))
                map.put(i, 1);
            else if(map.get(i) < 2) {
                map.put(i, map.get(i) + 1);
            }
        }

        int size = 0;
        for(int i : map.keySet()) {
            size += map.get(i);
        }

        int[] ans = new int[size];
        int ind = 0;
        for(int i : map.keySet()) {
            for(int j = 0; j < map.get(i) && ind < size; j++) {
                ans[ind++] = i;
            }
        }
        return ans.length;
    }
}