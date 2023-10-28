package Q16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q16 {
    public static void main(String[] args) {
        List list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        int sum = sum(list);
        System.out.println(sum);
    }

    public static int sum(List list){
            int sum=0;
            for (Iterator iter= list.iterator(); iter.hasNext();){
                int i = ((Integer) iter.next()).intValue();
                sum+=i;
            }
            return sum;
    }
}
