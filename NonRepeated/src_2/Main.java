
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    //first non repeated character in a string
    public static void main(String[] args) {
        String s="rogrammer";
        Character character = nonRepeatedFirst(s);
        System.out.println(character);

    }

    private static Character nonRepeatedFirst(String s) {
//reason for using linkedhashmap is,it preserves insertion order
//if we use datastructure which doesnot preserve insertion order result may not be accurate
        Map<Character,Integer> map=new LinkedHashMap<>();
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else {
                map.put(c,1);
            }
        }
        for (Map.Entry<Character,Integer> e:map.entrySet()){
            if (e.getValue()==1) {
                return e.getKey();
            }

        }
        return null;
    }
}