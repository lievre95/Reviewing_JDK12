class JThread3 extends Thread {
    JThread3(String name) {
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

class Test36_MultipleThreads2 {
    public static void main(String[] args) {
        System.out.println("Main thread started...");
        JThread3 t = new JThread3("JThread");
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            System.out.printf("%s has been interrupted", t.getName());

        }
        System.out.println("Main thread is finished");
    }
}

