public class SkipString {
    public static void main(String[] args) {
        String s = "eatappleinfrontofdoctor-appbahaha";
        System.out.println(skipFunc(s));
        System.out.println(skipWithCondition(s));
    }

    static String skipFunc(String s) {
        if(s.isEmpty())
            return "";

        if(s.startsWith("apple"))
            return skipFunc(s.substring(5));

        else
            return s.charAt(0) + skipFunc(s.substring(1));
    }

    static String skipWithCondition(String s) {
        if(s.isEmpty())
            return "";

        if(s.startsWith("app") && !s.startsWith("apple"))
            return skipWithCondition(s.substring(3));

        else
            return s.charAt(0) + skipWithCondition(s.substring(1));
    }
}
