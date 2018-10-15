/**
 * IsPrinting
 */
public class IsPrinting {

    static String[] data = { 
                                "WELCOME TO HANGMAN", 
                                "Joueur1, entrez un mot: ", 
                                "Joueur2, entrez une lettre: ", 
                                null };

    public static String text(int index) {
        String editedText = "";
        editedText = data[index];
        System.out.println(editedText);
        return editedText;
    }
}
/**
 * Creating with <3 by LPS3 14/10/2018
 */