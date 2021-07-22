package AnalyticCompany;

import java.lang.reflect.Method;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Robot {
    public static void main(String[] args) {
        Robot robot = new Robot();
        final int MYTHREADS = 1;
        final int MYTHREADS2 = 1;

        ExecutorService executor = Executors.newFixedThreadPool(MYTHREADS);
        ExecutorService executor2 = Executors.newFixedThreadPool(MYTHREADS2);

        for (int i = 0; i < 1; i++) {
            executor.execute(new HThread());
            executor.isTerminated();
            executor2.execute(new VThread());
            executor2.isTerminated();
        }

        while (!executor.isTerminated()) {

        }
        System.out.println("\nFinished all threads");
    }


    static class VThread implements IVThread, Runnable {
        public final static Robot robot = new Robot();

        private boolean doStop = false;

        public VThread() {

        }

        public void getLocationU() {
            System.out.println("Up");
        }

        public void getLocationD() {
            System.out.println("Down");
        }

        public VThread(Robot robot) {

        }

        public synchronized void doStopV() {
            this.doStop = true;
        }

        private synchronized boolean keepRunning() {
            return this.doStop == false;
        }

        @Override
        public void run() {
            synchronized (robot) {
                while (keepRunning()) {
//                    System.out.println("Running thread V");
                    try {
                        String[] arr2 = {"getLocationU", "getLocationD"};
                        int d = new Random().nextInt(arr2.length);
                        Robot robot = new Robot();

                        VThread vThread = new VThread(robot);
                        String nameOfMethod = (arr2[d]).toString();
//                            System.out.println(nameOfMethod);

                        try {
                            Class classobj2 = Robot.VThread.class;
                            Method[] methods2 = classobj2.getMethods();

                            for (Method method2 : methods2) {
                                if (nameOfMethod.equals("getLocationU")) {
                                    vThread.getLocationU();
                                    Thread.sleep(100);
                                }
                                if (nameOfMethod.equals("getLocationD")) {
                                    vThread.getLocationD();
                                    Thread.sleep(100);
                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        Thread.sleep(500L * 1L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        }
    }

    static class HThread implements IHThread, Runnable {

        public final static Robot robot = new Robot();

        public HThread(Robot robot) {

        }

        private boolean doStop = false;

        public HThread() {

        }

        synchronized void doStopH() {
            this.doStop = true;
        }

        private synchronized boolean keepRunning() {
            return this.doStop == false;
        }

        public void getLocationL() {
            System.out.println("Left");
        }

        public void getLocationR() {
            System.out.println("Right");
        }

        @Override
        public void run() {
            synchronized (robot) {
                while (keepRunning()) {
//                    System.out.println("Running thread H");
                    try {
                        String[] arr2 = {"getLocationR", "getLocationL"};
                        int d = new Random().nextInt(arr2.length);
                        Robot robot = new Robot();

                        HThread hThread = new HThread(robot);
                        String nameOfMethod = (arr2[d]).toString();
//                        System.out.println(nameOfMethod);

                        try {
                            Class classobj2 = Robot.HThread.class;
                            Method[] methods2 = classobj2.getMethods();

                            for (Method method2 : methods2) {
                                if (nameOfMethod.equals("getLocationR")) {
                                    hThread.getLocationR();
                                    Thread.sleep(250);
                                }
                                if (nameOfMethod.equals("getLocationL")) {
                                    hThread.getLocationL();
                                    Thread.sleep(250);
                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        Thread.sleep(500L * 1L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        }
    }

}

interface IHThread {
    void getLocationL();

    void getLocationR();

}

interface IVThread {
    void getLocationU();

    void getLocationD();
}

