package additionalProg;
import java.util.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class reverseArrayListTest {
    @Test
    public void testReversingArray() {
        // Create an instance of reverseArrayList
        reverseArrayList reverser = new reverseArrayList();

        // Test case: Reversed ArrayList of ["Apple", "Banana", "Orange", "Grapes"]
        ArrayList<String> originalList = new ArrayList<>(Arrays.asList("String1", "String2", "String3", "String4"));
        List<String> reversedList = reverser.reversingArray(originalList);

        // Check if the reversed list is as expected
        List<String> expectedReversed = Arrays.asList("String4", "String3", "String2", "String1");
        assertEquals(expectedReversed, reversedList);

        // Test case: Reversed ArrayList of an empty list
        ArrayList<String> emptyList = new ArrayList<>();
        List<String> reversedEmptyList = reverser.reversingArray(emptyList);

        // Check if the reversed empty list is also empty
        List<String> expectedEmptyReversed = new ArrayList<>();
        assertEquals(expectedEmptyReversed, reversedEmptyList);

    }
}
