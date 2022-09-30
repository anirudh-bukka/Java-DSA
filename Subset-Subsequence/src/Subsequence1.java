public class Subsequence1 {
    public static void main(String[] args) {
        subseq("", "abc");
    }

    static void subseq(String p, String up) {
        // In this function, the `subseq` function is creating a new object every call <-- Strings are immutable.
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subseq(p + ch, up.substring(1)); // --> This is to accept the next character (first from left) as a part of the processed String.
        subseq(p, up.substring(1)); // --> This is to reject/not accept the next character (first from left)

        // .substring is not changing the String, it is creating a new one.
    }
}