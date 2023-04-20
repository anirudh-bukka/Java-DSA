package greedy;
// Link: https://practice.geeksforgeeks.org/problems/n-meetings-in-one-room-1587115620/1

import java.util.*;

public class NMeetings {
    public static void main(String[] args) {
//        int start[] = {1,3,0,5,8,5};
//        int end[] =  {2,4,6,7,9,9};

        int[] start = {75250, 50074, 43659, 8931, 11273, 27545, 50879, 77924};
        int[] end = {112960, 114515, 81825, 93424, 54316, 35533, 73383, 160252};

        int n = start.length;
        System.out.println(maxMeetings(start, end, n));
    }

    public static int maxMeetings(int start[], int end[], int n) {
        ArrayList<Integer> ans = new ArrayList<>();

        // create a 2D array
        int[][] activities = new int[n][3];
        for(int i = 0; i < n; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // sort the array based on 'end'
        Arrays.sort(activities, Comparator.comparingDouble(x -> x[2]));

        int maxAct = 1;
        ans.add(activities[0][0]);

        int lastEnd = activities[0][2];

        for(int i = 0; i < n; i++) {
            if(activities[i][1] >= lastEnd) {
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }

        return maxAct;
    }
}
