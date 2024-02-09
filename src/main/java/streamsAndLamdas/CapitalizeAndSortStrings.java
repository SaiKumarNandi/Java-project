package streamsAndLamdas;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
public class CapitalizeAndSortStrings {
    public  static List<String> capitalizeAndSortStrings(String[] inputArray) {


        List<String> capitalizedAndSortedStrings = Arrays.stream(inputArray)
                .map(str -> Character.toUpperCase(str.charAt(0)) + str.substring(1))
                .sorted()
                .collect(Collectors.toList());
        return capitalizedAndSortedStrings;
    }



}
