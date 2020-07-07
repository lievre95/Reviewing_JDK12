class Test37_wait_notify {
    public static void main(String[] args) {
        Store_wn store_wn = new Store_wn();
        Store_wn.Producer producer = new Store_wn.Producer(store_wn);
        Store_wn.Consumer consumer = new Store_wn.Consumer(store_wn);
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}

class Store_wn {
    private int product = 0;
    public synchronized void get() {
        while (product < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
            product--;
            System.out.println("Buyer bought 1 thing");
            System.out.println("Items on the stock: " + product);
            notify();

    }
        public synchronized void put(){
            while (product >= 3) {
                try {
                    wait();
                } catch (InterruptedException e) {
                }
            }
            product++;
            System.out.println("Manufacturer added 1 item");
            System.out.println("Item on the stock: " + product);
            notify();

        }
        //Manufacturer
        static class Producer implements Runnable {
            Store_wn store_wn;

            Producer(Store_wn store_wn) {
                this.store_wn = store_wn;
            }

            public void run() {
                for (int i = 1; i < 6; i++) {
                    store_wn.put();
                }
            }
        }
      static class Consumer implements Runnable {
            Store_wn store_wn;

            Consumer(Store_wn store_wn) {
                this.store_wn = store_wn;
            }

            public void run() {
                for (int i = 0; i < 6; i++) {
                    store_wn.get();
                }
            }
        }
    }
