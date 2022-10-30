package backtracking;
// Link: https://leetcode.com/problems/word-search/

public class WordSearch {
    public static void main(String[] args) {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        String word = "ABCCED";

        System.out.println(exist(board, word));
    }

    static boolean exist(char[][] board, String word) {
        if(word == null)
            return false;

        char ch = word.charAt(0);


    }
}
