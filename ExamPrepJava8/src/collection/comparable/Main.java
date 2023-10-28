package collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        list.add(new Student(1,"karan",50));
        list.add(new Student(2,"bhuvan",36));
        list.add(new Student(3,"appa",28));
        list.add(new Student(4,"kamal",97));
        list.add(new Student(5,"jabya",19));
        Collections.sort(list);

        for (Student s:list){
            System.out.println(s.rollNo+" "+s.name+" "+s.age);
        }

    }
}
