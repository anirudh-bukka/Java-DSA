import java.util.ArrayList;
import java.util.Scanner;

public class LongestEvenLengthWord {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String inn = myObj.nextLine();
        String result = LongestEvenWords(inn);
        System.out.println(result);
    }

    public static String LongestEvenWords(String sentence) {
        String words = "";
        String[] word = sentence.split(" ");
        ArrayList<String> evenWords = new ArrayList<>();
        for(String ev:word) {
            if(ev.length() % 2 == 0){
                evenWords.add(ev);
            }
        }
        if(evenWords.isEmpty()){
            words="00";
        } else {
            for (String wd : evenWords) {
                if (words.length() < wd.length()) {
                    words = wd;
                }
            }
        }
        if(sentence == "") {
            words = "00";
        }
        return words;

    }
}