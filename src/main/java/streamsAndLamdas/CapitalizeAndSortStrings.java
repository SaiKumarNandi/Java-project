package streamsAndLamdas;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
public class CapitalizeAndSortStrings {
    public  static List<String> capitalizeAndSortStrings(String[] inputArray) {


        // Using streams and lambdas to capitalize the first letter of each string
        List<String> capitalizedAndSortedStrings = Arrays.stream(inputArray)
                .map(str -> Character.toUpperCase(str.charAt(0)) + str.substring(1))
                .sorted()
                .collect(Collectors.toList());

        // Printing the result
        capitalizedAndSortedStrings.forEach(System.out::println);
        return capitalizedAndSortedStrings;
    }



}
