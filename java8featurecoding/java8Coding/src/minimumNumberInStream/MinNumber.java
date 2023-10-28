package minimumNumberInStream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinNumber {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4);
     //  Optional<Integer> integer = list.stream().min(Comparator.comparing(Integer::intValue));//Optional[1]
       Integer integer = list.stream().min(Comparator.comparing(Integer::intValue)).get();//1

        System.out.println(integer);
    }
}
