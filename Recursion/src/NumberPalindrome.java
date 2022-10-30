// Check if a given number is a palindrome using recursion.
// Note: -ve numbers cannot be considered palindrome.

public class NumberPalindrome {
    public static void main(String[] args) {
        int number = 123;
//        System.out.println(isPalindrome(number));
        System.out.println(isPalindromeWoRecursion(number));
    }

//    static boolean isPalindrome(int n) {
//        int temp = n;
//
//    }

    static boolean isPalindromeWoRecursion(int n) {
        int temp = n;
        int sum = 0;
        while(temp != 0) {
            int rem = temp % 10;
            sum = (sum*10) + rem;
            temp /= 10;
        }

        if(sum == n)
            return true;
        else
            return false;
    }

}
