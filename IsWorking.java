import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
      System.out.println(randomNumber);
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

    public static String[] replaceLetter(int[] positions, String letter, String[] hiddenWord) {

        for (int position : positions) {
            hiddenWord[position] = letter;
        }
        return hiddenWord;
    }


    public static boolean setVIctory(String[] hiddenWord, String word,int tryNum) {
        if (tryNum < 7) {
            String isStringFoundWord = String.join("", hiddenWord);
            System.out.println("            le mot caché est : " + isStringFoundWord);
            System.out.println("            il reste " + (7 - (tryNum)) + " tentative(s)");
            if (isStringFoundWord.equals(word)) {
                return true;
            } else {
                return false;
            }

        }

        return true;
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
}
/**
 * Creating with <3 by LPS3 14/10/2018
 */
