import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearchMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;

        System.out.println(Arrays.toString(search(matrix, target)));
    }

    static int[] binarySearch(int[][] matrix, int row, int colStart, int colEnd, int target) {
        while(colStart <= colEnd) {
            int mid = colStart + (colEnd - colStart)/2;

            if(matrix[row][mid] == target) {
                return new int[]{row, mid};
            }

            if(matrix[row][mid] < target) {
                colStart = mid + 1;
            } else {
                colEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length, cols = matrix[0].length;

        if(rows == 1)
            return binarySearch(matrix, 0, 0, cols-1, target);

        int rowStart = 0, rowEnd = matrix.length - 1, colMid = cols/2;

        // run the loop till 2 rows are remaining.
        if(rowStart < (rowEnd - 1)) {
            // we want to have 2 rows at this step
            int mid = rowStart + (rowEnd - rowStart) / 2;
            if (matrix[mid][colMid] == target) {
                return new int[]{mid, colMid};
            }
            if (matrix[mid][colMid] < target) {
                rowStart = mid;
            } else {
                rowEnd = mid;
            }
        }
        // now we have 2 rows.
        // check whether the target is in a col of the 2 rows
        if(matrix[rowStart][colMid] == target) {
            return new int[]{rowStart, colMid};
        }
        if(matrix[rowStart + 1][colMid] == target) {
            return new int[]{rowStart + 1, colMid};
        }

        // otherwise search in 1st half of top row
        if(target <= matrix[rowStart][colMid - 1]) {
            return binarySearch(matrix, rowStart, 0, colMid - 1, target);
        }
        // otherwise search in 2nd half of top row
        if(target >= matrix[rowStart][colMid + 1]) {
            return binarySearch(matrix, rowStart, colMid + 1, cols - 1, target);
        }
        // otherwise search in 1st half of bottom row
        if(target <= matrix[rowStart + 1][colMid - 1]) {
            return binarySearch(matrix, rowStart + 1, 0, colMid - 1, target);
        }
        // otherwise search in 2nd half of bottom row
        else {
            return binarySearch(matrix, rowStart + 1, colMid + 1, cols-1, target);
        }
    }
}
