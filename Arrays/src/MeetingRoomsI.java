import java.util.*;

public class MeetingRoomsI {
    public static void main(String[] args) {
        int[] ar = {0, 30, 5, 10, 15, 20};
        System.out.println(isPossible(ar));
    }

    public static boolean isPossible(int[] ar) {
        for(int i = 1; i < ar.length-1; i++) {
            if(ar[i] > ar[i+1])
                return false;
        }
        return true;
    }
}
