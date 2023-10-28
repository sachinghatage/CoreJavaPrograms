package Q17;

public class Test {

    static void test() throws Error {
        if (true) throw new AssertionError();
        System.out.print("test "); }



    public static void main(String[] args) {
        try { test(); }
        catch (Exception ex) { System.out.print("exception "); }    //exception cannot handle
        System.out.print("end ");                                  //to handle write Error
    }
    }

