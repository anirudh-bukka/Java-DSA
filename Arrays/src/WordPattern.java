// Leetcode 290

import java.util.*;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba", s = "dog cat cat tail";
        System.out.println(wordPattern(pattern, s));
    }
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(words.length != pattern.length())
            return false;

        HashMap<String, Character> wordToChar = new HashMap<>();
        HashMap<Character, String> charToWord = new HashMap<>();

        for(int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if(!wordToChar.containsKey(word))
                wordToChar.put(word, c);

            if(!charToWord.containsKey(c))
                charToWord.put(c, word);

            if(!charToWord.get(c).equals(word) || !wordToChar.get(word).equals(c))
                return false;
        }
        return true;
    }
}
