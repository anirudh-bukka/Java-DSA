import java.util.Arrays;

public class ReshapeMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2},{3,4}};
        int r = 1, c = 4;
        System.out.println(Arrays.toString(matrixReshape(mat, r, c)));
    }
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;
        if(r*c!=m*n)
            return mat;
        int [][] ans=new int[r][c];
        for(int i=0;i<r*c;i++)
            ans[i/c][i%c]=mat[i/n][i%n];
        return ans;
    }
}
