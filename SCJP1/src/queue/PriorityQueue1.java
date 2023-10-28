package queue;
import java.util.PriorityQueue;

class Foo {
    public int a = 3;
    public void addFive() {
        a += 5; System.out.print("f ");
    }
}
class Bar extends Foo {
    public int a = 8;
    public void addFive() {
        this.a += 5; System.out.print("b " );
    }
}

//In method overriding method of given object will be executed but for variables it will check reference type(whether parent or child)




public class PriorityQueue1 {
    public static void main(String[] args) {
//        PriorityQueue pq=new PriorityQueue();
//        pq.add("banana");
//        pq.add("pear");
//        pq.add("apple");
//
//        System.out.println(pq.poll());
//        System.out.println(pq.peek());

//        PriorityQueue pq = new PriorityQueue();
//        pq.add("banana");
//        pq.add("pear");
//        pq.add("apple");
//        System.out.println(pq.poll() + " " + pq.peek());
        //Foo f = new Bar();
        Bar b=new Bar();
        //f.addFive();
        b.addFive();
        //System.out.println(f.a);
        System.out.println(b.a);
    }
}


