import java.util.ArrayList;

public class LinearSearchRecursion {
    public static void main(String[] args) {
        int[] ar = {6, 1, 5, 2, 6, 6, 6, 3, 4};
        int target = 6;

        System.out.println("First occurrence: " + linearSearch(ar, target, 0));
        System.out.println("Last occurence: " + linearSearchFromEnd(ar, target, ar.length-1));
        System.out.println("List of elements present: " + returnList(ar, target, 0, new ArrayList<>()));
        System.out.println("List of elements present: " + returnList2(ar, target, 0));
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

    // By passing the ArrayList as a parameter
        /* In this method/function, although the list is getting called every recursion call,
         it is referring to the same/previously updated list. This means, the list is carrying all the previous values
         for every new call, which is a waste of space and inefficient performance. */
    static ArrayList returnList(int[] ar, int target, int i, ArrayList<Integer> list) {
        if(i == ar.length)
            return list;

        if(target == ar[i]) {
            list.add(i);
        }

        return returnList(ar, target, i+1, list);
    }

    // Without passing ArrayList as a parameter
        /* In this method/function, new list is created with every recursion call. This means the value is appended in
         the list if satisfied, and in the end, adds all the individual lists into one list. */
    static ArrayList<Integer> returnList2(int[] ar, int target, int i) {
        ArrayList<Integer> list = new ArrayList<>();

        if(i == ar.length)
            return list;

        if(ar[i] == target)
            list.add(i);

        ArrayList<Integer> ansFromBelowCalls = returnList2(ar, target, i+1);

        list.addAll(ansFromBelowCalls);

        return list;
    }
}
