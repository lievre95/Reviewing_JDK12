import java.util.concurrent.Phaser;

class Phaser_n {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1);
        new Thread(new PhaseThread(phaser, "PhaseThread1")).start();
        new Thread(new PhaseThread(phaser, "PhaseThread2")).start();
        // waiting for end of first phase
        int phase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + phase + " is completed");
        // waiting for end of second phase
        phase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + phase + " is completed");
        // waiting for end of third phase
        phase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + phase + " is completed");
        //
        phaser.arriveAndDeregister();
    }
}

class PhaseThread implements Runnable {

    Phaser phaser;
    String name;

    PhaseThread(Phaser p, String n) {
        this.phaser = p;
        this.name = n;
        phaser.register();
    }

    public void run() {
        System.out.println(name + " completes phase " + phaser.getPhase());
        phaser.arriveAndAwaitAdvance(); // the first phase has been arrived
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.getMessage();
        }


        System.out.println(name + " completes phase " + phaser.getPhase());
        phaser.arriveAndAwaitAdvance(); // the second phase has been arrive
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.getMessage();

        }
        System.out.println(name + " completes phase " + phaser.getPhase());
        phaser.arriveAndDeregister(); // the third phase has been arrived


    }
}