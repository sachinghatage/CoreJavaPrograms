 class MethodOverloading {

    public void m1(){
        System.out.println("parent");
    }
}

public class MethodOverloading1 extends MethodOverloading{
    public static void main(String[] args) {

        MethodOverloading1 mo1=new MethodOverloading1();
        mo1.m1();

    }

    public void m1(int x){
        System.out.println("child");
    }
}
