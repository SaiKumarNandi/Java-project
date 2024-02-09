package streamsAndLamdas;
import org.junit.Test;
import static org.junit.Assert.*;
public class MathOperationsTest {

    @Test
    public void testSumOfNum(){
        int number1=23;
        int number2 = 34;
        int result=MathOperations.NumbersSum(number1,number2);
        int expected = 57;
        assertEquals(result,expected);
    }



    @Test
    public void testSumOfNegNum(){
        int number1=-2;
        int number2=10;
        int result=MathOperations.NumbersSum(number1,number2);
        int expected = 8;
        assertEquals(result,expected);
    }


}
