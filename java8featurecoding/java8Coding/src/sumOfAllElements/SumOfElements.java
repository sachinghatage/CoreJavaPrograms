package sumOfAllElements;

import java.util.Arrays;
import java.util.List;

public class SumOfElements {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4,5);
        Integer reduce = list.stream().reduce(Integer::sum).get();
       // int sum = list.stream().mapToInt(Integer::intValue).sum();
        //System.out.println(sum);
        System.out.println(reduce);
    }
}
