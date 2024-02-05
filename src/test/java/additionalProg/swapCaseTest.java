package additionalProg;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class swapCaseTest {
    @Test
    public void testSwapCase() {

        // Test case: Swap case of a mixed string
        String mixedString = "Hello World!";
        String resultMixed = swapCase.swapCase(mixedString);
        assertEquals("hELLO wORLD!", resultMixed);

        // Test case: Swap case of an all-uppercase string
        String allUpperCase = "HELLO";
        String resultAllUpperCase = swapCase.swapCase(allUpperCase);
        assertEquals("hello", resultAllUpperCase);

        // Test case: Swap case of an all-lowercase string
        String allLowerCase = "world";
        String resultAllLowerCase = swapCase.swapCase(allLowerCase);
        assertEquals("WORLD", resultAllLowerCase);

        // Test case: Swap case of an empty string
        String emptyString = "";
        String resultEmptyString = swapCase.swapCase(emptyString);
        assertEquals("", resultEmptyString);

    }

}
