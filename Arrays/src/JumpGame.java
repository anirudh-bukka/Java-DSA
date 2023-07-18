public class JumpGame {
    public static void main(String[] args) {
        int[] ar = {2, 3, 1, 1, 4};
        System.out.println(isJumpPossible(ar));
    }

    public static boolean isJumpPossible(int[] ar) {
        int lastGoodIndex = ar.length - 1;

        for(int i = ar.length - 1; i >= 0; i--) {
            if(i + ar[i] >= lastGoodIndex) {
                lastGoodIndex = i;
            }
        }
        return lastGoodIndex == 0;
    }
}
