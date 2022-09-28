public class UpperLeftTriangle {
    public static void main(String[] args) {
        int rows = 4;
        int columns = 0;
        generateTriangle(rows, columns);
    }

    static void generateTriangle(int r, int c) {
        if(r == 0) {
            return;
        }
        if(c < r) {
            System.out.print("*");
            generateTriangle(r, c+1);
        }
        else {
            System.out.println();
            generateTriangle(r-1, 0);
        }

    }
}
