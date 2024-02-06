package streamsAndLamdas;
import java.util.Arrays;
public class StringsContainingVowels {
    // Function to check if a string contains vowels
    public static boolean containsVowels(String str) {
        return str.toLowerCase().matches(".*[aeiou].*");
    }

    // Function to count the number of vowels in a string
    public static long countVowels(String str) {
        return str.toLowerCase().chars().filter(ch -> "aeiou".indexOf(ch) != -1).count();
    }
}
