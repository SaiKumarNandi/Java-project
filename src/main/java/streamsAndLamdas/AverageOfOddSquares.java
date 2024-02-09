package streamsAndLamdas;
import java.util.Arrays;
public class AverageOfOddSquares {
    public static double findAverageOfOddSquares(int[] numbers) {
        return Arrays.stream(numbers)
                .filter(n -> n % 2 != 0)
                .mapToDouble(n -> n * n)
                .average()
                .orElse(0);
    }
}
