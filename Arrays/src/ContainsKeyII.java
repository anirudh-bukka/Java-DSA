// Leetcode 219

import java.util.*;

public class ContainsKeyII {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int k = 3;
        System.out.println(containsKey(nums, k));
    }

    public static boolean containsKey(int[] ar, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < ar.length; i++) {
            if(map.containsKey(ar[i]) && (Math.abs(map.get(ar[i]) - i) <= k))
                return true;
            else
                map.put(ar[i], i);
        }
        return false;
    }
}
