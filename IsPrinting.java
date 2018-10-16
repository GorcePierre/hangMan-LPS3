/**
 * IsPrinting
 */
public class IsPrinting {

    static String[] data = {
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
      String editedText = "\n----------------------\n| WELCOME TO HANGMAN |\n----------------------\n";
      System.out.println(editedText);
      return editedText;
    }
}
/**
 * Creating with <3 by LPS3 14/10/2018
 */
