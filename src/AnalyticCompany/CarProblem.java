package AnalyticCompany;

class CarThread implements Runnable {
    private static String brand;
    static String model;
    static double price;

    public static String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public static String getModel() {
        return model;
    }

    public static void setModel(String model) {
        CarThread2.model = model;
    }

    public static double getPrice() {
        return price;
    }

    public static void setPrice(double price) {
        CarThread2.price = price;
    }

    public CarThread(String brand, String model, double price) {
        this.brand = brand;
        this.model = null;
        this.price = 0;
    }

    public CarThread(String brand) {
        this.brand = brand;
    }

    private boolean isActive;

    void disable() {
        isActive = false;
    }

    CarThread() {
        isActive = true;
    }

    public void run() {
//        System.out.printf("%s started...", Thread.currentThread().getName());
        while (isActive) {
            System.out.println("hello my name is " + getBrand());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread has been interrupted");
            }
        }
//        System.out.printf("%s finished\n", Thread.currentThread().getName());
    }
}

class CarProblem {
    public static void main(String[] args) {
        CarThread myThread = new CarThread();
        new Thread(myThread, "MyThread").start();

        try {
            CarThread myThread3 = new CarThread("BMW");
            Thread.sleep(100);
            myThread3.disable();
            CarThread myThread2 = new CarThread("Audi");
            myThread2.disable();
            Thread.sleep(100);
            myThread.disable();
        } catch (InterruptedException e) {
            System.out.println("Thread has been interrupted");
        }
//        System.out.println("Main thread finished");
    }
}

