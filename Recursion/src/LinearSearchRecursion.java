public class LinearSearchRecursion {
    public static void main(String[] args) {
        int[] ar = {1, 5, 2, 6, 3, 4};
        int target = 2;
        System.out.println("Present at index: " + linearSearch(ar, target, 0));
    }

    static int linearSearch(int[] ar, int target, int i) {
//        if(ar[i] == target)
//            return i;
//        return linearSearch(ar, target, i+1);

        if(i == ar.length)
            return -1;

        if(ar[i] == target)
            return i;

        return linearSearch(ar, target, i+1);
    }
}
