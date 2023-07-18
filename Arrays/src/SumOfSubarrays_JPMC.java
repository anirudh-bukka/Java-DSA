public class SumOfSubarrays_JPMC {
    // function compute sum all sub-array
    public static long SubArraySum(int arr[], int n)
    {
        long result = 0;

        // computing sum of subarray using formula
        for (int i = 0; i < n; i++)
            result += (arr[i] * (i + 1) * (n - i));

        // return all subarray sum
        return result;
    }

    /* Driver code */
    public static void main(String[] args)
    {
        int arr[] = { 1, 2, 3 };
        int n = arr.length;
        System.out.println("Sum of SubArray "
                + SubArraySum(arr, n));
    }

//    On2
class GFG {

    // Construct prefix-sum array
    public static void
    buildPrefixSumArray(int arr[], int n,
                        int prefixSumArray[])
    {
        prefixSumArray[0] = arr[0];
        // Adding present element with previous element
        for (int i = 1; i < n; i++)
            prefixSumArray[i]
                    = prefixSumArray[i - 1] + arr[i];
    }
    // Computes sum all sub-array
    public static long SubArraySum(int arr[], int n)
    {
        long result = 0, sum = 0;
        int[] prefixSumArr = new int[n];

        buildPrefixSumArray(arr, n, prefixSumArr);
        // Pick starting point
        for (int i = 0; i < n; i++) {
            // Pick ending point
            sum = 0;
            for (int j = i; j < n; j++) {
                // sum subarray between current
                // starting and ending points
                if (i != 0) {
                    sum = prefixSumArr[j]
                            - prefixSumArr[i - 1];
                }
                else
                    sum = prefixSumArr[j];
                result += sum;
            }
        }
        return result;
    }

    /* Driver code */
//    public static void main(String[] args)
//    {
//        int arr[] = { 1, 2, 3, 4 };
//        int n = arr.length;
//        System.out.println("Sum of SubArray : "
//                + SubArraySum(arr, n));
//    }
}
}
