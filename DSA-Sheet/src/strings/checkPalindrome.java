package strings;

public class checkPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abba"));
    }

    public static boolean isPalindrome(String s) {
        int n = s.length();
        for(int i = 0; i < n/2; i++) {
            if(s.charAt(i) == s.charAt(n - i - 1)) {
                return true;
            }
        }
        return false;
    }
}


/*
Example 1:
Input: S = "abba"
Output: 1
Explanation: S is a palindrome

Example 2:
Input: S = "abc"
Output: 0
Explanation: S is not a palindrome
 */