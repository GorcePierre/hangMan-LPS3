import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 * IsWorking
 */
public class IsWorking {

    public static String randomWord() {
  		String[] listWords = {"ABLATION","HYPOCRISIE","INTERMINABLE","REVOLUTION","ERUDIT","ACCUEIL","EXPLOSION","RELIURE","PETIT","PIQUET","SIMPLON","BIERE"};
  		int randomNumber = new Random().nextInt(listWords.length);
  		return listWords[randomNumber];
    }

    public static String logicMode(char letter) throws FileNotFoundException{
      Word word = new Word();
      if (letter == 'S') {
        word.setWord(randomWord());
      }
      else {
        IsPrinting.text("userMaxLetter");
        int maxLength = User.chooseMaxLength();
        IsPrinting.text("playerOne");
        word.setWord(User.isSelectWord(maxLength));
      }
      return word.getWord();
    }

    public static void bruitage(String occasion) throws LineUnavailableException, UnsupportedAudioFileException, IOException {
	  URL url = new URL(
	            "file:"+occasion+".wav");
	        Clip clip = AudioSystem.getClip();
	        AudioInputStream ais = AudioSystem.
              getAudioInputStream( url );
          clip.open(ais);
	        clip.start();
    }

    public static void endTour(boolean victory, String wordToFind, int tryHit) throws LineUnavailableException, UnsupportedAudioFileException, IOException {
    	if(victory) {
            IsWorking.bruitage("./assets/sounds/victory");
            IsPrinting.text("win2");
    	}
    	else {
    		IsPrinting.dessin(tryHit);
            IsWorking.bruitage("./assets/sounds/loose");
            IsPrinting.text("loose");
            IsPrinting.slowWriting(wordToFind);
    	}
    }

    public static String readPassword () {
       EraserThread et = new EraserThread();
       Thread mask = new Thread(et);
       mask.start();
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       String password = "";

       try {
          password = in.readLine();
       } catch (IOException ioe) {
         ioe.printStackTrace();
       }
       // stop masking
       et.stopMasking();
       // return the password entered by the user
       return password;
    }
}
/**
 * Creating with <3 by LPS3 14/10/2018
 */
