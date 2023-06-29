import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String s="classroom";
        HashMap map=new HashMap<>();
        for (int i=0;i<s.length();i++){
            Character c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c, (Integer)map.get(c) + 1);
            }else {
                map.put(c,1);
            }
        }
        for ( Object c:map.keySet()){
            //if ((Integer)map.get(c)>1){
                System.out.println(c  +"    "+ map.get(c));
           // }
        }
    }
}