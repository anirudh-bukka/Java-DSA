public class BreakPalindrome {
    public static void main(String[] args) {
        String s = "aaabbaaa";
        System.out.println(breakPalindrome(s));
    }

    public static String breakPalindrome(String s) {
        char[] ar = s.toCharArray();
        int n = ar.length;
        for(int i = 0; i < n/2; i++) {
            if(ar[i] != 'a') {
                ar[i] = 'a';
                return String.valueOf(ar);
            }
        }
//        ar[n-1] = 'b';
        return n <= 1 ? "" : "IMPOSSIBLE";
    }
}
