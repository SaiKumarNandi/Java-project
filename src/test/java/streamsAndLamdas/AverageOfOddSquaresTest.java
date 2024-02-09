package streamsAndLamdas;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AverageOfOddSquaresTest {
    @Test
    public void testAverageOfOddSquares(){
        int[] numbers={1,2,3,4,5,6,7,8,9};
        double expected = ((1*1)+(3*3)+(5*5)+(7*7)+(9*9))/5;
        double result=AverageOfOddSquares.findAverageOfOddSquares(numbers);
        assertEquals(expected,result,0.01);
    }

    @Test
    public void testAverageOfOddSquaresNo(){
        int[] numbers={2,4,6,8,};
        double expected = 0;
        double result=AverageOfOddSquares.findAverageOfOddSquares(numbers);
        assertEquals(expected,result,0.01);
    }

}
