import java.util.Arrays;

/**
 * HangMan
 */
public class HangMan {

    public static void main(String[] args) {

        IsPrinting.text(0);
        IsPrinting.text(1);
        int maxLength = User.chooseMaxLength();
        IsPrinting.text(2);

        boolean isVictory = false;
        Word word = new Word();

        word.setWord(User.isSelectWord(maxLength));

        String wordToFind = word.getWord();
        String[] hiddenWord = new String[wordToFind.length()];

        hiddenWord = Word.hideWord(wordToFind);
        System.out.println("etape 1.1: " + Arrays.toString(hiddenWord));
        

        while (!isVictory){
            IsPrinting.text(3);
            String chosenLetter = User.isSelectletter();
            System.out.println("etape 1: " + chosenLetter);
            int[] letterPosition = IsWorking.checkPositionLetter(wordToFind, chosenLetter);
            System.out.println("etape 2: "+ Arrays.toString(letterPosition));
            String[] foundLetters = IsWorking.replaceLetter(letterPosition, chosenLetter, hiddenWord);
            System.out.println("etape 3: " + chosenLetter);
            isVictory = IsWorking.setVIctory(foundLetters, wordToFind);
            System.out.println("etape 4: " + wordToFind);
            System.out.println("etape 5: " +Arrays.toString(foundLetters));
            System.out.println(isVictory);

        };

        System.out.println("la partie est terminée");
        System.out.println("ok");

        HangManTest.printTest();
        HangManTest.checkPositionLetterTest();
        HangManTest.replaceLetterTest();
        HangManTest.setVictoryTest();
        HangManTest.hideWordTest();
    }

}
/**
 * Creating wiht <3 by LPS3 14/10/2018
 */
