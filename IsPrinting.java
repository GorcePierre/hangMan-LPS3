
/**
 * IsPrinting
 */
import java.io.IOError;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Hashtable;
import java.util.Arrays;
import java.util.ArrayList;
import java.io.FileNotFoundException;;

public class IsPrinting {

  static String[] data = { "\n----------------------\n| WELCOME TO HANGMAN |\n----------------------\n",
      "Entrez le nombre maximum de lettres: ", "Joueur1, entrez un mot: ", "Joueur2, entrez une lettre: ",
      "\n---------------------------\nBravo ! Vous avez gagné !!\n---------------------------\n" };

  static String[] title = { "title", "userMaxLetter", "playerOne", "playerTwo", "win" };

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
        Thread.sleep(20); // 20 milliseconds pause between each letter display.
      } catch (InterruptedException ie) {
        ie.printStackTrace();
      }
    }
  }

  // read .txt files , fetch data & title

  public static void ReadContents() throws FileNotFoundException {

    try {
      // create token1
      String token1 = "";

      // create Scanner inFile1
      Scanner contents = new Scanner(new File("contentsIsprinting.txt")).useDelimiter(",");

      // List<String> temps = new LinkedList<String>();
      List<String> contentsArrayList = new ArrayList<String>();

      while (contents.hasNext()) {
        // find next line
        token1 = contents.next();
        contentsArrayList.add(token1);
      }
      contents.close();

      System.out.println(contentsArrayList);
      String[] contentsArray = contentsArrayList.toArray(new String[0]);
      System.out.println(Arrays.toString(contentsArray));

      for (String s : contentsArray) {
        System.out.println(s);
      }

    } catch (FileNotFoundException ex) {
      ex.fillInStackTrace();
    }
  }
}

/**
 * Creating with <3 by LPS3 14/10/2018
 */
