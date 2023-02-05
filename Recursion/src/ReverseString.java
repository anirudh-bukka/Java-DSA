import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'H', 'e', 'l', 'l', 'o'};
        int start = 0;
        int end = s.length - 1;
        reverseStringIteration(s, start, end);
        System.out.println(recursiveFunc(s, start, end));
    }

    static void reverseStringIteration(char[] s, int start, int end) {
        while(start <= end) {
            char temp = s[end];
            s[end] = s[start];
            s[start] = temp;
            start++;
            end--;
        }
        System.out.println("Reversing by Iteration: " + Arrays.toString(s));
    }

    static char[] recursiveFunc(char[] s, int start, int end) {
        if(start > end)
            return s;

        else {
            char temp = s[end];
            s[end] = s[start];
            s[start] = temp;
            return recursiveFunc(s, start, end);
        }
    }
}
