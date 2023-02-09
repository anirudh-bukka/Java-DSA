public class NKnights {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        knights(board, 0, 0, n);
    }

    private static void knights(boolean[][] board, int row, int col, int remaining) {
        if(remaining == 0) {
            display(board);
            System.out.println();
            return;
        }

        if(row == board.length - 1 && col == board.length) {
            return;
        }

        if(col == board.length) {
            knights(board, row + 1, 0, remaining);
            return;
        }

        if(isSafe(board, row, col)) {
            board[row][col] = true;
            knights(board, row, col + 1, remaining - 1);
            board[row][col] = false;
        }

        // if not safe:
        knights(board, row, col + 1, remaining); // don't reduce the knights, because we did not place it on the board.

    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        if(isValid(board, row - 2, col - 1)) {
            if(board[row - 2][col - 1]) {
                return false;
            }
        }

        if(isValid(board, row - 1, col - 2)) {
            if(board[row - 1][col - 2]) {
                return false;
            }
        }

        if(isValid(board, row - 2, col + 1)) {
            if(board[row - 2][col + 1]) {
                return false;
            }
        }

        if(isValid(board, row - 1, col + 2)) {
            if(board[row - 1][col + 2]) {
                return false;
            }
        }

        return true;
    }

        // Just to check the row/col are not out of bound & avoid repeating this for every condition in `isSafe`.
    static boolean isValid(boolean[][] board, int row, int col) {
        if(row >= 0 && row < board.length && col >= 0 && col < board.length)
            return true;
        return false;
    }

    private static void display(boolean[][] board) {
        for(boolean[] ar : board) {
            for(boolean element : ar) {
                if(element) {
                    System.out.print("K ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }
}
