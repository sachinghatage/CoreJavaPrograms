package Q6;

public class A {
    private static int counter=0;   //CE if static is not mentioned
    public static int getInstanceCount(){
        return counter;
    }
    public A(){
        counter++;
    }
}
