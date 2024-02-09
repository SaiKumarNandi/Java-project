package streamsAndLamdas;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.List;

public class SortingStringsTest {
    @Test
    public void testStringSort() {
        Assert.assertEquals(List.of("ash", "oak", "elm", "pine", "maple", "birch", "spruce"),
                SortingStrings.sortBasedOnLength(new String[]{"maple", "birch", "oak", "pine", "elm", "spruce", "ash"}));
    }
}
