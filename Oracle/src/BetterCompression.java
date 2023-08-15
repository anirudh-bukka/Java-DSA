import java.util.*;

// "z1a13z4b5c9c9" -> "a13b5c18z5"

public class BetterCompression {
    public static void main(String[] args) {
        String s = "z1a13z4b5c9c9";
        System.out.println(compressString(s));
    }

    public static String compressString(String s) {
        char[] ar = s.toCharArray();
        Map<Character, Integer> map = new TreeMap<>();

        for(int i = 0; i < ar.length-1; i++) {
            if(ar[i] >= 97 && ar[i] <= 122) {
                if(!map.containsKey(ar[i])) {
                    int j = i + 1;
                    int num = 0;
                    while (ar[j]-'0' >= 0 && ar[j]-'0' <= 9) {
                        num = num*10 + (ar[j]-'0');
                        j++;
                    }
                    map.put(ar[i], num);
                } else {
                    int j = i + 1;
                    int num = map.get(ar[i]);
                    while (ar[j]-'0' >= 0 && ar[j]-'0' <= 9) {
                        num += (ar[j]-'0');
                        if(j >= ar.length-1)
                            break;
                        else
                            j++;
                    }
                    map.put(ar[i], num);
                }
            }
        }


        String result = "";
        for(char c : map.keySet()) {
            result += c;
            result += map.get(c);
        }

        return result;
    }
}
