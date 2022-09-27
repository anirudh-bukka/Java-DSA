public class CheckSort {
    public static void main(String[] args) {
        int[] ar = {1, 2, 4, 5, 6, 10};
        System.out.println(checkSort(ar, 0));
    }

    public static boolean checkSort(int[] ar, int i) {

        if(i == ar.length - 1)
            return true;

        return ar[i] < ar[i+1] && checkSort(ar, i+1);
    }
}
