import java.util.concurrent.locks.ReentrantLock;

public class Test37_ReentrantLock {
    public static void main(String[] args) {
        CommonResource1 commonResource1 = new CommonResource1();
        ReentrantLock locker = new ReentrantLock(); // creating dummy
        for (int i = 1; i < 6; i++) {
            Thread t = new Thread(new CountThread_r(commonResource1, locker));
            t.setName("Thread " + i);
            t.start();
        }
    }
}
class CommonResource1 {
    int x = 0;
}

class CountThread_r implements Runnable {
    CommonResource1 res;
    ReentrantLock locker;
    CountThread_r(CommonResource1 res, ReentrantLock lock) {
        this.res = res;
        locker = lock;
    }
    public void run() {
        locker.lock(); //set blocking
        try {
            res.x = 1;
            for (int i = 1; i < 5; i++) {
                System.out.printf("%s %d \n", Thread.currentThread().getName(), res.x);
                res.x++;
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } finally {
            locker.unlock(); //put off the blocking
        }
    }
}