import java.io.FileNotFoundException;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 * HangMan
 */
public class HangMan {


    public static void main(String[] args) throws FileNotFoundException, LineUnavailableException,  UnsupportedAudioFileException, IOException, InterruptedException{
        
		IsWorking.bruitage("title");
		
        IsPrinting.text("title");
        char letterChoiceMode = User.choiceModeGame();
        boolean isVictory = false;
        String wordToFind = IsWorking.logicMode(letterChoiceMode);
        String[] hiddenWord = new String[wordToFind.length()];
System.out.println(wordToFind);
        hiddenWord = Word.hideWord(wordToFind);

        int tryHit = 1;

        while (!isVictory && tryHit > 0) {
        	Word.showWord(hiddenWord, tryHit);
            IsPrinting.text("playerTwo");
            String chosenLetter = User.isSelectletter();
            boolean letterOk = Word.verifyLetter(chosenLetter, wordToFind);
            if(letterOk) {
            	int[] letterPosition = Word.checkPositionLetter(wordToFind, chosenLetter);
            	String[] foundLetters = Word.replaceLetter(letterPosition, chosenLetter, hiddenWord);
            	isVictory = Word.setVIctory(foundLetters, wordToFind, tryHit);
            }
            else {
            	tryHit ++;
            }

        }
		
        IsWorking.bruitage("victory");
        
        if (tryHit < 7) {
            IsPrinting.text("win2");
        } else
            IsPrinting.text("win1");
        

		Thread.sleep(5000);

        HangManTest.launcherTest();
    }

}
/**
 * Creating wiht <3 by LPS3 14/10/2018
 */
