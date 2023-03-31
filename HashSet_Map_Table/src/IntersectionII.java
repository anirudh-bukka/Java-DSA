import java.util.*;

public class IntersectionII {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1}, nums2 = {2,2};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        ArrayList<Integer> resultList = new ArrayList<>();

        for(int i : nums1) {
            if(map1.containsKey(i)) {
                map1.put(i, map1.get(i) + 1);
            } else {
                map1.put(i, 1);
            }
        }

        for(int i : nums2) {
            if(map2.containsKey(i)) {
                map2.put(i, map2.get(i) + 1);
            } else {
                map2.put(i, 1);
            }
        }

//        System.out.println(Arrays.toString(nums1));
//        System.out.println(Arrays.toString(nums2));
//        for(int i = 0; i < map1.keySet().size(); i++)
//            System.out.println(map1.get(i) + " " + map1.get(map1.get(i)));
//        for(int i = 0; i < map2.keySet().size(); i++)
//            System.out.println(map2.get(i) + " " + map2.get(map2.get(i)));

        for (int key : map1.keySet()) {
            if (map2.containsKey(key) && (!map1.containsValue(0) && !map2.containsValue(0))) {
                int n = (map1.get(key) < map2.get(key)) ? map1.get(key) : map2.get(key);
                for(int i = 0; i < n; i++)
                    resultList.add(key);
            }
        }

        int[] result = new int[resultList.size()];
        for(int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}