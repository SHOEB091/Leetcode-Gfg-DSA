package MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/*
THREAD POOL (super easy explanation)
Colelction of Pre initialized threads

1. Resource management
2. Response time
3. Control over Thread Count

Problem (without pool):
- You keep creating new Thread objects for every small task.
- Creating threads is EXPENSIVE (memory + OS setup).
- Too many threads -> slow, high CPU context switching.

Thread Pool solution:
- Make a small group of worker threads ONCE.
- Give (submit) tasks to the pool; workers pick them up and run them.
- When finished, reuse the same threads for next tasks.

We use:
ExecutorService pool = Executors.newFixedThreadPool(3);
- 3 worker threads only.
- submit(Runnable) sends a task.
- shutdown() says "no more new tasks".
- awaitTermination(...) waits all tasks done.

Real-world analogy:
- Restaurant: instead of hiring a new cook for each order, keep a fixed team of cooks.
*/

/*
 * EXECUTOR Framework in JAVA
 * The Executor framework was introduced in Java 5 as part of the java.util.concurrent
 * package to simplify the development of 
 * concurrent applications by abstracting away
 * many of the complexities involved in creating and managing threads.
 * 
 * //Before Executor service
 * Manual Thread Management
 * Resource Management 
 * Scalability 
 * Thread Reuse
 * Error Handling
 */

public class ThreadPoolEasy {
    public static void main(String[] args) {

        // 1. Create a pool with 3 threads.
        ExecutorService pool = Executors.newFixedThreadPool(3);

        // 2. Submit 10 tiny tasks (pretend sending emails).
        for (int i = 1; i <= 10; i++) {
            int emailId = i; // copy for lambda
            pool.submit(() -> {
                System.out.println("Sending email #" + emailId +
                        " on thread: " + Thread.currentThread().getName());
                fakeWork(200); // pretend work
            });
        }

        // 3. Tell pool: no more tasks coming.
        pool.shutdown();

        // 4. Wait for all tasks to finish (up to 5 seconds).
        try {
            if (!pool.awaitTermination(5, TimeUnit.SECONDS)) {
                System.out.println("Some tasks still running...");
            } else {
                System.out.println("All emails sent!");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Main ends.");
    }

    private static void fakeWork(long ms) {
        try { Thread.sleep(ms); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
    }
}

/*
Key points:
- fixedThreadPool(3): only 3 threads handle all 10 tasks.
- Tasks queue up; workers take next available.
- Better than making 10 new Thread objects.
- Always call shutdown() when done.
*/