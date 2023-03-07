package strings;

public class CheckShuffle {
    public static void main(String[] args) {
        String first = "XY";
        String second = "12";
        String result = "X12Y";
        System.out.println(checkShuffle(first.toCharArray(), second.toCharArray(), result.toCharArray()));
    }

    public static boolean checkShuffle(char[] first, char[] second, char[] result) {
//        char[] first = new char[f.length()];
//        char[] second = new char[s.length()];
//        char[] result = new char[res.length()];
//
//        for(int i = 0; i < f.length(); i++) {
//            first[i] = f.charAt(i);
//        }
//        for(int i = 0; i < s.length(); i++) {
//            second[i] = s.charAt(i);
//        }
//        for(int i = 0; i < res.length(); i++) {
//            result[i] = res.charAt(i);
//        }

        if(result.length != first.length + second.length)
            return false;

        int i = 0, j = 0, k = 0;
        while(k < result.length) {
            if(i < first.length && first[i] == result[k])
                i++;
            else if(j < second.length && second[j] == result[k])
                j++;
            else
                return false;
            k++;
        }
        return true;
    }
}