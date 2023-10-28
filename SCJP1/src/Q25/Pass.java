package Q25;

public class Pass {
    public static void main(String[] args) {
        int x=5;
        Pass p=new Pass();
        p.doStuff(x);
        System.out.println(x);
    }

     void doStuff(int x) {
         System.out.println(x++);
         System.out.println(x);
    }
}
