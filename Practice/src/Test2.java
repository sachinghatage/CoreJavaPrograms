/* Online Java Compiler and Editor */
class GFG{
   synchronized void test_function(int n){
        for(int i=0;i<=3;i++){
            System.out.println(n++);

            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

public class Test2{
    public static void main(String[] args){
        GFG g=new GFG();

        Thread a=new Thread(){
            public void run(){
                g.test_function(15);
            }
        };

        Thread b=new Thread(){
            public void run(){
                g.test_function(30);
            }
        };

        a.start();
        b.start();
    }
}