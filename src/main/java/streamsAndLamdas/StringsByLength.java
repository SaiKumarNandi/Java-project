package streamsAndLamdas;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;
public class StringsByLength {
    public static Map<Integer, List<String>> GroupByStringLength(List<String> strings) {
        return strings.stream()
                .collect(Collectors.groupingBy(String::length));
    }
}
