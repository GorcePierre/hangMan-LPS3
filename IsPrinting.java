
/**
 * IsPrinting
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

public class IsPrinting {



  // Method that displays and returns a sentence and that takes in parameter a
  // word.
  static String text(String word) throws FileNotFoundException {
    String[] data = ReadContents("contentsIsPrinting.txt");
    String[] title = ReadContents("hastableKeys.txt");
    Hashtable<String, String> sentence = new Hashtable<String, String>(); 

    for (int i = 0; i < data.length; i++) {
      //System.out.print(data[i]);
      sentence.put(title[i], data[i]);
    }
    slowWriting(sentence.get(word));
    return sentence.get(word);
  }
  
  static String dessin(int index) throws FileNotFoundException {
	    String[] data = ReadContents("dessins.txt");
	    System.out.println(data[index]);
	    return data[index];
	  }

  // Method for writing sentences letter by letter slowly.
  static void slowWriting(String word) {
    for (int i = 0; i < word.length(); i++) {
      System.out.print(word.charAt(i));
      try {
        Thread.sleep(30); // 30 milliseconds pause between each letter display.
      } catch (InterruptedException ie) {
        ie.printStackTrace();
      }
    }
  }

  // read .txt files , fetch content & title

  public static String[] ReadContents(String path) throws FileNotFoundException { // mise en parametre du chemin vers le fichier (ds)

    try {
      String token1 = "";
      Scanner contents = new Scanner(new File(path)).useDelimiter("/");
      List<String> contentsArrayList = new ArrayList<String>();
      while (contents.hasNext()) {
        token1 = contents.next();
        contentsArrayList.add(token1);
      }
      contents.close();
      String[] contentsArray = contentsArrayList.toArray(new String[0]);
      return contentsArray;
    } catch (FileNotFoundException ex) {
      System.out.println(ex.fillInStackTrace());
    }
    String[] erreur = { "erreur", "stop" };
    return erreur;
  }
}

/**
 * Creating with <3 by LPS3 14/10/2018
 */
