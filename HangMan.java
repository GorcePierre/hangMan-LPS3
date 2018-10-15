import java.util.Arrays;
/**
 * HangMan
 */
public class HangMan {

    public static void main(String[] args) {

        Utilities.clearScreen();

        IsPrinting.text(0);
        IsPrinting.text(1);

        boolean isVictory = false;
        String chosenLetter = "";
        String word = "";

        User.isSelectWord();
        System.out.print(word);
        Utilities.clearScreen();
        String[] hiddenWord = new String[word.length()];
        System.out.print(Arrays.toString(hiddenWord));
        Utilities.hideWord(word);
        System.out.print(Arrays.toString(hiddenWord));
        IsPrinting.text(2);
        User.isSelectletter();

        int[] letterPosition = IsWorking.checkPositionLetter(word, chosenLetter);

        IsWorking.replaceLetter(letterPosition, chosenLetter, hiddenWord);
        
        System.out.println(IsWorking.setVIctory(hiddenWord, word));
        System.out.println("ok");

        HangManTest.printTest();
        HangManTest.checkPositionLetterTest();
        HangManTest.replaceLetterTest();
        HangManTest.setVictoryTest();
        HangManTest.hideWordTest();
    }

}
/**
 * Creating  wiht <3 by LPS3 14/10/2018
 */