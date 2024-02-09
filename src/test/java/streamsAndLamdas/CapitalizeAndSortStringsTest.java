package streamsAndLamdas;
import org.junit.Test;
import java.util.List;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CapitalizeAndSortStringsTest {
    @Test
    public void testCapitalizeAndSortStrings() {

        String[] inputArray = {"kjhugf", "tfgfhg", "kjgvh", "nbgfcgv"};
        List<String> result = CapitalizeAndSortStrings.capitalizeAndSortStrings(inputArray);
        assertEquals(Arrays.asList("Kjgvh", "Kjhugf", "Nbgfcgv", "Tfgfhg"), result);
    }




    @Test
    public void testCapitalizeAndSortStringsEmpty() {

        String[] inputArray = {};
        List<String> result = CapitalizeAndSortStrings.capitalizeAndSortStrings(inputArray);
        assertEquals(Arrays.asList(), result);
    }
}
