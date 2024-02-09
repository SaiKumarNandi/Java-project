package streamsAndLamdas;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SumOfAllPosNumbersTest {

    @Test
    public void testSumOfAllPosNumbers() {
        List<Integer> numbers = Arrays.asList(-1,0,1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int expected=385;

        int result = SumOfAllPosNumbers.SumOfNumbers(numbers);

        assertEquals(expected, result);
    }





    @Test
    public void testSumOfNegNumbers() {
        List<Integer> numbers = Arrays.asList( -2,-4,-6, -8, -10);

        int expectedResult = 0;

        int result = SumOfAllPosNumbers.SumOfNumbers(numbers);

        assertEquals(expectedResult, result);
    }



    @Test
    public void testSumOfEmptyListNumbers() {
        List<Integer> numbers = Arrays.asList();

        int expected=0;

        int result = SumOfAllPosNumbers.SumOfNumbers(numbers);

        assertEquals(expected, result);
    }

}
