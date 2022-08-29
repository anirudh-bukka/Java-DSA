package Sorting;

public class QuickSort {

    public static void main(String[] args) {
        int[] ar = {1, 2, 5, 2, 3};
        int size = ar.length;
        quickSort(ar, 0, size-1);
        System.out.println("Sorted array: ");
        
        for(int i = 0; i < size; i++) 
            System.out.print(ar[i] + " ");
    }

    static int partition(int[] ar, int low, int high) {
        int pivot = ar[high];
        int i = low-1;

        for(int j = low; j <= high - 1; j++) {
            if(ar[j] < pivot) {
                i++;
                swap(ar, i, j);
            }
        }
        swap(ar, i+1, high);
        return i+1;
    }

    static void quickSort(int[] ar, int low, int high) {
        if(low < high) {
            int p = partition(ar, low, high);
            quickSort(ar, low, p-1);
            quickSort(ar, p+1, high);
        }
    }
    
    static void swap(int[] ar, int i, int j) {
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }

}
