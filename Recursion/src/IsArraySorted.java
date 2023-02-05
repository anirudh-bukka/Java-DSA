public class IsArraySorted {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 99};
        System.out.println(isSorted(ar, 0));
    }

    static boolean isSorted(int[] ar, int i) {
        if(ar.length == 1 || ar.length == 0)
            return true;

        if(i == ar.length - 1)
            return true;

        if(i < ar.length - 1)
            if(ar[i] < ar[i+1])
                return isSorted(ar, i+1);

        return false;
    }
}
