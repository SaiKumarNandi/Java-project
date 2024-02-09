package streamsAndLamdas;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class evenNumbersSumTest {
    @Test
    public void testSumOfOddNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> expectedResult = Arrays.asList(2, 6, 10, 14, 18);

        List<Integer> result = evenNumbersSum.SumOfOddNumbers(numbers);

        assertEquals(expectedResult, result);
    }





    @Test
    public void testSumOfNoOddNumbers() {
        List<Integer> numbers = Arrays.asList( 2,4,6, 8, 10);

        List<Integer> expectedResult = Arrays.asList();

        List<Integer> result = evenNumbersSum.SumOfOddNumbers(numbers);

        assertEquals(expectedResult, result);
    }



    @Test
    public void testSumOfEmptyListOddNumbers() {
        List<Integer> numbers = Arrays.asList();

        List<Integer> expectedResult = Arrays.asList();

        List<Integer> result = evenNumbersSum.SumOfOddNumbers(numbers);

        assertEquals(expectedResult, result);
    }





}
