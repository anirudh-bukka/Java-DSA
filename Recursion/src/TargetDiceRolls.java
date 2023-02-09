import java.util.ArrayList;

public class TargetDiceRolls {

    public static void main(String[] args) {
        dice("", 4);
        System.out.println(returnArrayList("", 4));
        System.out.println(customFaces("", 4, 8));
    }

    static void dice(String p, int target) {
        if(target == 0) {
            System.out.println(p);
            return;
        }

        for(int i = 1; i <= 6 && i <= target; i++) {
            dice(p+i, target-i);
        }
    }

    static ArrayList<String> returnArrayList(String p, int target) {
        if(target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        for(int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(returnArrayList(p+i, target - i));
        }
        return list;
    }

    static ArrayList<String> customFaces(String p, int target, int faces) {
        if(target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        for(int i = 1; i <= faces && i <= target; i++) {
            list.addAll(customFaces(p+i, target-i, faces));
        }
        return list;
    }

}
