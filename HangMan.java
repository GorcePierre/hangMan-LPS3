import java.io.FileNotFoundException;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 * HangMan
 */
public class HangMan {

    public static void main(String[] args) throws FileNotFoundException {
        try {
			IsWorking.bruitage("title");
		} catch (LineUnavailableException | UnsupportedAudioFileException | IOException e) {
			e.printStackTrace();
		}
        IsPrinting.text("title");
        char letterChoiceMode = User.choiceModeGame();
        boolean isVictory = false;
        String wordToFind = IsWorking.logicMode(letterChoiceMode).toLowerCase();
        String[] hiddenWord = new String[wordToFind.length()];
        
        hiddenWord = Word.hideWord(wordToFind.toLowerCase());

        int tryHit = 1;

        while (!isVictory) {
            IsPrinting.text("playerTwo");
            String chosenLetter = User.isSelectletter().toLowerCase();
            int[] letterPosition = Word.checkPositionLetter(wordToFind, chosenLetter);
            String[] foundLetters = Word.replaceLetter(letterPosition, chosenLetter, hiddenWord);
            isVictory = Word.setVIctory(foundLetters, wordToFind, tryHit);
            tryHit++;

        }
        try {
			IsWorking.bruitage("victory");
		} catch (LineUnavailableException | UnsupportedAudioFileException | IOException e) {
			e.printStackTrace();
		}
        
        if (tryHit < 7) {
            IsPrinting.text("win2");
        } else
            IsPrinting.text("win1");
        

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

        HangManTest.launcherTest();
    }

}
/**
 * Creating wiht <3 by LPS3 14/10/2018
 */
