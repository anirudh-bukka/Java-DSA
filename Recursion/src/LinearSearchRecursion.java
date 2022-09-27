import java.util.ArrayList;

public class LinearSearchRecursion {
    public static void main(String[] args) {
        int[] ar = {6, 1, 5, 2, 6, 6, 6, 3, 4};
        int target = 6;

        System.out.println("First occurrence: " + linearSearch(ar, target, 0));
        System.out.println("Last occurence: " + linearSearchFromEnd(ar, target, ar.length-1));
        System.out.println("List of elements present: " + returnList(ar, target, 0, new ArrayList<>()));
    }

    static int linearSearch(int[] ar, int target, int i) {

        if(i == ar.length)
            return -1;

        if(ar[i] == target)
            return i;

        return linearSearch(ar, target, i+1);
    }

    static int linearSearchFromEnd(int[] ar, int target, int i) {
        if(i == -1)
            return -1;

        if(ar[i] == target)
            return i;

        return linearSearchFromEnd(ar, target, i-1);
    }


    static ArrayList returnList(int[] ar, int target, int i, ArrayList<Integer> list) {
        if(i == ar.length)
            return list;

        if(target == ar[i]) {
            list.add(i);
        }

        return returnList(ar, target, i+1, list);
    }
}
