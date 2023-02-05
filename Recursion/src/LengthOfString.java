public class LengthOfString {
    public static void main(String[] args) {
        String s = "abcde";
        System.out.println(lengthFunc(s));
    }

    static int lengthFunc(String s) {
        if(s.length() == 0)
            return 0;

        return 1 + lengthFunc(s.substring(1));
    }
}
