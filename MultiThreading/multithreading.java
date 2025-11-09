package MultiThreading;

/*
1. Multithreading in Java
   - Lets you run multiple tasks at the same time (parallelism).
   - Each thread is a separate path of execution.

2. How to create thread
   - Extend Thread class OR implement Runnable interface.

3. Thread Lifecycle
   - New -> Runnable -> Running -> Blocked/Waiting -> Terminated

4. Thread vs Runnable
   - Thread: subclass Thread, override run().
   - Runnable: implement Runnable, pass to Thread.

5. Thread Class Methods
   - start(), run(), sleep(), join(), getName(), setName(), isAlive()

6. Synchronization
   - Use synchronized keyword to prevent data races.

7. Locks
   - Use Lock classes for advanced control.

8. Fairness of locks
   - Fair locks grant access in order requested.

9. Read Write Lock
   - Allows multiple readers, one writer.

10. Deadlock
    - Two threads wait forever for each other.

11. Thread Communication
    - wait(), notify(), notifyAll() for coordination.

12. Thread safety
    - Code works correctly with multiple threads.

13. Thread using Lambda expression
    - Runnable r = () -> { /* code };*/
/*
14. Thread Pooling & Executors framework
    - Reuse threads for many tasks, manage with ExecutorService.

15. CountDownLatch
    - Wait for tasks to finish.

16. Cyclic Barrier
    - Wait for group of threads to reach a point.

17. CompletableFuture
    - Run async tasks, get result later.
*/
public class multithreading {
    public static void main(String[] args) {
        // 2. Create thread by extending Thread
        class MyThread extends Thread {
            public void run() {
                System.out.println("Hello from MyThread!");
            }
        }
        new MyThread().start();

        // 2. Create thread by implementing Runnable
        Runnable myRunnable = new Runnable() {
            public void run() {
                System.out.println("Hello from Runnable!");
            }
        };
        new Thread(myRunnable).start();

        // 13. Thread using Lambda expression
        new Thread(() -> System.out.println("Hello from Lambda!")).start();

        // 5. Thread class methods
        Thread t = new Thread(() -> {
            try {
                Thread.sleep(100);
                System.out.println("Thread woke up!");
            } catch (InterruptedException e) {
                System.out.println("Interrupted!");
            }
        });
        t.start();

        // 6. Synchronization example
        Object lock = new Object();
        Thread syncThread = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Inside synchronized block");
            }
        });
        syncThread.start();

        // 14. Thread Pooling & Executors framework
        java.util.concurrent.ExecutorService executor = java.util.concurrent.Executors.newFixedThreadPool(2);
        executor.submit(() -> System.out.println("Task 1 in pool"));
        executor.submit(() -> System.out.println("Task 2 in pool"));
        executor.shutdown();

        // 15. CountDownLatch
        java.util.concurrent.CountDownLatch latch = new java.util.concurrent.CountDownLatch(1);
        new Thread(() -> {
            System.out.println("Latch thread running");
            latch.countDown();
        }).start();
        try { latch.await(); } catch (InterruptedException e) {}

        // 17. CompletableFuture
        java.util.concurrent.CompletableFuture<Void> future = java.util.concurrent.CompletableFuture.runAsync(
            () -> System.out.println("Async task with CompletableFuture"));
        future.join();
    }
}