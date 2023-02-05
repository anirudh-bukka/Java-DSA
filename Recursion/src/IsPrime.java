public class IsPrime {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(isPrime(n, 2));
    }

    static boolean isPrime(int n, int i) {
        // base cases
        if(n <= 2)
            return (n==2) ? true : false;
        if(n % i == 0)
            return false;
        if(i * i > n)
            return true;

        return isPrime(n, i+1);
    }
}
