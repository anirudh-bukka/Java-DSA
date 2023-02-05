public class Fibonacci {
    public static void main(String[] args) {
//        System.out.println(fib(6));
        int ans = fib(60);
        System.out.println(ans);
    }

    static int fib(int n) {
//        if(fib(n-1) == 0 || fib(n-2) == 0)
//            return n;
        if(n < 2)
            return n;

        return fib(n-1) + fib(n-2);
    }
}
