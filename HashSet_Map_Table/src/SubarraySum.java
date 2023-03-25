import java.util.HashMap;

public class SubarraySum {
    public static void main(String[] args) {
        int[] ar = {10, 2, -2, -20, 10};
        int k = -10;
        System.out.println(countSubarrays(ar, k));
    }

    public static int countSubarrays(int[] ar, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int ans = 0, sum = 0;
        for(int i = 0; i < ar.length; i++) {
            sum += ar[i];

            if(map.containsKey(sum-k))
                ans += map.get(sum-k);

            if(map.containsKey(sum))
                map.put(sum, map.get(sum) + 1);
            else
                map.put(sum, 1);
        }

        return ans;
    }
}