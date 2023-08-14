// LeetCode 80
import java.util.*;

public class RemoveDuplicatesII {
    public static void main(String[] args) {
//        int[] ar = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        int[] ar = {1, 1, 1, 2, 2, 3};
        System.out.println(length(ar));
    }

    public static int length(int[] ar) {
        int l = 0, r = 0, n = ar.length;

        while(r < n) {
            int count = 1;
            while((r+1 < n) && (ar[r] == ar[r+1])) {
                r += 1;
                count += 1;
            }
            int min = Math.min(2, count);
            for(int i = 0; i < min; i++) {
                ar[l] = ar[r];
                l += 1;
            }
            r += 1;
        }
        return l;
    }
}
