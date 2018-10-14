/**
 * HangManTest
 */
public class HangManTest {

    public static void printTest() {
        String[] message = { "ok" };
        assertEquals(" --> PRINTED", "ok", IsPrinting.text(message));

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
 * Creating <3 by LPS3
 *  14/10/2018
 */