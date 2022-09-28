public class BottomLeftTriangle {
    public static void main(String[] args) {
        int rows = 3;
        int columns = 0;
        generateTriangle(rows, columns);
    }

    static void generateTriangle(int r, int c) {
        if(r == 0)
            return;
        if(c < r) {
            generateTriangle(r, c+1);
            System.out.print("*");
        }
        else {
            generateTriangle(r-1, 0);
            System.out.println();
        }
    }
}
/*

*
**
***

*/