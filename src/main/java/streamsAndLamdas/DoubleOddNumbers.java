package streamsAndLamdas;

import java.util.List;
import java.util.stream.Collectors;


public class DoubleOddNumbers {

    public static List<Integer> SumOfOddNumbers(List<Integer> numbers) {

        List<Integer> doubledOddNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .collect(Collectors.toList());

        return doubledOddNumbers;
    }
}
