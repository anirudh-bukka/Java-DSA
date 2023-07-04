import java.util.*;

public class SimplifyPath {
    public static void main(String[] args) {
        String s = "/home//foo/";
        System.out.println(simplifyPath(s));
    }

    public static String simplifyPath(String path) {
        Deque<String> deque = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        String[] p = path.split("/");

        for(int i = 0; i < p.length; i++) {
            if(!deque.isEmpty() && p[i].equals("..")) {
                deque.poll();
            } else if(!p[i].equals("") && !p[i].equals(".") && !p[i].equals("..")) {
                deque.push(p[i]);
            }
        }
        if(deque.isEmpty()) {
            return "/";
        }
        while(!deque.isEmpty()) {
            sb.append("/").append(deque.pollLast());
        }

        return sb.toString();
    }
}
