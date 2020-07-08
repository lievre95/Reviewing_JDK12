import java.util.concurrent.Semaphore;

class Test37_Semaphore2 {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(2);
        for (int i = 0; 1 < 6; i++) {
            new Philosopher(sem, i).start();
        }
    }
}

class Philosopher extends Thread {
    Semaphore sem; // to limit the counter of philosophers
    //count of meals
    int num = 0;
    int id = 0;

    //as constructor transfer id and semaphore
    Philosopher(Semaphore sem, int id) {
        this.sem = sem;
        this.id = id;
    }

    public void run() {
        try {
            while (num < 3) {
                //asking for allowance
                sem.acquire();
                System.out.println("Philosopher " + id + " sits at the table");
                //philosopher eats
                sleep(500);
                num++;
                System.out.println("Philosopher " + id + " stand up from the table");
                sem.release();
                sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Philosopher " + id + " has problems with health");
        }
    }
}
