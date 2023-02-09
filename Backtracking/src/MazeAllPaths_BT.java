public class MazeAllPaths_BT {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        allPath("", board, 0, 0);
    }

    static void allPath(String p, boolean[][] maze, int r, int c) {
        if(r == maze.length-1 && c == maze[0].length-1) {
            System.out.println(p);
            return;
        }

        if(!maze[r][c])
            return;

        // Initially, the particular cell in the maze is not travelled.
        maze[r][c] = false;

        if(r < maze.length-1)
            allPath(p + 'D', maze, r+1, c);

        if(c < maze[0].length-1)
            allPath(p + 'R', maze, r, c+1);

        if(r > 0)
            allPath(p + 'U', maze, r-1, c);

        if(c > 0)
            allPath(p + 'L', maze, r, c-1);

        // Now the function will be terminated, so before the function gets removed, the changes that were made by the function will be undone.
        maze[r][c] = true;
    }
}
