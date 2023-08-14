import java.util.*;

public class CountMinSteps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }

//        System.out.println(minSteps(ar));
        int sum = 0;
        for(int i : ar) {
            sum += i;
        }

        int size = ar.length;
        int avg = sum / size;

        int nearest = nearest(ar, avg);
        System.out.println(nearest);
    }

    public static int nearest(int[] ar, int avg) {
        Arrays.sort(ar);
        int start = 0;
        int end = ar.length - 1;
        int mid = start + (end - start)/2;
        int nearest = 0;

        if(ar.length % 2 != 0) {
            nearest = ar[mid];
        } else {
//            if(Math.abs(ar[mid-1] - avg) < Math.abs(ar[mid+1] + avg))
//                nearest = ar[mid-1];
//            else
//                nearest = ar[mid+1];
            nearest = Math.max(ar[mid-1], ar[mid+1]);
        }
        System.out.println(nearest);
        int minSteps = 0;
        for(int i = 0; i < ar.length; i++) {
            minSteps += Math.abs(ar[i] - nearest);
        }

        return minSteps;
    }

    public static int minSteps(int[] ar) {
        int sum = 0;
        for(int i : ar) {
            sum += i;
        }

        int n = ar.length;
        int avg = sum / n;

        int minSteps = 0;
        for(int i = 0; i < n; i++) {
            minSteps += Math.abs(ar[i] - avg);
        }

        return minSteps;
    }
}
