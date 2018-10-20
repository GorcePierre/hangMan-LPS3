import java.util.Arrays;

/**
 * HangMan
 */
public class HangMan {

    public static void main(String[] args) {
        IsPrinting.text("title");
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
            int[] letterPosition = IsWorking.checkPositionLetter(wordToFind, chosenLetter);
            String[] foundLetters = IsWorking.replaceLetter(letterPosition, chosenLetter, hiddenWord);
            isVictory = IsWorking.setVIctory(foundLetters, wordToFind,tryHit);
            tryHit ++;
            System.out.println(tryHit);

        }
        

        IsPrinting.text("win");

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
