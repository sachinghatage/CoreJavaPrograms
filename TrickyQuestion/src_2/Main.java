public class Main {
    public static void main(String[] args) {

        foo(null);
    }
    public static void foo(Object o) {
        System.out.println("Object argument");
    }
    public static void foo(String s) {
        System.out.println("String argument");     //default value of string is null
    }

    }
