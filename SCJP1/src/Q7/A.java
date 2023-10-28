package Q7;

public class A {
    public static void main(String[] args) {
        A a =new A();
        a.m1();
    }
    public void m1(){
        try{
            B b=new B();
            b.m2();
            //code
        }catch(TestException te){
            throw new RuntimeException(te);

        }
    }
}
