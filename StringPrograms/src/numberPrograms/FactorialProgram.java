package numberPrograms;

public class FactorialProgram {
    public static void main(String[] args) {
        int a=5;
        System.out.println(factorial(a));
    }

    public static int factorial(int a){
        //using recursion
//        if(a==0||a==1){
//            return 1;
//        }else {
//            return (a*factorial(a-1));
//        }

       //using for loop
        int fact=1;
       for (int i=1;i<=a;i++){
            fact=fact*i;
       }
       return fact;
    }
}
