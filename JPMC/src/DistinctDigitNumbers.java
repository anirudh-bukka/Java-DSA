import java.util.Stack;

public class DistinctDigitNumbers {
//    public static void main(String[] args) {
//        int[][] ar = {{1, 20}, {9, 19}};
//        int n = ar.length;
//        System.out.println(countFunc(ar, n));
//    }
//
//    public static int countFunc(int[][] ar, int n) {
//
//    }
static boolean checkForSubsequence(String string2, String string1) {

    // Declaring a stack to insert the characters of the second string i.e. string2
    Stack<Character> checkseq = new Stack < Character > ();

    // Inserting all the characters of string2 into the stack
    for (int i = 0; i < string2.length(); i++) {
        checkseq.push(string2.charAt(i));
    }

    int currentIndex = string1.length() - 1;

    // Checking the subsequence in string1
    while (!checkseq.isEmpty() && currentIndex >= 0) {
        if (string1.charAt(currentIndex) == checkseq.peek()) {
            checkseq.pop();
        }
        currentIndex--;
    }

    if (checkseq.isEmpty()) {
        return true;
    }
    return false;

}

    // Driver code
    public static void main(String args[]) {
        String string1 = "yes i like cheese a lot";
        String string2 = "i cheese";



        if (checkForSubsequence(string2, string1)) {
            System.out.println("Yes, " + string2 + " is a subsequence of " + string1);
        } else {
            System.out.println("No, " + string2 + " is not a subsequence of " + string1);
        }
    }
}
