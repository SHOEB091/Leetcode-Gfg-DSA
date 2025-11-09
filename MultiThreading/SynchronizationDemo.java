package MultiThreading;

/*
Synchronization = controlling thread access to shared data.
Without it: race conditions (two threads read/modify/write at same time -> wrong result).
Java provides an intrinsic lock (monitor) per object. 'synchronized' acquires that lock.

This demo shows:
1) An unsafe bank account (no synchronization) -> incorrect final balance.
2) A safe bank account (synchronized methods) -> correct final balance.
3) Also a synchronized block example.
*/

class BankAccountUnsafe {
    private int balance;

    public BankAccountUnsafe(int starting) {
        this.balance = starting;
    }

    // NOT synchronized: race condition possible.
    public void deposit(int amount) {
        balance = balance + amount; // read-modify-write (non-atomic)
    }

    public void withdraw(int amount) {
        balance = balance - amount;
    }

    public int getBalance() {
        return balance;
    }
}

class BankAccountSafe {
    private int balance;

    public BankAccountSafe(int starting) {
        this.balance = starting;
    }

    // Whole method synchronized: only one thread can be inside at a time (on this object).
    public synchronized void deposit(int amount) {
        balance = balance + amount;
    }

    public synchronized void withdraw(int amount) {
        balance = balance - amount;
    }

    public synchronized int getBalance() {
        return balance;
    }

    // Example of synchronized block (fine-grained control):
    public void depositBlock(int amount) {
        // some non-critical pre-work could go here
        synchronized (this) { // lock only around critical section
            balance = balance + amount;
        }
    }
}

public class SynchronizationDemo {

    private static final int ITERATIONS = 100_000;

    public static void main(String[] args) throws InterruptedException {

        // 1) UNSAFE EXAMPLE
        BankAccountUnsafe unsafe = new BankAccountUnsafe(0);

        Runnable unsafeTask = () -> {
            for (int i = 0; i < ITERATIONS; i++) {
                unsafe.deposit(1);   // should add ITERATIONS per thread
                unsafe.withdraw(1);  // net 0 per loop
                unsafe.deposit(1);   // +1 net per loop (expected total loops * 1)
            }
        };

        Thread u1 = new Thread(unsafeTask, "Unsafe-1");
        Thread u2 = new Thread(unsafeTask, "Unsafe-2");
        u1.start(); u2.start();
        u1.join(); u2.join();

        // Expected final balance: ITERATIONS * 2 (because two threads each add +1 per loop)
        int expected = ITERATIONS * 2;
        System.out.println("UNSAFE final balance = " + unsafe.getBalance() +
                " (expected " + expected + ")  <-- likely WRONG due to race conditions");

        // 2) SAFE EXAMPLE
        BankAccountSafe safe = new BankAccountSafe(0);

        Runnable safeTask = () -> {
            for (int i = 0; i < ITERATIONS; i++) {
                safe.deposit(1);
                safe.withdraw(1);
                safe.deposit(1);
            }
        };

        Thread s1 = new Thread(safeTask, "Safe-1");
        Thread s2 = new Thread(safeTask, "Safe-2");
        s1.start(); s2.start();
        s1.join(); s2.join();

        System.out.println("SAFE final balance  = " + safe.getBalance() +
                " (expected " + expected + ")  <-- correct with synchronization");

        /*
        Summary:
        - Unsafe version: deposit/withdraw not synchronized -> lost updates.
        - Safe version: synchronized methods ensure atomic read-modify-write.
        - Use synchronized blocks for smaller critical sections when only part needs locking.
        - Never synchronize on 'this' if you expose it publicly and fear external locking misuse; consider private lock object.
        */
    }
}