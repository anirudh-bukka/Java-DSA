import java.util.ArrayList;
import java.util.Locale;

public class Subsequence1 {
    public static void main(String[] args) {
        subseq("", "abc");
        ArrayList<String> l = new ArrayList<>();
//        System.out.println(subseqReturnArrayList("", "abc", l));
        System.out.println(subseqNoReturnAL("", "abc"));
    }

    static void subseq(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p+ch, up.substring(1)); // --> This is to accept the next character (first from left) as a part of the processed String.
        subseq(p, up.substring(1)); // --> This is to reject/not accept the next character (first from left)

        // IMPORTANT: `.substring()` is NOT changing the String, it is creating a NEW one.
    }
//
//    static ArrayList<String> subseqReturnArrayList(String p, String up, ArrayList<String> l) {
//        if(up.isEmpty()) {
//
//        }
//    }

    static ArrayList<String> subseqNoReturnAL(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> leftTree = subseqNoReturnAL(p + ch, up.substring(1));
        ArrayList<String> rightTree = subseqNoReturnAL(p, up.substring(1));

        leftTree.addAll(rightTree);
        return leftTree;
    }
}