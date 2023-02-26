package stacks_queues;
import java.util.*;

public class DecodeString {

    public static void main(String[] args) {
        System.out.println(decodeString("3[a]2[bc]"));
    }

    public static String decodeString(String s) {
        Stack<Integer>numStack=new Stack<>();
        Stack<StringBuilder>strBuild=new Stack<>();
        StringBuilder str = new StringBuilder();
        int num=0;
        for(char c:s.toCharArray()){
            if(c>='0' && c<='9'){
                num=num*10 +c -'0';
            }
            else if(c=='['){
                strBuild.push(str);
                str=new StringBuilder();
                numStack.push(num);
                num=0;
            }else if(c==']'){
                StringBuilder temp=str;
                str=strBuild.pop();
                int count=numStack.pop();
                while(count-->0){
                    str.append(temp);
                }
            }else{
                str.append(c);
            }
        }
        return str.toString();

    }
}


/*
Stack<Character> stack = new Stack<>();
        Stack<Character> temp = new Stack<>();
        StringBuilder sb = new StringBuilder("");
        int num = 0;
        for(char c : s.toCharArray()) {
            if(c >= '0' && c <= '9') {
                num = c-'0';
            } else if(c == '[') {
                stack.push(c);
            } else if(c == ']') {
                while(stack.size() > 0)
                    temp.push(stack.pop());
                while(temp.size() > 0 && num > 0) {
                    sb.append(temp.pop());
                    num--;
                }
            } else {
                stack.push(c);
            }
        }
        return sb.toString();

        [a[b;
 */







/*


public static String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        Stack<Character> temp = new Stack<>();
        StringBuilder sb = new StringBuilder("");
        int num = 0;
        for(char c : s.toCharArray()) {
            if(c >= '0' && c <= '9') {
                num = c-'0';
            } else if(c == '[') {
                stack.push(c);
            } else if(c == ']') {
//                StringBuilder c_sb = new StringBuilder("");
                while(stack.peek() != '[' && num > 0) {
                    sb.append((char)stack.peek());
                    num--;
                }
                stack.pop();
            } else {
                stack.push(c);
            }

        }
        return sb.toString();
    }


 */


/*

if(c != '[' || c != ']')
        stack.push(c);

        if(c == ']') {
        while(stack.size() != 0) {
        sb.append(stack.pop());
        }
        while(num != 0) {
        sb.append(sb);
        num--;
        }
        }
        */
