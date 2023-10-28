package stringPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringLength {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("abc", "defg", "hijkl");
        long collect = stringList.stream().filter(x -> x.length() > 4).collect(Collectors.toList()).stream().count();
        System.out.println(collect);
    }
}
