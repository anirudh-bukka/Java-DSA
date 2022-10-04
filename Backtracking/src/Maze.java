import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        System.out.println(countSteps(3, 2));
        System.out.println("All the possible paths: ");
        pathFunc("",3, 2);
        System.out.println("All the possible paths: ");
        System.out.println(pathFuncArrayList("",3, 2));
    }

    /*
    To reach the bottom right of the 2D matrix. Ex: in a 3x3 matrix, if the top row and left-most column are numbered 3
     */
    static int countSteps(int r, int c) {
        if(r == 1 || c == 1)
            return 1;

        int left = countSteps(r-1, c);
        System.out.println("Left:" + left);
        int right = countSteps(r, c-1);
        System.out.println("Right:" + right);
        return left+right;
    }

    static void pathFunc(String p, int r, int c) {
        if(r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if(r > 1)
            pathFunc(p + 'D', r-1, c);

        if(c > 1)
            pathFunc(p + 'R', r, c-1);
    }

    static ArrayList<String> pathFuncArrayList(String p, int r, int c) {
        if(r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if(r > 1) {
//            list.add("D");
//            pathFuncArrayList(r-1, c);
            list.addAll(pathFuncArrayList(p + "D", r-1, c));
        }

        if(c > 1) {
//            list.add("R");
//            pathFuncArrayList(r, c-1);
            list.addAll(pathFuncArrayList(p + "R", r, c-1));
        }

        return list;
    }


}
