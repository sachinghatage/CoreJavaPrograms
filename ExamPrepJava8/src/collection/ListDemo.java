package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List l=new ArrayList();
        l.add("amit");
        l.add("bajrang");
        l.add("camella");
        l.add("david");
     //   System.out.println(l);
        Iterator iterator = l.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
