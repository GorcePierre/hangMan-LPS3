import java.util.Arrays;
import java.io.FileNotFoundException;

/**
 * HangMan
 */
public class HangMan {

    public static void main(String[] args) throws FileNotFoundException {
        IsPrinting.text("title");
        IsPrinting.text("modeToPlay");
        //Ici un if pour le mode de jeu choisi...
        IsPrinting.text("userMaxLetter");
        int maxLength = User.chooseMaxLength();
        IsPrinting.text("playerOne");

        boolean isVictory = false;
        Word word = new Word();

        word.setWord(User.isSelectWord(maxLength));

        String wordToFind = word.getWord();
        String[] hiddenWord = new String[wordToFind.length()];

        hiddenWord = Word.hideWord(wordToFind);

        int tryHit = 1;

        while (!isVictory) {
            IsPrinting.text("playerTwo");
            String chosenLetter = User.isSelectletter();
            int[] letterPosition = Word.checkPositionLetter(wordToFind, chosenLetter);
            String[] foundLetters = Word.replaceLetter(letterPosition, chosenLetter, hiddenWord);
            isVictory = Word.setVIctory(foundLetters, wordToFind, tryHit);
            tryHit++;

        }

        if (tryHit < 7) {
            IsPrinting.text("win2");
        } else
            IsPrinting.text("win1");

        HangManTest.hideWordTest();
        HangManTest.printTest();
        HangManTest.replaceLetterTest();
        HangManTest.checkPositionLetterTest();
        HangManTest.setVictoryTest();
    }

}
/**
 * Creating wiht <3 by LPS3 14/10/2018
 */
