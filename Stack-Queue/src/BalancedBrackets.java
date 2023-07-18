import java.util.*;

public class BalancedBrackets {
    public static void main(String[] args) {
//        String s = "([])(){}(())()()";
        String s = "(141[])(){waga}((51afaw))()hh()";
        System.out.println(balancedBrackets(s));
    }
    public static boolean balancedBrackets(String str) {

//        if(str == "(()agwg())((()agwga()())gawgwgag)" || str == "{}gawgw()" || )
//            return true;

        char ar[] = str.toCharArray();

        Stack<Character> stack = new Stack<>();

        for(char i : ar) {
            if(i == '(' || i == '{' || i == '[')
                stack.push(i);
            else {
                if (stack.peek() == '(' && !stack.isEmpty() && i == ')')
                    stack.pop();
                else if (stack.peek() == '{' && !stack.isEmpty() && i == '}')
                    stack.pop();
                else if (stack.peek() == '[' && !stack.isEmpty() && i == ']')
                    stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
