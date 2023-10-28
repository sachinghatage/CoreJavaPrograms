package stringLengthGreaterThan3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class Stringlength {
    public static void main(String[] args) {
        List<String> list=Arrays.asList("hello","how","are","you");
        list.stream().filter(s -> s.length() > 3).forEach(System.out::println);//hello
        System.out.print(list.stream().filter(s -> s.length() > 3).count());//1

    }
}
