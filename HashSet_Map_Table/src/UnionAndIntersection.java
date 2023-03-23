import java.util.HashSet;

public class UnionAndIntersection {
    public static void main(String[] args) {
        int[] ar1 = {1, 2, 3, 4};
        int[] ar2 = {2, 3, 4, 5, 6, 7};

        union(ar1, ar2);
        System.out.println(intersection(ar1, ar2));
    }

    public static void union(int[] ar1, int[] ar2) {
        HashSet<Integer> unionSet = new HashSet<>();

        for(int i = 0; i < ar1.length; i++)
            unionSet.add(ar1[i]);

        for(int i = 0; i < ar2.length; i++)
            unionSet.add(ar2[i]);

        System.out.println(unionSet);
    }

    public static int intersection(int[] ar1, int[] ar2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersectionSet = new HashSet<>();
        int count = 0;

        for(int i = 0; i < ar1.length; i++)
            set.add(ar1[i]);

        for(int i = 0; i < ar2.length; i++) {
            if(set.contains(ar2[i])) {
                count++;
                set.remove(ar2[i]);
                intersectionSet.add(ar2[i]);
            }
        }
        System.out.println(intersectionSet);

        return count;
    }
}
