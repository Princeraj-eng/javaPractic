package MultiTherading;

public class HowToCreateThread extends Thread{

    public void run() {
        // Code to be executed by the thread
        System.out.println("Thread running by extending Thread class : " + Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        // Create an instance of MyThread
        HowToCreateThread myThread = new HowToCreateThread();
        // Start the thread
        myThread.start();

        // Always try to crate a thread by this approach.
        Runnable myRunnable = () -> {
            System.out.println("Thread running using Runnable Interface and lambda: " + Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getState());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread running completed: " + Thread.currentThread().getName());
        };
        // Create a Thread instance and pass Runnable as a parameter
        Thread thread = new Thread(myRunnable);
        // Start the thread
        thread.start();


        Thread usingLambda = new Thread(() ->
            System.out.println("Thread running using lambda : " + Thread.currentThread().getName())
        );
        usingLambda.start();
    }
}



