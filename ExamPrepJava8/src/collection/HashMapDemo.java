package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"apple");
        map.put(2,"banana");
        map.put(3,"orange");
        map.put(4,"jackfruit");
        map.put(5,"watermelon");

        //for key value pair
//        for (Map.Entry entry:map.entrySet()){
//            System.out.println(entry.getKey()+" "+entry.getValue());
//        }

        //only key
//        for(Integer entry:map.keySet()){
//            System.out.println(entry);
//        }

        //only value
//        for (String entry:map.values()){
//            System.out.println(entry);
//        }
    }
}
