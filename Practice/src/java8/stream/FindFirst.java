package java8.stream;

import java.util.Arrays;
import java.util.Optional;

public class FindFirst {
    public static void main(String[] args) {
        Integer first = Arrays.asList(1, 2, 3, 4)
                .stream()
                .findFirst()
                .get();


        System.out.print(first);
    }
}
