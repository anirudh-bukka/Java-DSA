import java.util.ArrayList;
import java.util.List;

public class IntegerSubsets {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3};


        System.out.println(subsetFunc(ar));
    }

    static List<List<Integer>> subsetFunc(int[] ar) {

        // create a "result" list to return;
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for(int num : ar) {
            int n = outer.size();
            for(int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
}
