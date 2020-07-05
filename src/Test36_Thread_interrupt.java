import static java.lang.Thread.interrupted;

class JThread7 implements Runnable {

    public void run() {
        System.out.printf("%s started...\n", Thread.currentThread().getName());
        int counter = 1; // counter of iterations
        while (!Thread.currentThread().isInterrupted()) {
            System.out.println("Loop " + counter++);
        }
        System.out.printf("%s finished...\n", Thread.currentThread().getName());
    }
}

class Test36_interrupt {
    public static void main(String[] args) {

        System.out.println("Main thread started");
        JThread7 myThread = new JThread7();
        JThread t = new JThread("JThread7");

        t.start();
        try {
            Thread.sleep(150);
            t.interrupt();
            Thread.sleep(150);
        } catch (InterruptedException e) {
            System.out.println("Thread has been interrupted");
        }
        System.out.println("Main thread finished");
    }
}