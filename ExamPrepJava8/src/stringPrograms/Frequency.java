package stringPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Frequency {
    public static void main(String[] args) {
//        List<String> strings = Arrays.asList("karan", "karan", "arjun");
//        Map<String, Long> stringLongMap = strings.stream().collect(Collectors.groupingBy(name -> name, Collectors.counting()));
//        System.out.println(stringLongMap);
//        List<String> collect = stringLongMap.entrySet().stream().filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
//        System.out.println(collect);

        List<String> stringList=Arrays.asList("sachin","sachin","gambhir");
        Map<String,Long> map=stringList.stream().collect(Collectors.groupingBy(name->name,Collectors.counting()));
        System.out.println(map);
        Set<String> collect = map.entrySet().stream().filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toSet());
        System.out.println(collect);
    }
}