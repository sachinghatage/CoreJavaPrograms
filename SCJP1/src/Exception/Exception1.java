package Exception;

public class Exception1 {
    public static void main(String[] args) {
        try{
            throw new ArrayIndexOutOfBoundsException();
        }catch (NullPointerException e1){
            System.out.println("a");
        }catch (Exception e2){
            System.out.println("b");
        }finally {
            {
                System.out.println("c");
            }
        }
    }
}
