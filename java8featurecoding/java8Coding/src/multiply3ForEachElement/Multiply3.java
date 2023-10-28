package multiply3ForEachElement;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Multiply3 {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4,5);
        System.out.println(list.stream().map(i->i*3).collect(Collectors.toList()));
    }
}
