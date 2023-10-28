package constructorchaining;

public class Example {

    {
        System.out.println("nsb");
    }                                  //remember first variable will be executed then instance block

    int m1(){                                         //and then constructor.
        System.out.println("m1:x");
        return 10;
    }
    int x=m1();
    Example(){
        this(10);
        x=50;
        System.out.println("no arg constructor");
    }
    Example(int a){
        this("abc");
        x=60;
        System.out.println("int arg constructor");
    }
    Example(String str){
        x=70;
        System.out.println("string arg constructor");
    }

    public static void main(String[] args) {
        Example e1=new Example();
        System.out.println("e1.x"+e1.x);

//        Example e2=new Example(10);
//        System.out.println("e2.x"+e2.x);
//
//        Example e3=new Example("abc");
//        System.out.println("e3.x"+e3.x);
    }
}
