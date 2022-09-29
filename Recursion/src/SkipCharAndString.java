public class SkipCharAndString {
    public static void main(String[] args) {
        processString1("", "baccdah");
        System.out.println(processString2("baccdah"));
//        String s = "apple";
        System.out.println(skipString("An apple a day"));
    }

    static void processString1(String p, String unp) {
        if(unp.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = unp.charAt(0);

        if(ch == 'a')
            processString1(p, unp.substring(1));
        else
            processString1(p + ch, unp.substring(1));
    }

    static String processString2(String unp) {
        if(unp.isEmpty())
            return "";

        char ch = unp.charAt(0);

        if(ch == 'a')
            return processString2(unp.substring(1));

        else
            return ch + processString2(unp.substring(1));
    }

    static String skipString(String given) {
        if(given.isEmpty())
            return "";

        if(given.startsWith("apple"))
            return skipString(given.substring(5));
        else
            return given.charAt(0) + skipString(given.substring(1));
    }
}
