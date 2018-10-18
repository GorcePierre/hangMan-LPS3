/**
 * IsPrinting
 */
import java.util.Hashtable;

public class IsPrinting {

    static String[] data = {    "\n----------------------\n| WELCOME TO HANGMAN |\n----------------------\n",
                                "Entrez le nombre maximum de lettres",
                                "Joueur1, entrez un mot: ",
                                "Joueur2, entrez une lettre: ",
                                null };

    public static String text(int index) {
        String editedText = "";
        editedText = data[index];
        System.out.println(editedText);
        return editedText;
    }

    public static String title(){
      String editedText = data[0];
      System.out.println(editedText);
      return editedText;
    }
}

//mon changement : remplacer la premiere class par celle ci et dans le main changer IsPrinting(0) par IsPrinting("title")
/* public class IsPrinting(String word){
  Hashtable<String, String> sentence = new Hashtable<String, String>();
  sentence.put("title", "\n----------------------\n| WELCOME TO HANGMAN |\n----------------------\n");
  sentence.put("userMaxLetter", "Entrez le nombre maximum de lettres");
  sentence.put("playerOne", "Joueur1, entrez un mot: ");
  sentence.put("playerTwo", "Joueur2, entrez une lettre: ");
  System.out.println(sentence.get(word));
  return sentence.get(word);
} */

/**
 * Creating with <3 by LPS3 14/10/2018
 */
