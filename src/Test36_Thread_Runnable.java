import java.lang.Runnable;

class JThread4 implements Runnable {

    public void run() {
        System.out.printf("%s started...", Thread.currentThread().getName());

        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            System.out.println("Thread has been interrupt");
        }
        System.out.printf("%s finished\n", Thread.currentThread().getName());
    }


}

class Test36_Thread_Runnable {
    public static void main(String[] args) {
        System.out.println("Main thread started...");
        Thread myThread = new Thread(new JThread4(), "MyThread");
        myThread.start();
        System.out.println("Main thread finished");

    }
}

