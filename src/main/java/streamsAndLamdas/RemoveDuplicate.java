package streamsAndLamdas;

import java.util.List;
import java.util.stream.Collectors;

public  class RemoveDuplicate {
    public List<Integer> FindDistinctNumbers(List<Integer> numbers){
        return numbers.stream().distinct().collect(Collectors.toList());
    }
}
