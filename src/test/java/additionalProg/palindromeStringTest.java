package additionalProg;
import org.junit.Test;
import static org.junit.Assert.*;
public class palindromeStringTest {
    @Test
    public void testPalindromeString(){
        assertTrue(palindromeString.checkPalindromeString("sms"));
        assertTrue(palindromeString.checkPalindromeString("sssssssssss"));
        assertTrue(palindromeString.checkPalindromeString(""));
        assertTrue(palindromeString.checkPalindromeString("   "));
        assertFalse(palindromeString.checkPalindromeString("core java"));
    }

}
