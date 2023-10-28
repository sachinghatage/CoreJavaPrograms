package stringPrograms;

import java.util.HashMap;
import java.util.Map;

public class Frequency {
    public static void main(String[] args) {
        String s="habibi";
        frequency(s);
    }

    private static void frequency(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        for (Map.Entry<Character,Integer> entry:map.entrySet()){
            //if (entry.getValue()==1) {
                System.out.println(entry.getKey()+" "+entry.getValue());
            //}
        }
    }
}
