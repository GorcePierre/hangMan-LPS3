import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * User
 */
public class User {

     static Scanner input = new Scanner(System.in); 

    public static String isSelectWord(int maxLength) {
        String word = input.nextLine();
        while(word.length() > maxLength) {
        	System.out.println("le mot ne doit pas depasser " + maxLength + " lettres");
            word = input.nextLine();
        }
        return word;
    }

    public static String isSelectletter() {
        String ChosenLetter = input.nextLine();
        return ChosenLetter;
    }
    
    public static int chooseMaxLength() {
    	int maxLength = Integer.parseInt(input.nextLine());
    	return maxLength;
    }
}
/**
 * Creating <3 by LPS3 14/10/2018
 */