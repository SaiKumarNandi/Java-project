package additionalProg;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class sortHashMapTest {
    @Test
    public void testSortHashMapByKey() {
        // Create an instance of sortHashMap
        sortHashMap sorter = new sortHashMap();

        // Test case: Sorting HashMap by keys
        HashMap<Integer, String> originalMap = new HashMap<>();
        originalMap.put(3, "Abnv");
        originalMap.put(1, "dkngkn");
        originalMap.put(4, "ejnkj");
        originalMap.put(2, "bsajd");

        HashMap<Integer, String> sortedMapByKey = sorter.sortHashMapByKey(originalMap);

        // Check if the sorted map by keys is as expected
        HashMap<Integer, String> expectedSortedByKey = new LinkedHashMap<>();
        expectedSortedByKey.put(1, "dkngkn");
        expectedSortedByKey.put(2, "bsajd");
        expectedSortedByKey.put(3, "Abnv");
        expectedSortedByKey.put(4, "ejnkj");
        assertEquals(expectedSortedByKey, sortedMapByKey);

        // Add more test cases as needed
    }


    @Test
    public void testSortHashMapEmptyByKey() {
        // Create an instance of sortHashMap
        sortHashMap sorter = new sortHashMap();

        // Test case: Sorting Empty HashMap by keys
        HashMap<Integer, String> originalMap = new HashMap<>();

        HashMap<Integer, String> sortedMapByKey = sorter.sortHashMapByKey(originalMap);

        HashMap<Integer, String> expectedSortedByKey = new LinkedHashMap<>();
        assertEquals(expectedSortedByKey, sortedMapByKey);

    }

    @Test
    public void testSortHashMapByValue() {
        // Create an instance of sortHashMap
        sortHashMap sorter = new sortHashMap();

        // Test case: Sorting HashMap by values
        HashMap<Integer, String> originalMap = new HashMap<>();
        originalMap.put(3, "Abnv");
        originalMap.put(1, "dkngkn");
        originalMap.put(4, "ejnkj");
        originalMap.put(2, "bsajd");

        HashMap<Integer, String> sortedMapByValue = sorter.sortHashMapByValue(originalMap);

        // Check if the sorted map by values is as expected
        HashMap<Integer, String> expectedSortedByValue = new LinkedHashMap<>();
        expectedSortedByValue.put(3, "Abnv");
        expectedSortedByValue.put(2, "bsajd");
        expectedSortedByValue.put(1, "dkngkn");
        expectedSortedByValue.put(4, "ejnkj");
        assertEquals(expectedSortedByValue, sortedMapByValue);

    }

    @Test
    public void testSortHashMapEmptyByValue() {
        // Create an instance of sortHashMap
        sortHashMap sorter = new sortHashMap();
        // Test case: Sorting Empty HashMap by values
        HashMap<Integer, String> originalMap = new HashMap<>();

        HashMap<Integer, String> sortedMapByValue = sorter.sortHashMapByValue(originalMap);

        HashMap<Integer, String> expectedSortedByValue = new LinkedHashMap<>();
        assertEquals(expectedSortedByValue, sortedMapByValue);

    }


}
