package MultiThreading;

import java.util.concurrent.CountDownLatch;

/*
 * CountDownLatch in one line

A gate that stays closed until it has been “counted down” to zero. Threads can wait at the gate; when the count reaches zero, all waiting threads continue.
Why use it

Main thread waits for N tasks to finish setup (or data load) before proceeding.
One-time use; once it hits zero, it can’t be reset.
How it works

new CountDownLatch(N): set the count.
latch.countDown(): called by workers when they finish.
latch.await(): waits until count becomes zero.
Example: main waits for 3 workers, then starts
 */

public class CountDownLatchEasy {
    public static void main(String[] args) {
        // Gate starts with count 3
        CountDownLatch latch = new CountDownLatch(3);

        // Three simple workers that do a small task and then signal "done"
        Runnable worker = () -> {
            String name = Thread.currentThread().getName();
            System.out.println(name + " starting small task...");
            fakeWork(300);                 // pretend to work
            System.out.println(name + " done, counting down");
            latch.countDown();             // lowers the gate count by 1
        };

        new Thread(worker, "Worker-1").start();
        new Thread(worker, "Worker-2").start();
        new Thread(worker, "Worker-3").start();

        System.out.println("Main: waiting for all workers...");
        try {
            latch.await();                 // wait here until count hits 0
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Main: all workers done. Starting main task!");
    }

    private static void fakeWork(long ms) {
        try { Thread.sleep(ms); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
    }
}