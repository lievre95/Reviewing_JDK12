class JThread extends Thread {
    JThread(String name) {
        super(name);
    }

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

class Test36_Thread {
    public static void main(String[] args) {
        System.out.println("Main thread started...");
        new JThread("JThread").start();
        System.out.println("Main thread finished");

    }

}

