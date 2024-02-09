package streamsAndLamdas;
import org.junit.Test;
import static org.junit.Assert.*;
public class MathOperationsTest {

    @Test
    public void testSumOfArray(){
        int[] numbers={1,2,3,4,5,6,7,8};
        int result=MathOperations.NumbersSum(numbers);
        int expected = 36;
        assertEquals(result,expected);
    }



    @Test
    public void testSumOfEmptyArray(){
        int[] numbers={};
        int result=MathOperations.NumbersSum(numbers);
        int expected = 0;
        assertEquals(result,expected);
    }


}
