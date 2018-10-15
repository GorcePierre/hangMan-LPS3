import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Utilities {

    public static String[] hideWord(String word) {
        String[] hiddenWord = new String [word.length()];
        int i = 0;
        for(String letter : hiddenWord) {
            hiddenWord[i] = new String("_");
            i++;
        }


        return  hiddenWord;
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


}
/**
 * Creating  with <3 by LPS3 14/10/2018
 */
