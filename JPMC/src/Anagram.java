import java.util.HashMap;
// Link: https://www.geeksforgeeks.org/check-whether-two-strings-are-anagram-of-each-other/

public class Anagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        System.out.println(checkAnagram(s1, s2));
    }

    public static boolean checkAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(char c : s.toCharArray()) {
            if(!map1.containsKey(c))
                map1.put(c, 1);
            else
                map1.put(c, map1.get(c) + 1);
        }
        for(char c : t.toCharArray()) {
            if(!map2.containsKey(c))
                map2.put(c, 1);
            else
                map2.put(c, map2.get(c) + 1);
        }

        if(map1.equals(map2))
            return true;
        return false;
    }
}
