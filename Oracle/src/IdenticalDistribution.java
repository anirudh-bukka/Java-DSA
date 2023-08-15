import java.util.*;
// https://www.linkedin.com/posts/vinay-kenguva-2894401a0_interviewexperience-chalo-placementpreparation-activity-7097096087676567552-fc9U?utm_source=share&utm_medium=member_desktop

public class IdenticalDistribution {
    public static void main(String[] args) {
//        int[] receiver = {3, 1, 4, 2};
        int[] receiver = {2, 4, 1, 5, 3};
        int k = 6;
        System.out.println(findLastReceiver(receiver, k));
    }
    public static int findLastReceiver(int[] ar, int k) {
        int lastReceiver = 1, i = 1;

        while(k > 0) {
            lastReceiver = ar[i-1];
            i = ar[i-1];
//            lastReceiver = ar[i-1];
            k--;
        }

        return lastReceiver;
    }
}