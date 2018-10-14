import java.util.Arrays;
/**
 * HangManTest
 */
public class HangManTest {

    public static void printTest() {
        int index = 0;
        assertEquals(" --> PRINTED TEXT", "WELCOME TO HANGMAN", IsPrinting.text(index));

    }

    public static void checkPositionLetterTest() {
        int[] letterIndex = {1,4};
        int[] letterIndex1 = {2,5};
        int[] letterIndex2 = {3};

        assertEquals(" --> CHECKED LETTER", letterIndex, IsWorking.checkPositionLetter("jadhad", "a"));
        assertEquals(" --> CHECKED LETTER", letterIndex1, IsWorking.checkPositionLetter("jadhad", "d"));
        assertEquals(" --> CHECKED LETTER", letterIndex2, IsWorking.checkPositionLetter("jadhad", "h"));

    }

    public static void assertEquals(String message, double expected, double res) {
        if (Math.abs(expected - res) < 0.0001) {
            System.out.println("\nOK >> " + message);
        } else {
            throw new Error("\nKO!! >> " + message);
        }
    }

    public static void assertEquals(String message, int expected, int res) {
        if (expected == res) {
            System.out.println("\nOK >> " + message);
        } else {
            throw new Error("\nKO!! >> " + message);
        }
    }

    public static void assertEquals(String message, int[] expected, int[] res) {
        if (Arrays.equals(res,expected)) {
            System.out.println("\nOK >> " + message);
        } else {
            throw new Error("\nKO!! >> " + message);
        }
    }

    public static void assertEquals(String message, char expected, char res) {
        if (expected == res) {
            System.out.println("\nOK >> " + message);
        } else {
            throw new Error("\nKO!! >> " + message);
        }
    }

    public static void assertEquals(String message, String expected, String res) {
        if (expected == res) {
            System.out.println("\nOK >> " + message);
        } else {
            throw new Error("\nKO!! >> " + message);
        }
    }

    public static void assertTrue(String message, boolean res) {
        if (res) {
            System.out.println("\nOK >> " + message);
        } else {
            throw new Error("\nKO!! >> " + message);
        }
    }

    public static void assertFalse(String message, boolean res) {
        if (!res) {
            System.out.println("\nOK >> " + message);
        } else {
            throw new Error("\nKO!! >> " + message);
        }
    }
}
/**
 * Creating  with <3 by LPS3 14/10/2018
 */