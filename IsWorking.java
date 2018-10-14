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
}
/**
 * Creating with <3 by LPS3 14/10/2018
 */