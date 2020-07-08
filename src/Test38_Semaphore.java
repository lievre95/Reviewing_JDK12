import java.util.concurrent.Semaphore;

class Test37_Semaphore {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(1);
        CommonResource_s res = new CommonResource_s();
        new Thread(new CountThread_s(res, sem, "CountThread 1")).start();
        new Thread(new CountThread_s(res, sem, "CountThread 2")).start();
        new Thread(new CountThread_s(res, sem, "CountThread 3")).start();

    }
}

class CommonResource_s {
    int x = 0;
}

class CountThread_s implements Runnable {
    CommonResource_s res;
    Semaphore sem;
    String name;

    CountThread_s(CommonResource_s res, Semaphore sem, String name) {
        this.res = res;
        this.sem = sem;
        this.name = name;
    }

    public void run() {
        try {
            System.out.println(name + " is waiting for allowance");
            sem.acquire();
            res.x = 1;
            for (int i = 1; i < 5; i++) {
                System.out.println(this.name + " : " + res.x);
                res.x++;
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(name + "waiting for allowance");
        res.x = 1;

    }
}

