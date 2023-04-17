package arrays;

public class SpiralTraversal {
    public static void main(String[] args) {
        int[][] ar = {{1, 2, 3, 4, 5, 6},
                    {20, 21, 22, 23, 24, 7},
                    {19, 32, 33, 34, 25, 8},
                    {18, 31, 36, 35, 26, 9},
                    {17, 30, 29, 28, 27, 10},
                    {16, 15, 14, 13, 12, 11}};
        traverseFunction(ar);
    }

    public static void traverseFunction(int[][] ar) {
        int top = 0, right = ar[0].length-1, left = 0, bottom = ar.length-1;

        while(top <= bottom && left <= right) {
            for(int i = left; i <= right; i++) {
                System.out.print(ar[top][i] + " ");
            }
            top++;

            for(int i = top; i <= bottom; i++) {
                System.out.print(ar[i][right] + " ");
            }
            right--;

            if(top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(ar[bottom][i] + " ");
                }
                bottom--;
            }

            if(left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(ar[i][left] + " ");
                }
                left++;
            }
        }
    }
}
