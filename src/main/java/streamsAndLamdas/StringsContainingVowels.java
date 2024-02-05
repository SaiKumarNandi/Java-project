package streamsAndLamdas;
import java.util.Arrays;
public class StringsContainingVowels {
    public static void main(String[] args) {
        // Sample array of strings
        String[] inputArray = {"apple", "banana", "orange", "grape"};

        // Using streams and lambdas to filter strings with vowels and print
        Arrays.stream(inputArray)
                .filter(str -> containsVowels(str))
                .forEach(str -> {
                    int vowelCount = (int)countVowels(str);
                    System.out.println("String: " + str + ", Vowel Count: " + vowelCount);
                });
    }

    // Function to check if a string contains vowels
    private static boolean containsVowels(String str) {
        return str.toLowerCase().matches(".*[aeiou].*");
    }

    // Function to count the number of vowels in a string
    private static long countVowels(String str) {
        return str.toLowerCase().chars().filter(ch -> "aeiou".indexOf(ch) != -1).count();
    }
}
