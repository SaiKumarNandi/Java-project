package streamsAndLamdas;
import org.junit.Test;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicateTest {

    RemoveDuplicate R=new RemoveDuplicate();
    @Test
    public void TestFindDistinctNumbers(){

        List<Integer> numbers=List.of(32,1,4,2,4,2);
        List<Integer> expected=List.of(32,1,4,2);
        assertEquals(expected,R.FindDistinctNumbers(numbers));
    }


    @Test
    public void TestFindDistinctNONumbers(){

        List<Integer> numbers=List.of(32,1,4,2,6,23);
        List<Integer> expected=List.of(32,1,4,2,6,23);
        assertEquals(expected,R.FindDistinctNumbers(numbers));
    }




    @Test
    public void TestFindDistinctNumbersEmpty(){

        List<Integer> numbers=List.of();
        List<Integer> expected=List.of();
        assertEquals(expected,R.FindDistinctNumbers(numbers));
    }





}
