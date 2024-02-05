package additionalProg;
import java.util.*;
public class reverseArrayList {
    public static List<String> reversingArray(ArrayList<String> array) {
        // Create an ArrayList


        // Display the original ArrayList
        System.out.println("Original ArrayList: " + array);

        // Create a copy of the original ArrayList
        List<String> reversedarray = new ArrayList<>(array);

        // Reverse the copy
        Collections.reverse(reversedarray);

        // Display the reversed ArrayList
        System.out.println("Reversed ArrayList: " + reversedarray);
        return reversedarray;
    }
}
