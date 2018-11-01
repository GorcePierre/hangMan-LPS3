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
        String wordToFind = IsWorking.logicMode(letterChoiceMode).toLowerCase();
        String[] hiddenWord = new String[wordToFind.length()];
        //System.out.println(wordToFind);
        hiddenWord = Word.hideWord(wordToFind);
        String playerMode;
    	if(letterChoiceMode == 'S') {
    		playerMode = "onePlayer";
    	}
    	else {
    		playerMode = "playerTwo";
    	}

        int tryHit = 0;
        while (!isVictory && tryHit < 9) {
    		IsPrinting.dessin(tryHit);
        	Word.showWord(hiddenWord, tryHit);
        	IsPrinting.text(playerMode);
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
		IsWorking.endTour(isVictory, wordToFind, tryHit);
        

		Thread.sleep(5000);

        HangManTest.launcherTest();
    }

}
/**
 * Creating wiht <3 by LPS3 14/10/2018
 */
