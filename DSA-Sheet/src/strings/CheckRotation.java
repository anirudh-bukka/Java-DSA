package strings;

import java.util.LinkedList;
import java.util.Queue;

public class CheckRotation {
    public static void main(String[] args) {
        String s1 = "ABACD";
        String s2 = "CDABA";

        System.out.println(isRotated(s1, s2));
    }

    public static boolean isRotated(String s1, String s2) {
        if(s1.length() != s2.length())
            return false;

        Queue<Character> q1 = new LinkedList<>();
        Queue<Character> q2 = new LinkedList<>();
        for(int i = 0; i < s1.length(); i++) {
            q1.add(s1.charAt(i));
        }
        for(int i = 0; i < s2.length(); i++) {
            q2.add(s2.charAt(i));
        }

        while(q1.element() != q2.element()) {
            q2.add(q2.remove());
        }

        if(q1.equals(q2))
            return true;

        return false;
    }
}
