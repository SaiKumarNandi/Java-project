package additionalProg;
import java.util.HashSet;
import java.util.Arrays;
public class uniqueWordCount {
    public static int WordCount(String sentence){
        HashSet<String> uniquestrings = new HashSet<>();
        if(sentence.equals(""))
            return 0;
        String[] words = sentence.split("\\s+");
        for(String s:words)
            uniquestrings.add(s);

        int count=uniquestrings.size();
        return count;
    }
}
