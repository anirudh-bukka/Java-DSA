public class SkipCharacter {
    public static void main(String[] args) {
        String s = "abaacd";
        skipCharArg(s, "");
        System.out.println(skipCharNoArg(s));
    }

    static void skipCharArg(String up, String p) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch == 'a')
            skipCharArg(up.substring(1), p);
        else
            skipCharArg(up.substring(1), p+ch);
    }

    static String skipCharNoArg(String s) {
        if(s.isEmpty())
            return "";

        char ch = s.charAt(0);

        if(ch == 'a')
            return skipCharNoArg(s.substring(1));
        else
            return ch + skipCharNoArg(s.substring(1));
    }
}
