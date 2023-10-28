package Q11;

public class Test {


    public static void test(String s){
        int check=4;
        if(check==s.length()){    //CE if we assign instead of equating[check=s.length()]

            System.out.println(s.charAt(check=check-1)+" ,");
        }else {
            System.out.println(s.charAt(0)+" ,");
        }
    }
    public static void main(String[] args) {

        test("four");
        test("tee");
        test("to");
    }
}
