import java.util.*;

public class PartitionLabels {
    public static void main(String[] args) {
        String s = "ababcbacadefegdehijhklij";
        List<Integer> list = new ArrayList<>();
        System.out.println(ListOfLengths(s, list));
    }

    public static List<Integer> ListOfLengths(String s, List<Integer> list) {

        if(s.isEmpty()) {
            return list;
        }

        int i = 0;
        int max = s.lastIndexOf(s.charAt(0));

        while(i < max) {
            int consider = s.charAt(i);
            int lastIndex = s.lastIndexOf(consider);
            max = Math.max(max, lastIndex);
            i++;
        }

        System.out.println(max+1);
        list.add(i+1);

        String newS = s.substring(max+1);
        System.out.println(newS);

//        if(!s.isEmpty())
        return ListOfLengths(newS, list);


    }
}




/*
int i = 0, length = 0;
        int max = s.lastIndexOf(s.charAt(0));

        do {
            char consider = s.charAt(i);
            int lastIndex = s.lastIndexOf(consider);
            max = Math.max(lastIndex, max);
            length++;
        } while(i < max);

        System.out.println(length);
        return list;
 */
