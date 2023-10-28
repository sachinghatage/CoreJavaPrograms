import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//
//        List<Integer> integers = Arrays.asList(1,2,3,4,1,3,2,1,3,2,1,2,3);
//        List<Integer> collect = integers.stream().distinct().collect(Collectors.toList());
//        System.out.println(collect);

        List<String> strings = Arrays.asList("karan", "karan", "arjun");
        List<String> collect = strings.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);
    }
}