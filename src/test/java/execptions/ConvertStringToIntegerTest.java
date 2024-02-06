package execptions;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class ConvertStringToIntegerTest {
    @Test
    public void testConvertToIntValidInput() {
        assertEquals(23, ConvertStringToInteger.convertToInt("23"));
    }

    @Test(expected = NumberFormatException.class)
    public void testConvertToIntInvalidInput() {
        ConvertStringToInteger.convertToInt("45.67");
    }

    @Test(expected = NumberFormatException.class)
    public void testConvertToIntNonNumericInput() {
        ConvertStringToInteger.convertToInt("test");
    }

    @Test(expected = NumberFormatException.class)
    public void testConvertToIntAlphaNumericInput() {
        ConvertStringToInteger.convertToInt("123f");
    }
}
