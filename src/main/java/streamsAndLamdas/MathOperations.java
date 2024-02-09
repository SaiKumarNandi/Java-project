package streamsAndLamdas;
import java.util.Arrays;

    @FunctionalInterface
    interface MathOperation {
        int operate(int a, int b);
    }
    public class MathOperations {
    public static int NumbersSum(int[] numbers) {
        int sum = Arrays.stream(numbers)
                .reduce(0, (a, b) -> a + b);
       return sum;
        }

}
