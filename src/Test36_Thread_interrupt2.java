class JThread8 implements Runnable {

    public void run() {
        System.out.printf("%s started...\n", Thread.currentThread().getName());
        int counter = 1; // counter of iterations
        while (!Thread.currentThread().isInterrupted()) {
            System.out.println("Loop " + counter++);
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + "has been interrupted");
            System.out.println(Thread.currentThread().isInterrupted());
            Thread.currentThread().interrupt();
        }
        System.out.printf("%s finished...\n", Thread.currentThread().getName());
    }
}

class Test36_status {
    public static void main(String[] args) {
        System.out.println("Main thread started");
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