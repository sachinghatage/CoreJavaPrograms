package deadlock;

public class DeadLockExample {
    public static void main(String[] args) {
        final Object resource1=new Object();
        final Object resource2=new Object();

        //thread 1
        Thread thread1=new Thread(()->{
            synchronized(resource1){
                System.out.println("thread1 holding resource 1");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println("thread1 waiting for resource2");
                synchronized(resource2){
                    System.out.println("thread1 acquired resource 2");
                }
            }
        });


        //thread 2
        Thread thread2=new Thread(()->{
            synchronized(resource2){
                System.out.println("thread2 holding resource 2");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println("thread2 waiting for resource1");
                synchronized(resource1){
                    System.out.println("thread2 acquired resource 1");
                }
            }
        });


        //start both threads
        thread1.start();
        thread2.start();



    }

}
