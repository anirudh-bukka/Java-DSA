public class FindIthBit {
    public static void main(String[] args) {
        int forNumber = 5;
        int n = 3;
        // to check what is the 4th bit of 256
        System.out.println(checkBit(forNumber, n));
    }

    public static int checkBit(int forNumber, int n) {
        if((forNumber & (1 << (n-1))) != 0)
            return 1;
        else
            return 0;
    }
}
