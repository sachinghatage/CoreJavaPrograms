package Q8;

public class Gamma {
    public static void main(String[] args) {
        Outer o=new Outer();
        Inner i=new Inner();
        int n = 10;                     //n=100
        i.setX(n);                       //setX(100)
        o.setY(i); // insert code here 29
      //  o.getY().setX(100);
      //  i=new Inner();i.setX(100);o.setY(i);
        System.out.println(o.getY().getX());

    }
}
