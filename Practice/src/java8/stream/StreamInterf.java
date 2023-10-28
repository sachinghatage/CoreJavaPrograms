package java8.stream;

import java.util.stream.Stream;

public class StreamInterf {
    public static void main(String[] args) {

        Stream stream = Stream.of("java","python");
        stream.forEach(System.out::println);
    }
}
