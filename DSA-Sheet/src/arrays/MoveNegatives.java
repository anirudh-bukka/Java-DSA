package arrays;

public class MoveNegatives {
    public static void main(String[] args) {
        int[] ar = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        move(ar);
        for(int i : ar)
            System.out.print(i + " ");
    }

    public static void swap(int[] ar, int i, int j) {
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }

    public static void move(int[] ar) {
        int start = 0;
        int end = ar.length-1;
        while(start <= end) {
            if(ar[start] <= 0)
                start++;
            else
                swap(ar, start, end--);
        }
    }
}
