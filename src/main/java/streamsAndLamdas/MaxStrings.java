package streamsAndLamdas;
import java.util.List;
import java.util.stream.Stream;
import java.util.Collections;
import java.util.Optional;

public class MaxStrings {

    public static Optional<String> findMaxElement(List<String> strings) {
        return strings.stream()
                .max(String::compareTo);
    }
}
