package Q14;

public class Test {

    public enum Dogs{
      collie,harrier
    };

    public static void main(String[] args) {
        Dogs myDog=Dogs.collie;
        switch(myDog){
            case collie:
                System.out.println("collie");


            case harrier:
                System.out.println("harrier");
        }
    }
}
