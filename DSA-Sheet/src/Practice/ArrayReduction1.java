package Practice;

import java.util.HashMap;

public class ArrayReduction1 {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3};
        /*
        1 + 2 = 3
        3 + 3 = 6
        6 + 4 = 10
        3 + 6 + 10 = 19
        */
        System.out.println(reduceArray(ar, ar.length));
    }

    public static int reduceArray(int[] ar, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(ar[0], ar[0]);
        for(int i = 1; i < n; i++) {
            map.put(ar[i], ar[i] + map.get(ar[i-1]));
        }

        int sum = 0;
        for(int i : map.values()) {
            sum += i;
        }
        return sum-ar[0];
    }
}
