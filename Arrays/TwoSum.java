import java.util.*;

class TwoSum {

    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 5};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(ar, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> num_map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];

            if(num_map.containsKey(difference))
                return new int[]{num_map.get(difference), i};

            num_map.put(nums[i], i);
        }

        throw new IllegalArgumentException("None");
    }
}