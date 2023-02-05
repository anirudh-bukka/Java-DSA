import java.util.Scanner;

public class Product_n_1 {

    public static void main(String[] args) {

        System.out.println("Enter a number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans1 = productNto1(n);
        int ans2 = sumNto1(n);
        System.out.println(ans1);
        System.out.println(ans2);
    }

    public static int productNto1 (int n) {
        if(n - 1 > 1)
            return n*productNto1(n-1);
        else
            return n;
    }

    public static int sumNto1 (int n) {
        if(n-1 > 0)
            return n + sumNto1(n-1);
        else
            return n;
    }
}
