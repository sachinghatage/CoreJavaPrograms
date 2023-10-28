package iterateStreamUsingForeach;

import java.util.Arrays;
import java.util.List;

public class IterateStream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello", "Interview", "Questions");
        list.stream().forEach(System.out::println);
    }
}
