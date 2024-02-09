package streamsAndLamdas;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.*;
public class StringsStartWithATest {
    @Test
    public void testFilterStringA(){
        List<String> strings= List.of("Aghcdhv","akjg","jgbn","kjuc","Adhguiub");
        List<String> expectedstrings= List.of("akjg","jgbn","kjuc");
        List<String> result=StringsStartWithA.filterStringsStartingWithA(strings);
        assertEquals(expectedstrings,result);
    }



    @Test
    public void testFilterStringNoA(){
        List<String> strings= List.of("ghcdhv","akjg","jgbn","kjuc","dhguiub");
        List<String> expectedstrings= List.of("ghcdhv","akjg","jgbn","kjuc","dhguiub");
        List<String> result=StringsStartWithA.filterStringsStartingWithA(strings);
        assertEquals(expectedstrings,result);
    }



    @Test
    public void testFilterStringAEmpty(){
        List<String> strings= List.of();
        List<String> expectedstrings= List.of();
        List<String> result=StringsStartWithA.filterStringsStartingWithA(strings);
        assertEquals(expectedstrings,result);
    }


}
