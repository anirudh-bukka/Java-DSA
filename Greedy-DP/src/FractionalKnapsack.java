import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int[] value = {60, 100, 120};
        int[] weight = {10, 20, 30};
        int capacity = 50;

        System.out.println(func(value, weight, capacity, value.length));
    }

    public static int func(int[] value, int[] weight, int capacity, int n) {
        double[][] ratio = new double[n][2];
        for(int i = 0; i < n; i++) {
            ratio[i][0] = i;
            ratio[i][1] = value[i]/weight[i];
        }
        Arrays.sort(ratio, Comparator.comparingDouble(x -> x[1]));

        int finalValue = 0;
        for(int i = ratio.length-1; i >= 0; i--) {
            int idx = (int)ratio[i][0];
            if(capacity >= weight[idx]) {
                finalValue += value[idx];
                capacity -= weight[idx];
            } else {
                finalValue += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        return finalValue;
    }
}
