import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        diceVoid("", 4);
        System.out.println(diceList("", 4));
        int[] ar = {2, 3, 4, 5};
        System.out.println(diceListOfLists("", ar, 5));
    }

    static void diceVoid(String p, int target) {
        if(target == 0) {
            System.out.println(p);
            return;
        }

        for(int i = 1; i <= 6 && i <= target; i++)
            diceVoid(p+i, target - i);


    }

    static ArrayList<String> diceList(String p, int target) {
        if(target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        for(int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(diceList(p+i, target-i));
        }

        return list;
    }

    static ArrayList<String> diceListOfLists(String p, int[] ar, int target) {
        if(target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
        }

        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < ar.length; i++) {
            list.addAll(diceListOfLists(p+ar[i], ar,target-ar[i]));
        }
        return list;
    }
}
