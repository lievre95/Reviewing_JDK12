class JThread6 implements Runnable {
    private boolean isActive;

    void disable() {
        isActive = false;
    }

    JThread6() {
        isActive = true;
    }

    public void run() {
        System.out.printf("%s started...", Thread.currentThread().getName());
        int counter = 1; //counter of iterations
        while (isActive) {
            System.out.println("Loop " + counter++);


            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println("Thread has been interrupted");
            }
        }
        System.out.printf("%s finished\n", Thread.currentThread().getName());
    }
}

class Test36_Thread_End {
    public static void main(String[] args) {
        System.out.println("Main thread started");
        JThread6 myThread = new JThread6();
        new Thread(myThread, "MyThread").start();

        try {
            Thread.sleep(1000);
            myThread.disable();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread has been interrupted");
        }
        System.out.println("Main thread finished");
    }
}

