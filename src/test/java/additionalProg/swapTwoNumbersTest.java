package additionalProg;
import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class swapTwoNumbersTest {
    @Test
    public void testTwoNumbers(){


        int number1=10;
        int number2=5;
        swapTwoNumbers.swapTwoNumberwithoutExtraVariable(number1,number2);
        assertEquals(5,number2);
        assertEquals(10,number1);
    }

}
