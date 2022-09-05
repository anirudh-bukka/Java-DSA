// Program to find unique element in array:

public class UniqueElementInArray {
    public static void main(String[] args) {
        int[] ar = {1, 3, 4, 2, 3, 4, 1, 5};
        System.out.println(ans(ar));
    }

    public static int ans(int[] ar) {
        int unique = 0;
        for(int i : ar)
            unique ^= i;

        return ar[unique];
    }
}
