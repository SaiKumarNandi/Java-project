package streamsAndLamdas;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DoubleOddNumbersTest {
    @Test
    public void testSumOfOddNumbers() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> expectedResult = List.of(4, 8, 12, 16, 20);

        List<Integer> result = DoubleOddNumbers.SumOfOddNumbers(numbers);

        assertEquals(expectedResult, result);
    }





    @Test
    public void testSumOfNoOddNumbers() {
        List<Integer> numbers = Arrays.asList( 1,3,5,7,9);

        List<Integer> expectedResult = Arrays.asList();

        List<Integer> result = DoubleOddNumbers.SumOfOddNumbers(numbers);

        assertEquals(expectedResult, result);
    }



    @Test
    public void testSumOfEmptyListOddNumbers() {
        List<Integer> numbers = Arrays.asList();

        List<Integer> expectedResult = Arrays.asList();

        List<Integer> result = DoubleOddNumbers.SumOfOddNumbers(numbers);

        assertEquals(expectedResult, result);
    }





}
