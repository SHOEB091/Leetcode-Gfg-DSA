package MultiThreading;

/*
 * It’s used to make sure all threads see the latest value of a variable.

🔸 What problem it solves:

Normally, threads might keep a local copy of a variable in memory (cache).
So, if one thread changes it, others might not see that change immediately.

volatile tells Java:

“Don’t keep local copies — always read/write directly from main memory.”
 */

class SharedData {
    volatile boolean flag = false;
}

class MyThread1 extends Thread {
    SharedData data;

    MyThread1(SharedData data) {
        this.data = data;
    }

    public void run() {
        System.out.println("Waiting for flag to become true...");
        while (!data.flag) {
            // waiting...
        }
        System.out.println("Flag is now true!");
    }
}

public class VolatileExample {
    public static void main(String[] args) throws InterruptedException {
        SharedData data = new SharedData();
        new MyThread1(data).start();

        Thread.sleep(1000);
        data.flag = true; // change made by main thread
    }
}