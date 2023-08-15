/*
Each company's arrival and duration for presentations are given. Only one company presents at once.
Determine the maximum number of presentations that can be hosted.

    arrival = {1, 3, 3, 5, 7}
    duration = {2, 2, 1, 2, 1}

    result = 4;
 */

import java.util.*;

public class MaximumMeetings {
    public static void main(String[] args) {
        int[] ar = {1, 3, 3, 5, 7};
        int[] d = {2, 2, 1, 2, 1};

        System.out.println(countMax(ar, d));
    }

    public static int countMax(int[] ar, int[] d) {
        int count = 1;

        for(int i = 0, j = 0; i < ar.length-1 && j < d.length; i++, j++) {
            if(ar[i+1] >= ar[i] + d[j])
                count++;
        }
        return count;
    }
}
