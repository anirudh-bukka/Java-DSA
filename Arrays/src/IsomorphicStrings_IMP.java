public class IsomorphicStrings_IMP {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
//        String s = "foo";
//        String t = "bar";
        System.out.println(isIsomorphic(s, t));
    }
    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        int[] ar1 = new int[256];
        int[] ar2 = new int[256];

        for(int i = 0; i < s.length(); i++) {
            if(ar1[s.charAt(i)] != ar2[t.charAt(i)])
                return false;

            ar1[s.charAt(i)] = i+1;
            ar2[t.charAt(i)] = i+1;
        }
        return true;
    }
}
