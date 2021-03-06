import java.util.Arrays;
import java.io.FileNotFoundException;

/**
 * HangManTest
 */
public class HangManTest {

    public static void launcherTest() throws FileNotFoundException {
        printTest();
        checkPositionLetterTest();
        verifyLetterTest();
        replaceLetterTest();
        setVictoryTest();
        hideWordTest();
    }

    /**
     * IsPrinting test.
     */

    public static void printTest() throws FileNotFoundException {
        System.out.println("\n                Joueur 1 entrez un mot: ");
        String index = "playerOne";
        assertEquals(" --> PRINTED TEXT", "\n                Joueur 1 entrez un mot: ", IsPrinting.text(index));

    }

    /**
     * IsWorking test.
     */

    public static void checkPositionLetterTest() {
        int[] letterIndex = { 1, 4 };
        int[] letterIndex1 = { 2, 5 };
        int[] letterIndex2 = { 3 };

        assertEquals(" --> CHECKED LETTER", letterIndex, Word.checkPositionLetter("jadhad", "a"));
        assertEquals(" --> CHECKED LETTER", letterIndex1, Word.checkPositionLetter("jadhad", "d"));
        assertEquals(" --> CHECKED LETTER", letterIndex2, Word.checkPositionLetter("jadhad", "h"));

    }
    
    public static void verifyLetterTest() {
    	assertTrue("--> LETTER OK", Word.verifyLetter("a", "jahad"));
    	assertTrue("--> LETTER OK", Word.verifyLetter("d", "jahad"));
    	assertTrue("--> LETTER OK", Word.verifyLetter("j", "jahad"));
    	assertFalse("--> LETTER NOT FOUND", Word.verifyLetter("x", "jahad"));
    	assertFalse("--> LETTER NOT FOUND", Word.verifyLetter("b", "jahad"));
    }

    public static void replaceLetterTest() {
        int[] letterPosition = { 3 };
        String[] array = { "_", "_", "_", "_" };
        String[] replacedLetter = { "_", "_", "_", "e" };
        assertEquals("--> REPLACED LETTER", replacedLetter, Word.replaceLetter(letterPosition, "e", array));
        int[] letterPosition1 = { 0 };
        String[] array1 = { "_", "_", "_", "_" };
        String[] replacedLetter1 = { "T", "_", "_", "_" };
        assertEquals("--> REPLACED LETTER", replacedLetter1, Word.replaceLetter(letterPosition1, "T", array1));
        int[] letterPosition3 = { 1 };
        String[] array3 = { "r", "_", "s", "t" };
        String[] replacedLetter3 = { "r", "e", "s", "t" };
        assertEquals("--> REPLACED LETTER", replacedLetter3, Word.replaceLetter(letterPosition3, "e", array3));

    };

    public static void setVictoryTest() {

    	String[] hiddenWord = {"b", "r", "a", "_", "o"};
        assertFalse("--> NOT VICTORY", Word.setVIctory(hiddenWord, "bravo", 3));
    	String[] hiddenWord2 = {"b", "r", "a", "v", "o"};
        assertTrue("--> VICTORY", Word.setVIctory(hiddenWord2, "bravo", 3));

    }

    /**
     * User test.
     */



    /**
     * Word test.
     */
    public static void hideWordTest() {
        String[] hiddenWord = { "_", "_", "_", "_", "_" };

        assertEquals("--> HIDE WORD", hiddenWord, Word.hideWord("arbre"));
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

    public static void assertEquals(String message, String[] expected, String[] res) {
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