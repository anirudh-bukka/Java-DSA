public class SetTheBit {
    public static void main(String[] args) {
        int number = 22;
        int bit = 4;
        System.out.println(setBit(number, bit));
//        System.out.println(resetBit(22, 4)); // ----> Make it 0, not just reverse the bit '1'
    }

    public static int setBit(int n, int bit) {
        int mask = 1 << (bit - 1);
        return n|mask;
    }

//    public static int resetBit(int n, int bit) {
//        int mask = (1 << (bit - 1));
//        return nmask;
//    }
}
