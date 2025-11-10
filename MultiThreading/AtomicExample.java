package MultiThreading;

/*
  Atomic classes (like AtomicInteger, AtomicBoolean)

They not only ensure visibility but also make operations themselves safe from race conditions.

 What problem it solves:

Even if all threads can see the latest value, what if two threads try to update it at the same time?

Example:

int count = 0;

 Thread 1: count++
 Thread 2: count++s


Both read count = 0, increment, and write back 1.
 The result should be 2, but it’s 1. That’s called a race condition.
 */

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample {
    static AtomicInteger count = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                count.incrementAndGet();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                count.incrementAndGet();
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final count: " + count);
    }
}
