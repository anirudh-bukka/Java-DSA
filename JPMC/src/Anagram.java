import java.util.HashSet;
// Link: https://www.geeksforgeeks.org/check-whether-two-strings-are-anagram-of-each-other/

public class Anagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        System.out.println(checkAnagram(s1, s2));
    }

    public static boolean checkAnagram(String s1, String s2) {
        if(s1.length() != s2.length())
            return false;

        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();

        for(char c : s1.toCharArray())
            set1.add(c);
        for(char c : s2.toCharArray())
            set2.add(c);

        if(set1.equals(set2))
            return true;

        return false;
    }
}
