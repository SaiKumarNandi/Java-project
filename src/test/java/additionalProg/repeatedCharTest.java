package additionalProg;
import org.junit.Test;
public class repeatedCharTest {
    @Test
    public void testRepeatedChar(){
        String input1="Abhinav";
        String expected1="a";
        expected1.equals(input1);
        String input2="Abhinav Reddy";
        String expected2="ad";
        expected2.equals(input2);
    }


    @Test
    public void testNoRepeatedChar(){
        String input1="Abhinv";
        String expected1="";
        expected1.equals(input1);
    }



    @Test
    public void testNoChar(){
        String input1="";
        String expected1="";
        expected1.equals(input1);



        String input2="         ";
        String expected2="";
        expected2.equals(input2);

    }



}
