package strings;

public class printDuplictes {
    static final int NO_OF_CHARS = 256;
    public static void main(String[] args) {
        String s = "geeks";
        printDuplicates(s);
    }

    public static void counts(String s, int[] count) {
        for(int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }
    }

    public static void printDuplicates(String s) {
//        int[] count = new int[s.length()];
        int[] count = new int[NO_OF_CHARS];
        counts(s, count);

        for(int i = 0; i <NO_OF_CHARS; i++) {
            if(count[i] > 1)
                System.out.println((char)(i) + ":" + count[i]);
        }
    }
}

