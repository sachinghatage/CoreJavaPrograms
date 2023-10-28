public class MethodHiding {
    protected static void display(){
        System.out.println("in methodhiding");
    }
}
class MethodHiding1 extends MethodHiding{

    public  static void display(){
        System.out.println("in methodhiding1");
    }
    public static void main(String[] args) {
        MethodHiding m1=new MethodHiding1();
        m1.display();
    }
}
