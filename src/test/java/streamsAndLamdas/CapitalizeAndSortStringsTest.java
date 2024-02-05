package streamsAndLamdas;
import org.junit.Test;
import java.util.List;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CapitalizeAndSortStringsTest {
    @Test
    public void testCapitalizeAndSortStrings() {
        // Arrange
        String[] inputArray = {"apple", "banana", "orange", "grape"};

        // Act
        List<String> result = CapitalizeAndSortStrings.capitalizeAndSortStrings(inputArray);

        // Assert
        assertEquals(Arrays.asList("Apple", "Banana", "Grape", "Orange"), result);
    }
}
