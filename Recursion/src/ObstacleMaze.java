import java.util.ArrayList;

public class ObstacleMaze {
    public static void main(String[] args) {
        System.out.println("With Obstacle: ");
        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        obstacleFunc("", board, 0, 0);
        System.out.println("Returning as an ArrayList: ");
        System.out.println(obstacleFuncReturn("", board, 0, 0));
    }

    static void obstacleFunc(String p, boolean[][] maze, int r, int c) {
        if(r == maze.length-1 && c == maze[0].length-1) {
            System.out.println(p);
            return;
        }

        if(!maze[r][c])
            return;

        if(r < maze.length-1)
            obstacleFunc(p + "D", maze, r+1, c);
        if(c < maze[0].length-1)
            obstacleFunc(p + "R", maze, r, c+1);

    }

    static ArrayList<String> obstacleFuncReturn(String p, boolean[][] maze, int r, int c) {
        if(r == maze.length-1 && c == maze[0].length-1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if(r < maze.length-1)
            list.addAll(obstacleFuncReturn(p+"D", maze, r+1, c));
        if(c < maze[0].length-1)
            list.addAll(obstacleFuncReturn(p+"R", maze, r, c+1));

        return list;
    }

}