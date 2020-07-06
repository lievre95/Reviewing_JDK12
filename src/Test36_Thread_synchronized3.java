class Test36_Thread_synchronized3 {
    public static void main(String[] args) {
        CommonResource3 commonResource3 = new CommonResource3();
        for (int i = 1; i < 6; i++) {
            Thread t = new Thread(new CountThread3(commonResource3));
            t.setName("Thread " + i);
            t.start();
        }
    }
}

class CommonResource3 {
    int x = 0;

    synchronized void increment() {
        x = 1;
        for (int i = 1; i < 5; i++) {
            System.out.printf("%s %d \n", Thread.currentThread().getName(), x);
            x++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
    }
}

class CountThread3 implements Runnable {
    CommonResource3 res;

    CountThread3(CommonResource3 res) {
        this.res = res;
    }

    public void run() {
        res.increment();
    }
}
