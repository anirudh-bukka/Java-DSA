import java.util.HashMap;

public class MajorityElement {
    public static void majorityElement(int ar[]) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Form key-value pairs (using a loop)
        for(int i = 0; i < ar.length; i++) {
            if(map.containsKey(ar[i]))
                map.put(ar[i], map.get(ar[i]) + 1); // increments the current frequency.
            else
                map.put(ar[i], 1);
        }
        for(int key : map.keySet()) {
            if(map.get(key) > ar.length/3)
                System.out.println(key);
        }
    }

    public static void main(String[] args) {
        int[] ar = {1, 3, 2, 5, 1, 3, 1, 5, 1};
        majorityElement(ar);
    }
}
