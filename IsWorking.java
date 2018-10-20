import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

/**
 * IsWorking
 */
public class IsWorking {

    public static int[] checkPositionLetter(String word, String letter) {
        int index = 0;
        List<Integer> indexList = new ArrayList<Integer>();
        String[] splitedWord = word.split("");

        for (String character : splitedWord) {
            if (letter.equals(character)) {
                indexList.add(index);
            }
            index++;
        }
        int[] letterPositions = new int[indexList.size()];
        letterPositions = indexList.stream().mapToInt(Integer::intValue).toArray();
        return letterPositions;
    }

    public static String[] replaceLetter(int[] positions, String letter, String[] hiddenWord) {

        for (int position : positions) {
            hiddenWord[position] = letter;
        }
        return hiddenWord;
    }

    public static boolean setVIctory(String[] hiddenWord, String word,int tryNum) {
        if (tryNum < 7) {
            String isStringFoundWord = String.join("", hiddenWord);
            System.out.println("le mot caché est : " + isStringFoundWord);
            System.out.println("il reste " + (7 - (tryNum)) + " tentative(s)");

            if (isStringFoundWord.equals(word)) {
                return true;
            } else {
                return false;
            }
        }

        return true;
    }
}
/**
 * Creating with <3 by LPS3 14/10/2018
 */