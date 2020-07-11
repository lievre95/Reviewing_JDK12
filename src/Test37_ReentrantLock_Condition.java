import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;

public class Test37_ReentrantLock_Condition {
    public static void main(String[] args) {
        Store_rc store = new Store_rc();
        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}

class Store_rc {
    private int product = 0;
    ReentrantLock locker;
    Condition condition;

    Store_rc() {
        locker = new ReentrantLock(); // creating blocking
        condition = locker.newCondition(); // getting the condition related with blocking
    }


    public void get() {
        locker.lock();
        try {
            while (product < 1) {
                condition.await();
            }
            product--;
            System.out.println("Buyer bought an item");
            System.out.println("Now on stock is " + product);

        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } finally {
            locker.unlock();
        }
    }

    public void put() {
        locker.lock();
        try {
            //while on stock 3 items, waiting for free space
            while (product >= 3)
                condition.await();
            product++;

            System.out.println("Vendor added 1 item");
            System.out.println("Now on stock is " + product);
            //signalizing
            condition.signalAll();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } finally {
            locker.unlock();
        }
    }
}

class Producer implements Runnable {
    Store_rc store;

    Producer(Store_rc store) {
        this.store = store;
    }

    public void run() {
        for (int i = 1; i < 6; i++) {
            store.put();

        }
    }
}

class Consumer implements Runnable {
    Store_rc store;

    Consumer(Store_rc store) {
        this.store = store;
    }

    public void run() {
        for (int i = 1; i < 6; i++) {
            store.get();
        }
    }
}