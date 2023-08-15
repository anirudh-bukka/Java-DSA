// LeetCode: 128
import java.util.*;

public class LongestConsecutiveSeq {
    public static void main(String[] args) {
//        int[] nums = {100, 4, 200, 1, 3, 2};
        int[] nums = {9,1,4,7,3,-1,0,5,8,-1,6};
        System.out.println(longestConsecutive(nums));
    }
    public static int longestConsecutive(int[] nums) {
        if(nums.length == 0)
            return 0;
        if(nums.length == 1)
            return 1;
        Arrays.sort(nums);
        if(nums.length == 2 && nums[1]-nums[0] == 1)
            return 2;
        else if(nums.length == 2 && nums[1]-nums[0] != 1)
            return 1;

        HashMap<Integer, Integer> map = new HashMap<>();
        int l = 0, r = 0;

        for(int i = 0; i < nums.length-1; i++) {
            if(nums[i+1] - nums[i] != 1) {
                l++;
                r++;
            } else {
                r++;
                map.put(l, r-l+1);
            }
        }

        // System.out.println(map);

        return Collections.max(map.values());
    }
}


/*
if(nums.length == 0)
            return 0;
        if(nums.length == 1)
            return 1;

        Arrays.sort(nums);
        HashMap<Integer, Integer> map = new HashMap<>();
        int l = 0, r = 0;

        for(int i = 0; i < nums.length-1; i++) {
            if((nums[i+1] - nums[i] != 1) && (l < nums.length) && (r < nums.length)) {
                l++;
                r++;
            } else {
                r++;
                map.put(l, r-l);
            }
        }

        // System.out.println(map);

        return Collections.max(map.values())+1;
 */
