// Link: https://leetcode.com/problems/spiral-matrix/

import java.util.*;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] ar = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        spiralOrder(ar);
    }

    public static void spiralOrder(int[][] matrix) {

        int m = matrix.length;
        List<Integer> result = new ArrayList<>();
        
        if(m == 0)
            System.out.println(result);
        
        int n = matrix[0].length;
        
        int row_low = 0;
        int row_high = m;
        int col_low = 0;
        int col_high = n;
        
        int k;
        
        while(row_low < row_high && col_low < col_high) {
            for(k = col_low; k < col_high; k++)
                result.add(matrix[row_low][k]);
            row_low = row_low + 1;
            
            for(k = row_low; k < row_high; k++)
                result.add(matrix[k][col_high-1]);
            col_high = col_high - 1;
            
            if(row_low < row_high) {
                for(k = col_high - 1; k >= col_low; k--)
                    result.add(matrix[row_high - 1][k]);
                row_high = row_high - 1;
            }
            
            if(col_low < col_high) {
                for(k = row_high - 1; k >= row_low; k--)
                    result.add(matrix[k][col_low]);
                col_low = col_low + 1;
            }
        }
        
        System.out.println(result);
    }
}
