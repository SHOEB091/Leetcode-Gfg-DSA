package MultiThreading;

/*
DEADLOCK (super easy idea):
Two threads each take one lock and then wait for the other lock.
Result: both stuck forever.

We create:
- lock1
- lock2
Thread A: lock1 then lock2
Thread B: lock2 then lock1   (opposite order -> danger)

4 DEADLOCK CONDITIONS (Coffman) – all must be true for deadlock:
1. Mutual Exclusion   : Locks are exclusive (only 1 thread can hold each).
2. Hold and Wait      : A thread holds one lock and asks for another.
3. No Preemption      : A lock cannot be forcefully taken away.
4. Circular Wait      : A waits for B’s lock, B waits for A’s lock (loop).

Remove ANY one -> no deadlock.
Easiest prevention: always lock in the SAME ORDER.
*/

public class DeadlockEasy {

    static final Object lock1 = new Object();
    static final Object lock2 = new Object();

    // Thread A: takes lock1 first
    static class ThreadA extends Thread {
        public void run() {
            synchronized (lock1) {                 // holds lock1
                System.out.println("A: got lock1");
                try {
                    sleep(200);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.println("A: trying lock2...");
                synchronized (lock2) {             // waits here (B holds lock2)
                    System.out.println("A: got lock2");
                }
            }
        }
    }

    // Thread B: takes lock2 first (reverse order!)
    static class ThreadB extends Thread {
        public void run() {
            synchronized (lock2) {                 // holds lock2
                System.out.println("B: got lock2");
                try {
                    sleep(200);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.println("B: trying lock1...");
                synchronized (lock1) {             // waits here (A holds lock1)
                    System.out.println("B: got lock1");
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Starting threads (this will deadlock)...");
        Thread a = new ThreadA();
        Thread b = new ThreadB();
        a.start();
        b.start();

        // Wait a bit; if still alive -> likely deadlock
        Thread.sleep(1500);
        System.out.println("A alive: " + a.isAlive() + ", B alive: " + b.isAlive());
        System.out.println("If both true and no further prints -> DEADLOCK happened.");

        // SHOW FIX (no deadlock) by consistent order
        System.out.println("\nNow safe version (always lock lock1 then lock2):");
        Thread safe1 = new Thread(() -> lockInOrder("Safe-1"));
        Thread safe2 = new Thread(() -> lockInOrder("Safe-2"));
        safe1.start();
        safe2.start();
        safe1.join();
        safe2.join();
        System.out.println("Safe threads finished (no deadlock).");
    }

    // Safe ordering prevents circular wait
    static void lockInOrder(String name) {
        synchronized (lock1) {
            System.out.println(name + " got lock1");
            sleep(100);
            synchronized (lock2) {
                System.out.println(name + " got lock2");
                // do work
            }
        }
    }

    static void sleep(long ms) {
        try { Thread.sleep(ms); } catch (InterruptedException ignored) { Thread.currentThread().interrupt(); }
    }
}