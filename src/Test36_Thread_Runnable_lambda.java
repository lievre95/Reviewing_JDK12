class JThread5 implements Runnable {

    public void run() {
        System.out.printf("%s started...", Thread.currentThread().getName());
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            System.out.println("Thread has been interrupted");
        }
        System.out.printf("%s finished\n", Thread.currentThread().getName());
    }
}

class Test36_Thread_Runnable_lambda {
    public static void main(String[] args) {
        System.out.println("Main thread started");
        Runnable r = () -> {
            System.out.printf("%s started...\n", Thread.currentThread().getName());
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println("Thread had been interrupted");
            }
            System.out.printf("%s finished\n", Thread.currentThread().getName());
        };
        Thread myThread = new Thread(r, "MyThread");
        myThread.start();
        System.out.println("Main thread finished");
    }
}

