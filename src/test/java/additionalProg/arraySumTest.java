package additionalProg;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class arraySumTest {
    @Test
    public void testCalculateSum() {

        // Test case: Sum of positive numbers
        int[] positiveNumbers = {5, 10, 15, 20, 25};
        int resultPositive = arraySum.calculateSum(positiveNumbers);
        assertEquals(75, resultPositive);

        // Test case: Sum of negative numbers
        int[] negativeNumbers = {-5, -10, -15, -20, -25};
        int resultNegative = arraySum.calculateSum(negativeNumbers);
        assertEquals(-75, resultNegative);

        // Test case: Sum of a mix of positive and negative numbers
        int[] mixNumbers = {-5, 10, -15, 20, -25};
        int resultMix = arraySum.calculateSum(mixNumbers);
        assertEquals(-15, resultMix);

        // Test case: Sum of an empty array
        int[] emptyArray = {};
        int resultEmptyArray = arraySum.calculateSum(emptyArray);
        assertEquals(0, resultEmptyArray);
    }
}
