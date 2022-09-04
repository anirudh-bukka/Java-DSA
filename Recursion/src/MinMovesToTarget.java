// Link: https://leetcode.com/problems/minimum-moves-to-reach-target-score/

import java.lang.*;
import java.util.*;

public class MinMovesToTarget {

    public static void main(String[] args) {
        int target = 19, maxDoubles = 2;
        // output: 7

        System.out.println("Result: " + minMoves(target, maxDoubles));
    }

    public static int minMoves(int target, int maxDoubles) {
        int count = 0;
        int ans = countMoves(target, maxDoubles, count);
        return ans;
    }

    public static int countMoves(int target, int maxDoubles, int count) {

        if(target == 1)
            return count;

        if(maxDoubles != 0) {
            if(target%2 == 0 && target > 1)
                return countMoves(target/2, --maxDoubles, ++count);
            else
                return countMoves(--target, maxDoubles, ++count);
        }

        else if(maxDoubles == 0 && target > 1)
            return count + target;

        return count;
    }

}
