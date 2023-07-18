import java.util.*;

public class VerifyPatternFromGrid {
    public static void main(String[] args) {
        char[][] board = {{'a', 'g', 'b', 'c'},
                            {'q', 'e', 'e', 'l'},
                            {'g', 'b', 'k', 's'}};
        String target = "bek";

        System.out.println(wordExists("", board, 0, 0, target.toCharArray(), 0));
    }

    public static String wordExists(String p, char[][] board, int r, int c, char[] target, int i) {
        if(r == board.length - 1 && c == board[0].length - 1) {
            return p;
        }

        if(board[r][c] == target[i]) {
            board[r][c] = '_';
            wordExists(p+target[i], board, r, c, target, i+1);
        }
        else {
            if(board[r+1][c] == target[i]) {
                board[r][c] = '_';
                wordExists(p+target[i], board, r, c, target, i+1);
            }
            else if(board[r][c+1] == target[i]) {
                board[r][c] = '_';
                wordExists(p+target[i], board, r, c, target, i+1);
            }
        }
        return wordExists(p, board, r+1, c+1,target, i);
    }
}
