package collection.comparable;

public class Student implements Comparable<Student>{
    int rollNo;
    String name;
    int age;

    public Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student s) {

        //based on age
//        if (age>s.age)
//            return 1;
//        else if (age<s.age)
//            return -1;
//        else
//            return 0;


        //based on name
        return name.compareTo(s.name);

    }
}
