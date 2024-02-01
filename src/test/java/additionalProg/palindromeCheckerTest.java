package additionalProg;
import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class palindromeCheckerTest {
    @Test
    public void testIsPalindrome(){


        assertTrue(palindromeChecker.isPalindrome(12121));
        assertFalse(palindromeChecker.isPalindrome(123));
        assertTrue(palindromeChecker.isPalindrome(5));
        assertFalse(palindromeChecker.isPalindrome(-12121));
        assertTrue(palindromeChecker.isPalindrome(0));
    }

}
