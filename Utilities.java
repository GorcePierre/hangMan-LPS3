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


}
/**
 * Creating  with <3 by LPS3 14/10/2018
 */
