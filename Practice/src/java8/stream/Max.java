package java8.stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class Max {
    public static void main(String[] args) {
        Integer max = Stream.of(1, 2, 3, 4, 5)
                .max(Comparator.comparing(Integer::valueOf))
                .get();

        System.out.println(max);
    }
}
