import java.util.Arrays;

/**
 * HangMan
 */
public class HangMan {

    public static void main(String[] args) {
<<<<<<< HEAD
      // modif laurent
        Utilities.clearScreen();
=======
>>>>>>> master

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
        

        while (!isVictory){
            IsPrinting.text(3);
            String chosenLetter = User.isSelectletter();
            int[] letterPosition = IsWorking.checkPositionLetter(wordToFind, chosenLetter);
            String[] foundLetters = IsWorking.replaceLetter(letterPosition, chosenLetter, hiddenWord);
            isVictory = IsWorking.setVIctory(foundLetters, wordToFind);

        };

        System.out.println("le player 2 a gagné");
        System.out.println("ok");
    }

}
/**
 * Creating wiht <3 by LPS3 14/10/2018
 */
