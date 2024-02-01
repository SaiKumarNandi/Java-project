package additionalProg;
import org.junit.Test;
import static org.junit.Assert.*;
public class uniqueWordCountTest {
    @Test
    public void testUniqueCount(){
        assertEquals(6,uniqueWordCount.WordCount("assertTrue assertion or the assertFalse one"));
        assertEquals(6,uniqueWordCount.WordCount("assertTrue assertion or the assertFalse one the assertFalse one"));
        assertEquals(0,uniqueWordCount.WordCount(""));
    }
}
