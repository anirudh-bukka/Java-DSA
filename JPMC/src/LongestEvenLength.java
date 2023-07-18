import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;


public class LongestEvenLength {
    public static void main(String[] args) {
        String s = "this is a test string";
        System.out.println(evenLength(s, s.length()));
    }

    public static String evenLength(String s, int n) {
        int curLen = 0, maxLen = 0, i = 0, j = 0;
        String ans="";
        HashMap<String, Integer> map = new HashMap<>();

        while(i < n) {
            if(s.charAt(i) == ' ' || i == n-1) {
                map.put(s.substring(j, i+1).strip(), i-j);
                j = i+1;
            }
            i++;
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int value : map.values())
            list.add(value);

        for(int k : map.values()) {
            if(k%2 == 0)
                maxLen = Math.max(maxLen, k);
        }

        for(Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() == maxLen) {
                ans = entry.getKey();
                break;
            }
        }

        return ans;
    }
}
