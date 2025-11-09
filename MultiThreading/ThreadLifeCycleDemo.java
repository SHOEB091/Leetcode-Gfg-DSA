package MultiThreading;

/*
Thread Life Cycle (simplified):
1. NEW        -> Thread object created (not started yet).
2. RUNNABLE   -> After start(); eligible to run (Java does not distinguish RUNNING separately; running CPU time also shows as RUNNABLE).
3. BLOCKED    -> Waiting to acquire a monitor lock (synchronized).
4. WAITING / TIMED_WAITING
      WAITING       -> Waiting indefinitely (e.g., wait()).
      TIMED_WAITING -> Waiting for a time (e.g., sleep(ms), wait(ms), join(ms)).
5. TERMINATED -> run() method finished.

This demo prints states at each stage:
- NEW: before start()
- RUNNABLE: right after start()
- BLOCKED: thread tries to enter a synchronized block while main holds the lock
- TIMED_WAITING: thread sleeps
- TERMINATED: after completion
Note: Java does not provide a distinct RUNNING state; running code reports as RUNNABLE.
*/

public class ThreadLifeCycleDemo {

    public static void main(String[] args) throws Exception {
        final Object lock = new Object();

        Thread worker = new Thread(() -> {
            // Attempt to acquire 'lock'; will BLOCK if main thread still holds it.
            synchronized (lock) {
                System.out.println("[Worker] Acquired lock. (State now RUNNABLE internally)");
                // Enter TIMED_WAITING via sleep
                try {
                    System.out.println("[Worker] Going to sleep (TIMED_WAITING)...");
                    Thread.sleep(300); // TIMED_WAITING
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("[Worker] Woke up, finishing run()");
            }
        }, "Worker-Thread");

        // NEW
        System.out.println("State after creation (NEW): " + worker.getState());

        synchronized (lock) { // Hold lock so worker will BLOCK when started
            worker.start();
            // RUNNABLE (eligible to run)
            System.out.println("State just after start (RUNNABLE): " + worker.getState());

            // Give worker a moment to attempt entering synchronized block -> BLOCKED
            Thread.sleep(50);
            System.out.println("State while main holds lock (expected BLOCKED): " + worker.getState());

            // Release lock; worker can proceed
            System.out.println("Main releasing lock...");
        }

        // Wait a bit while worker likely sleeping -> TIMED_WAITING
        Thread.sleep(100);
        System.out.println("State while worker sleeping (TIMED_WAITING): " + worker.getState());

        // Wait for completion -> TERMINATED after join
        worker.join();
        System.out.println("State after run completes (TERMINATED): " + worker.getState());
    }
}