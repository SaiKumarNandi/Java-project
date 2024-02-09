package streamsAndLamdas;
import java.util.*;
import java.util.stream.Collectors;

public class SortingStrings {

    public static List<String> sortBasedOnLength(String[] stringArray) {
        return Arrays.stream(stringArray)
                .sorted((stringOne, stringTwo) -> {
                    if(stringOne.length() == stringTwo.length())
                        return stringOne.charAt(stringOne.length() - 1)
                                - stringTwo.charAt(stringTwo.length() - 1);
                    else
                        return stringOne.length() - stringTwo.length();
                })
                .collect(Collectors.toList());
    }
}
