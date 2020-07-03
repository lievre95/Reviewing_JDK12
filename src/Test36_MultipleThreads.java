class JThread2 extends Thread {
    JThread2(String name) {
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

class Test36_MultipleThreads {
    public static void main(String[] args) {
        System.out.println("Main thread started...");
        for(int i=1; i<6; i++)
        {
            new JThread2("JThread" + i).start();
            System.out.println("Main thread started");
        }
    }

}

