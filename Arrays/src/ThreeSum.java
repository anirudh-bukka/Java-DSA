import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] ar = {-1, 0, 1, 2, -1, -4};
        int target = 0;
        System.out.println(threeSum(ar, target));
    }

    public static List<List<Integer>> threeSum(int[] ar, int target) {
        Arrays.sort(ar);
        List<List<Integer>> out_arr = new LinkedList<>();

        for(int i = 0; i < ar.length - 2; i++) {
            if(i == 0 || ar[i] != ar[i-1]) {
                int low = i + 1;
                int high = ar.length - 1;
                int sum = 0 - ar[i];

                while(low < high) {
                    if(ar[low] + ar[high] == sum) {
                        out_arr.add(Arrays.asList(ar[i], ar[low], ar[high]));
                        while(low < high && ar[low] == ar[low + 1])
                            low++;
                        while(low < high && ar[high] == ar[high - 1])
                            high--;
                        low++;
                        high--;
                    }
                    else if(ar[low] + ar[high] > sum)
                        high--;
                    else
                        low++;
                }
            }
        }
        return out_arr;
    }
}
