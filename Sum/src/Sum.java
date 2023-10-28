import java.util.Arrays;
import java.util.List;

public class Sum {
    public static void main(String[] args) {
        List<List<Integer>> integers = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 1),
                Arrays.asList(1, 1, 1)
        );

        long count = integers.stream().flatMapToInt(list -> list.stream().mapToInt(Integer::intValue)).count();

        System.out.println(count);
    }
}
