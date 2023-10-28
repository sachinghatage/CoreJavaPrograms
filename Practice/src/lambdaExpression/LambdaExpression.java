package lambdaExpression;

public class LambdaExpression {
    public static void main(String[] args) {
        Runnable runnable=()->{
          for(int i=1;i<10;i++){
              System.out.println("lambda expression  " +i);
          }
        };
        new Thread(runnable).start();
    }
}
