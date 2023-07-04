package arrays;
import java.util.*;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] ar = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        setZeros(ar);
    }

    public static void setZeros(int[][] ar) {

        HashSet<Integer> setRows = new HashSet<>();
        HashSet<Integer> setCols = new HashSet<>();

        for(int i = 0; i < ar.length; i++) {
            for(int j = 0; j < ar[0].length; j++) {
                if(ar[i][j] == 0) {
                    setRows.add(i);
                    setCols.add(j);
                }
            }
        }

        for(int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[0].length; j++) {
                if(setRows.contains(i) || setCols.contains(j)) {
                    ar[i][j] = 0;
                }
            }
        }

        for(int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[0].length; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
    }

}
