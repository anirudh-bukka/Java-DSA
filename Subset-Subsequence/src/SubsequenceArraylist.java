import java.util.ArrayList;

public class SubsequenceArraylist {
    public static void main(String[] args) {
        System.out.println("Returning an ArrayList: \n");
        System.out.println(subseq("", "abc"));
        System.out.println("Printing ASCII values: \n");
        subseqAscii("", "abc");
        System.out.println("Returning ASCII values in an ArrayList: \n");
        System.out.println(subseqAsciiReturn("", "abc"));
    }

    static ArrayList<String> subseq(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> included = subseq(p+ch, up.substring(1));
        ArrayList<String> ignored = subseq(p, up.substring(1));

        included.addAll(ignored);

        return included;
    }

    static void subseqAscii(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        subseqAscii(p + ch, up.substring(1));
        subseqAscii(p, up.substring(1));
        subseqAscii(p + (ch + 0), up.substring(1));
    }

    static ArrayList<String> subseqAsciiReturn(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> first = subseqAsciiReturn(p + ch, up.substring(1));
        ArrayList<String> second = subseqAsciiReturn(p, up.substring(1));
        ArrayList<String> third = subseqAsciiReturn(p + (ch+0), up.substring(1));

        third.addAll(first);
        third.addAll(second);

        return third;
    }

}
