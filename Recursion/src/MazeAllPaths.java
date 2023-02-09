import java.util.Arrays;

public class MazeAllPaths {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        System.out.println("Print only the path from (0,0) to (3,3):");
        allPath("", board, 0, 0);

        int[][] path = new int[board.length][board[0].length];
        System.out.println();
//        System.out.println("Map the cells along with path from (0,0) to (3,3):");
//        mapPath("", board, 0, 0, path, 1);
    }

    static void allPath(String p, boolean[][] maze, int r, int c) {
        if(r == maze.length-1 && c == maze[0].length-1) {
            System.out.println(p);
            return;
        }

        if(!maze[r][c])
            return;

        maze[r][c] = false; // after covering this cell of the maze/board.

        if(c < maze[0].length - 1)
            allPath(p+"R", maze, r, c+1);

        if(c > 0)
            allPath(p+"L", maze, r, c-1);

        if(r > 0)
            allPath(p+"U", maze, r-1, c);

        if(r < maze.length - 1)
            allPath(p+"D", maze, r+1, c);

        // This line is where the function will be over.
        maze[r][c] = true; // So before the function is removed from the stack, the changes made to the boolean values will also be reverted to original: `true` in this case.
    }

    static void mapPath(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
        if(r == maze.length-1 && c == maze[0].length-1) {
            System.out.println(p);
            for(int[] ar : path)
                System.out.println(Arrays.toString(ar));
            return;
        }

        if(!maze[r][c])
            return;

        maze[r][c] = false; // now it is visited.
        path[r][c] = step; // assigns the serial order of the cell visited.

        // going down
        if(r < maze.length-1)
            mapPath(p+'D', maze, r+1, c, path, step+1);
        // going up
        if(r > 0)
            mapPath(p+'U', maze, r-1, c, path, step+1);
        // going right
        if(c < maze[0].length-1)
            mapPath(p+'R', maze, r, c+1, path, step+1);
        // going left
        if(c > 0)
            mapPath(p+'L', maze, r, c-1, path, step+1);

        maze[r][c] = true; // resetting the visited cells as unvisited on backtracking
        path[r][c] = 0; // resetting the path serial order of each cell on backtracking
    }

}
