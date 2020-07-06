class Test36_Thread_synchronized2 {
    public static void main(String[] args) {
        CommonResource2 commonResource2 = new CommonResource2();
        for (int i = 1; i < 6; i++) {
            Thread t = new Thread(new CountThread2(commonResource2));
            t.setName("Thread " + i);
            t.start();
        }
    }
}

class CommonResource2 {
    int x = 0;
}

class CountThread2 implements Runnable {
    CommonResource2 res;

    CountThread2(CommonResource2 res) {
        this.res = res;
    }

    public void run() {
        synchronized (res) {
            res.x = 1;
            for (int i = 1; i < 5; i++) {
                System.out.printf("%s %d \n", Thread.currentThread().getName(), res.x);
                res.x++;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {}
            }
        }
    }
}
