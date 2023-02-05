// Link: https://www.geeksforgeeks.org/remove-consecutive-duplicates-string/
// To remove consecutive duplicate characters from a string

import java.util.*;
import java.io.*;

public class ConsecutiveDuplicateChars {
    public static void main(String[] args) {
        String s = "abcccdeefgfc";
        System.out.println(removeConsecutive(s));
    }

    static String removeConsecutive(String s) {
        if(s.length() == 0 || s.length() == 1)
            return s;

        if(s.charAt(0) == s.charAt(1))
            return removeConsecutive(s.substring(1));

        else
            return s.charAt(0) + removeConsecutive(s.substring(1));

    }
}
