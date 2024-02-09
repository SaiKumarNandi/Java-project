package streamsAndLamdas;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class MaxStringsTest {

    @Test
    void testFindMaxElement() {
        List<String> strings = Arrays.asList("String1", "String2", "String3", "String4", "String5");
        Optional<String> maxElement = MaxStrings.findMaxElement(strings);

        assertEquals("String5", maxElement.get());
    }



    @Test
    void testFindMaxElementForEmpty() {
        List<String> strings = Arrays.asList("");

        Optional<String> maxElement = MaxStrings.findMaxElement(strings);

        assertEquals("", maxElement.get());
    }




    @Test
    void testFindMaxElementForSame() {
        List<String> strings = Arrays.asList("String","String","String");

        Optional<String> maxElement = MaxStrings.findMaxElement(strings);

        assertEquals("String", maxElement.get());
    }
}
