import java.util.*;
public class TwoSumI {
//    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//    You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//    You can return the answer in any order.


        public static void main(String[] args) {
//            int[] nums = {2, 7, 11, 15};
            int[] nums = {3, 2, 4};

            System.out.println(Arrays.toString(twoSum(nums, 6)));
        }

        public static int[] twoSum(int[] nums, int target) {

            Arrays.sort(nums);

            int start = 0;
            int end = nums.length - 1;
            while (start < end) {
                int sum = nums[start] + nums[end];
                if (sum == target) {
                    return new int[]{ start++, end++ };
                }
                if (sum > target) {
                    end--;
                } else {
                    start++;
                }
            }

            return new int[]{ -1, -1 };
        }
    }

