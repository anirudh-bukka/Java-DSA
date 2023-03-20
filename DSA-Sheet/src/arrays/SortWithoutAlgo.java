package arrays;

// Link: https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1

public class SortWithoutAlgo {
    public static void main(String[] args) {
        int[] ar = {0, 2, 1, 2, 0};
        sort(ar);
        for(int i : ar)
            System.out.print(i + " ");
    }

    public static void sort(int[] ar) {
        int start = 0, i = 0, end = ar.length-1, temp;

        while(i <= end) {
            switch (ar[i]) {
                case 0:
                    temp = ar[start];
                    ar[start] = ar[i];
                    ar[i] = temp;
                    start++;
                    i++;
                    break;

                case 1:
                    i++;
                    break;

                case 2:
                    temp = ar[i];
                    ar[i] = ar[end];
                    ar[end] = temp;
                    end--;
                    break;
            }
        }
    }
}
