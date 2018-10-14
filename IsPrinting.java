/**
 * IsPrinting
 */
public class IsPrinting {

    static String[] data = { "WELCOME TO HANGMAN", "Are you ready player 1 ?(y/n)", null };

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