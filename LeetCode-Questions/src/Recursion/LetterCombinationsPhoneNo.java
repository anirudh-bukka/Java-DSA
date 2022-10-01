package Recursion;
// Link: https://leetcode.com/problems/letter-combinations-of-a-phone-number/

import java.util.ArrayList;

public class LetterCombinationsPhoneNo {

    public static void main(String[] args) {
        System.out.println("Without using ArrayList: ");
        phonePad("", "12");
        System.out.println("Using an ArrayList: ");
        System.out.println(phonePadArrayList("", "12"));
    }

    static void phonePad(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0'; // --> This will convert string to integer: '2' -> 2

        for(int i = (digit - 1)*3; i < digit*3; i++) {
            char ch = (char)('a'+i);
            phonePad(p + ch, up.substring(1));
        }
    }

    static ArrayList<String> phonePadArrayList(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';
        ArrayList<String> list = new ArrayList<>();

        for(int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char)('a' + i);
            list.addAll(phonePadArrayList(p+ch, up.substring(1)));
        }
        return list;
    }

}
