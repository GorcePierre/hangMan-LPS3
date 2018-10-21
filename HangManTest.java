import java.util.Arrays;

/**
 * HangManTest
 */
public class HangManTest {
    /**
     * IsPrinting test.
     */

    public static void printTest() {
        //assertEquals(" --> PRINTED TEXT", "Joueur 1, entrez un mot: ", IsPrinting.text("playerOne"));

    }

    /**
     * IsWorking test.
     */

    public static void checkPositionLetterTest() {
        int[] letterIndex = { 1, 4 };
        int[] letterIndex1 = { 2, 5 };
        int[] letterIndex2 = { 3 };

        assertEquals(" --> CHECKED LETTER", letterIndex, IsWorking.checkPositionLetter("jadhad", "a"));
        assertEquals(" --> CHECKED LETTER", letterIndex1, IsWorking.checkPositionLetter("jadhad", "d"));
        assertEquals(" --> CHECKED LETTER", letterIndex2, IsWorking.checkPositionLetter("jadhad", "h"));

    }

    public static void replaceLetterTest() {
        int[] letterPosition = { 3 };
        String[] array = { "_", "_", "_", "_" };
        String[] replacedLetter = { "_", "_", "_", "e" };
        assertEquals("--> REPLACED LETTER", replacedLetter, IsWorking.replaceLetter(letterPosition, "e", array));
        int[] letterPosition1 = { 0 };
        String[] array1 = { "_", "_", "_", "_" };
        String[] replacedLetter1 = { "T", "_", "_", "_" };
        assertEquals("--> REPLACED LETTER", replacedLetter1, IsWorking.replaceLetter(letterPosition1, "T", array1));
        int[] letterPosition3 = { 1 };
        String[] array3 = { "r", "_", "s", "t" };
        String[] replacedLetter3 = { "r", "e", "s", "t" };
        assertEquals("--> REPLACED LETTER", replacedLetter3, IsWorking.replaceLetter(letterPosition3, "e", array3));

    };

    public static void setVictoryTest() {

        //assertTrue("--> SET VICTORY", Word.setVictory());
        
    }

    /**
     * User test.
     */



    /**
     * Word test.
     */
    public static void hideWordTest() {
        String[] hiddenWord = {"_ ","_ ","_ ","_ ","_ "};

        assertEquals("--> HIDE WORD",hiddenWord,Word.hideWord("arbre"));
    }
    /**
     * Testing functions.
     */

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
        if (Arrays.equals(res, expected)) {
            System.out.println("\nOK >> " + message);
        } else {
            throw new Error("\nKO!! >> " + message);
        }
    }

    public static void assertEquals(String message, String[] expected, String[] res ) {
        if (Arrays.equals(res, expected)) {
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
 * Creating with <3 by LPS3 14/10/2018
 */