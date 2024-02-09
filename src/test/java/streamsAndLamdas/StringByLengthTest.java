package streamsAndLamdas;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class StringByLengthTest {
    @Test
    void testGroupByLength() {
        List<String> strings = Arrays.asList("jghfh", "jghfdsdf", "jhgd", "hdgfkuyg", "jgdfd","hgsr","kdhgfuhve","hdjs");
        Map<Integer, List<String>> groupedStrings = StringsByLength.GroupByStringLength(strings);

        // Ensure that the map contains the expected keys and values
        assertEquals(2, groupedStrings.get(5).size());
        assertEquals(2, groupedStrings.get(8).size());
        assertEquals(1, groupedStrings.get(9).size());
        assertEquals(3, groupedStrings.get(4).size());
    }



    @Test
    void testGroupByLengthForSame() {
        List<String> strings = Arrays.asList("String", "String", "string","fjgdfd");
        Map<Integer, List<String>> groupedStrings = StringsByLength.GroupByStringLength(strings);

        // Ensure that the map contains the expected keys and values
        assertEquals(4, groupedStrings.get(6).size());

    }




    @Test
    void testGroupByLengthForSpace() {
        List<String> strings = Arrays.asList("","   ", "   ","    ");
        Map<Integer, List<String>> groupedStrings = StringsByLength.GroupByStringLength(strings);

        // Ensure that the map contains the expected keys and values
        assertEquals(1, groupedStrings.get(0).size());
        assertEquals(2, groupedStrings.get(3).size());
        assertEquals(1, groupedStrings.get(4).size());

    }



    @Test
    void testGroupByLengthForEmpty() {
        List<String> strings = Arrays.asList();
        Map<Integer, List<String>> groupedStrings = StringsByLength.GroupByStringLength(strings);
        Map<Integer, List<String>> expectedgroupedStrings=new HashMap<>();
        assertEquals(expectedgroupedStrings, groupedStrings);


    }
}
