import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * User
 */
public class User {

    static Scanner input = new Scanner(System.in);


    public static char choiceModeGame() throws FileNotFoundException{
      char letter = ' ';
      do {
        IsPrinting.text("modeToPlay");
        letter = input.nextLine().toUpperCase().charAt(0);
      } while (letter != 'S' && letter != 'M');
      return letter;
    }


    public static String isSelectWord(int maxLength) {
        String word = IsWorking.readPassword(); //print with stars;
        while(word.length() > maxLength) {


        	System.out.print("             le mot ne doit pas depasser " + maxLength + " lettres: ");

            word = input.nextLine();
        }
        return word;
    }

    public static String isSelectletter() {
        String ChosenLetter = input.nextLine().toUpperCase();
        while (ChosenLetter.length() > 1 || ChosenLetter.length() <= 0) {
            System.out.println("Merci de saisir un seul caractere: ");
            ChosenLetter = input.nextLine();
        }
        return ChosenLetter;
    }

    public static int chooseMaxLength() {
        while (!input.hasNextInt()) {
            System.out.print("Merci de saisir un nombre: ");
            input.nextLine();
        }
        int maxLength = Integer.parseInt(input.nextLine());
        return maxLength;
    }

}
/**
 * Creating <3 by LPS3 14/10/2018
 */
