public class RemoveCharacter {
    public static void main(String[] args) {
        processString("", "baccdah");
    }
    static void processString(String p, String unp) {
        if(unp.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = unp.charAt(0);

        if(ch == 'a')
            processString(p, unp.substring(1));
        else
            processString(p + ch, unp.substring(1));
    }
}
