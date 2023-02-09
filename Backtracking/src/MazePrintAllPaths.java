import java.util.Arrays;

public class MazePrintAllPaths {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        int[][] path = new int[board.length][board[0].length];
        allPathPrint("", board, 0, 0, path, 1);
    }

    static void allPathPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
        if(r == maze.length-1 && c == maze[0].length-1) {
            path[r][c] = step; // Because this last/base case is also a step.
            for(int[] ar : path) {
                System.out.println(Arrays.toString(ar));
            }
            System.out.println(p);
            System.out.println();
            return;

        }

        if(!maze[r][c])
            return;

        maze[r][c] = false;
        path[r][c] = step;

        if(r < maze.length - 1)
            allPathPrint(p+'D', maze, r+1, c, path, step+1);
        if(c < maze[0].length - 1)
            allPathPrint(p+'R', maze, r, c+1, path, step+1);
        if(r > 0)
            allPathPrint(p+'U', maze, r-1, c, path, step+1);
        if(c > 0)
            allPathPrint(p+'L', maze, r, c-1, path, step+1);

        maze[r][c] = true;
        path[r][c] = 0;

    }
}
