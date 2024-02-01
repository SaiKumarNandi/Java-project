package additionalProg;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class findFactorialTest {
    @Test
    public void testFactorialForZeroOne(){
        assertEquals(1,findFactorial.factorialOfNumber(0));
        assertEquals(1,findFactorial.factorialOfNumber(1));
    }

    @Test
    public void testFactorialForLessThanZero(){
        assertEquals(-1,findFactorial.factorialOfNumber(-1));
        assertEquals(-1,findFactorial.factorialOfNumber(-10));
    }

    @Test
    public void testFactorialForNumber(){
        assertEquals(120,findFactorial.factorialOfNumber(5));
        assertEquals(3628800,findFactorial.factorialOfNumber(10));
    }

}
