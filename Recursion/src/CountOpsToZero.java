public class CountOpsToZero {
    public static void main(String[] args) {
        int num1 = 2, num2 = 3;
        System.out.println(countOperations(num1, num2));
    }

    public static int countOperations(int num1, int num2) {
        int count = 0;
        return countSteps(num1, num2, count);
    }

    public static int countSteps(int n, int m, int count) {

        if(n==0 || m==0)
            return count;

        if(n>=m)
            return countSteps(n-m, m, ++count);
        else if(n<m)
            return countSteps(n, m-n, ++count);

        return count;
    }
}
