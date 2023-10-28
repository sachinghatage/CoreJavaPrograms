package Q1;


interface Foo{
    int bar();
}

public class Sprite{
    public int fubar(Foo foo){
        return foo.bar();
    }

    public void testFoo(){
        fubar(new Foo() {
            @Override
            public int bar() {
                return 1;
            }
        });
    }
}
// anonymous class that implements the Foo interface and provides an implementation for the bar() method.
//        This anonymous class can be instantiated and passed as an argument to the fubar() method.
//
//        In Java, when you need to create a single-use class that implements an interface or extends a class
//, you can use an anonymous class. In this case, the anonymous class implements the Foo interface and
//        overrides the bar() method to return the value 1.