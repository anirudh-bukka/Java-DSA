import java.util.ArrayList;
import java.util.List;

public class IntegerSubsets {
    public static void main(String[] args) {
        int[] ar = {1, 2,2, 3};
        List<List<Integer>> ans = subset(ar);
        for(List<Integer> list : ans)
            System.out.println(list);
    }

    static List<List<Integer>> subset(int[] ar) {
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for(int num: ar) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
}