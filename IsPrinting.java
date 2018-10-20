
/**
 * IsPrinting
 */
import java.util.Hashtable;

public class IsPrinting {

  static String[] data = {      "\n----------------------\n| WELCOME TO HANGMAN |\n----------------------\n",
                                "Entrez le nombre maximum de lettres: ",
                                "Joueur 1, entrez un mot: ",
                                "Joueur 2, entrez une lettre: ",
                                "\n---------------------------\nBravo Joueur 2! Vous avez gagné !!\n---------------------------\n",
                                "\n---------------------------\nBravo Joueur 1! Vous avez gagné !!\n---------------------------\n"
                                };

  static String[] title = { "title", 
                            "userMaxLetter", 
                            "playerOne", 
                            "playerTwo", 
                            "win2", 
                            "win1" };

  // Method that displays and returns a sentence and that takes in parameter a
  // word.
  static String text(String word) {
    Hashtable<String, String> sentence = new Hashtable<String, String>();

    for (int i = 0; i < data.length; i++) {
      sentence.put(title[i], data[i]);
    }
    slowWriting(sentence.get(word));
    return sentence.get(word);
  }

  // Method for writing sentences letter by letter slowly.
  static void slowWriting(String word) {
    for (int i = 0; i < word.length(); i++) {
      System.out.print(word.charAt(i));
      try {
        Thread.sleep(30); // 20 milliseconds pause between each letter display.
      } catch (InterruptedException ie) {
        ie.printStackTrace();
      }
    }
  }
}

/**
 * Creating with <3 by LPS3 14/10/2018
 */
