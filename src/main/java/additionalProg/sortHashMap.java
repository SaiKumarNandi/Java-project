package additionalProg;
import java.util.*;
public class sortHashMap {


    // Method to sort a HashMap by keys
    public static HashMap<Integer, String> sortHashMapByKey(HashMap<Integer, String> map) {
        List<Map.Entry<Integer, String>> entryList = new ArrayList<>(map.entrySet());

        // Sort the list by keys
        entryList.sort(Map.Entry.comparingByKey());

        // Create a new LinkedHashMap to store the sorted entries
        HashMap<Integer, String> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }

    // Method to sort a HashMap by values
    public static HashMap<Integer, String> sortHashMapByValue(HashMap<Integer, String> map) {
        List<Map.Entry<Integer, String>> entryList = new ArrayList<>(map.entrySet());

        // Sort the list by values
        entryList.sort(Map.Entry.comparingByValue());

        // Create a new LinkedHashMap to store the sorted entries
        HashMap<Integer, String> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }
}
