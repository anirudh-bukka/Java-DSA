import java.util.*;

public class InversionCount {
    public static void main(String[] args) {
        int[] ar = {2, 4, 1, 3, 5};
//        int[] ar = {8, 4, 2, 1};
        int n = ar.length;
        System.out.println(getInvCount(ar, n));
        System.out.println("Wrong answer and approach (HashMap): " + findInversion(ar, n));
    }

    static int getInvCount(int[] arr, int n) {
        int inv_count = 0;
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (arr[i] > arr[j])
                    inv_count++;

        return inv_count;
    }

    public static int findInversion(int[] ar, int n) {
        HashMap<Integer, Integer> original = new HashMap<>();
        HashMap<Integer, Integer> sorted = new HashMap<>();

        for(int i = 0; i < n; i++) {
            original.put(ar[i], i);
        }

        Arrays.sort(ar);
        for(int i = 0; i < n; i++) {
            sorted.put(ar[i], i);
        }

        int count = 0;
        for(int key : original.keySet()) {
            if(original.get(key) != sorted.get(key))
                count++;
        }

        return count;
    }
}
