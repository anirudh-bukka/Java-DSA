package greedy;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        int[] ar = {-1, -1, -2, 4, 3};
        System.out.println(maximumProductSubarray(ar, ar.length));
    }

    public static int maximumProductSubarray(int[] ar, int n) {
        int maxProd = 1;
        int current = ar[0];

        for(int i : ar) {
            current *= i;
            maxProd = Math.max(current, maxProd);
            if(current < 0)
                current = 1;
        }
        return maxProd;
    }
}
