package stacks;

import java.util.Stack;

public class ArithmeticExpEvaluation {
    public static void main(String[] args) {
        String s = "2+4";
        char[] ar = s.toCharArray();
        System.out.println(evaluation(ar, ar.length));
    }

    public static int evaluation(char[] ar, int n) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < ar.length; i++) {
            char c =  ar[i];
            if(c >= '0' && c <= '9')
                stack.push(c-'0');
            else {
                int op1 = stack.pop();
                int op2 = stack.pop();

                switch (c) {
                    case '+' : stack.push(op1 + op2);
                    break;
                    case '*' : stack.push(op1 * op2);
                    break;
                    case '-' : stack.push(op1 - op2);
                    break;
                    case '/' : stack.push(op1 / op2);
                    break;
                }
            }
        }
        return stack.pop();
    }
}
