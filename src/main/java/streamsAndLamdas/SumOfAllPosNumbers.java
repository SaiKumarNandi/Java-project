package streamsAndLamdas;

import java.util.List;

public class SumOfAllPosNumbers {
    public static int SumOfNumbers(List<Integer> numbers) {

        return numbers.stream()
                .filter(n -> n >= 0)
                .mapToInt(n -> n * n)
                .sum();
    }
}
