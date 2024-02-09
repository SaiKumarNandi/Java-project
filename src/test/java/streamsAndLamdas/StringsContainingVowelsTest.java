package streamsAndLamdas;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
public class StringsContainingVowelsTest {
    @Test
    public void testContainsVowels() {
        // Create an instance of StringsContainingVowels
        StringsContainingVowels vowelsChecker = new StringsContainingVowels();

        // Test case: String with vowels
        assertTrue(StringsContainingVowels.containsVowels("apple"));

        // Test case: String without vowels
        assertFalse(StringsContainingVowels.containsVowels("xyz"));

        // Test case: String with both vowels and non-vowels
        assertTrue(StringsContainingVowels.containsVowels("java"));

        // Test case: Empty string
        assertFalse(StringsContainingVowels.containsVowels(""));

        // Add more test cases as needed
    }

    @Test
    public void testCountVowels() {

        StringsContainingVowels vowelsCounter = new StringsContainingVowels();

        long result = StringsContainingVowels.countVowels("banana");
        assertEquals(3, result);

        result = StringsContainingVowels.countVowels("xyz");
        assertEquals(0, result);

        result = StringsContainingVowels.countVowels("");
        assertEquals(0, result);

        // Add more test cases as needed
    }
}
