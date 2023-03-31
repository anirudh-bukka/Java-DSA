// Link: https://leetcode.com/problems/jump-game/ & LeetCode #45.

public class JumpGame {
    public static void main(String[] args) {
        int[] ar = {2,3,1,1,4};
//        int[] ar = {2,0,0};
        int n = ar.length;
        System.out.println(isPossible(ar, n));
        System.out.println(countMinSteps(ar, n));
    }

    public static boolean isPossible(int[] ar, int n) {
        int goal = n - 1;
        for(int i = n - 1; i >= 0; i--) {
            if(i + ar[i] >= goal)
                goal = i;
        }
        return goal == 0;
    }

    public static int countMinSteps(int[] ar, int n) {
        int count = 0, left = 0, right = 0, farthest;

        while(right < ar.length - 1) {
            farthest = 0;
            for(int i = left; i <= right; i++) {
                farthest = Math.max(farthest, i + ar[i]);
            }
            left = right + 1;
            right = farthest;
            count += 1;
        }
        return count;




        //        int count = 0;
//        int goal = n - 1;
////        for(int i = n-1; i >= 0; i--) {
////            if(i + ar[i] >= goal) {
////                goal = i;
////                count++;
////            }
////        }
//        for(int i = 0; i < n; i++) {
//            if(i + ar[i] == goal) {
//                count++;
//                break;
//            } else if
//        }
//
//        return count;
    }
}