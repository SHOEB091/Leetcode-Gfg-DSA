package MultiThreading;

/*
Thread Priority in Java
- Range: 1..10 (Thread.MIN_PRIORITY=1, Thread.NORM_PRIORITY=5, Thread.MAX_PRIORITY=10)
- Higher number = higher priority (a hint to the OS/JVM scheduler).
- Not a guarantee: high-priority threads are more likely to run sooner/often, but
  actual behavior depends on the platform/JVM.

Best practices
- Set priority BEFORE start().
- Use priorities sparingly; don’t rely on them for correctness.
*/

public class ThreadPriority {

    // A small worker that does some work and sleeps briefly so we can see interleaving
    static class Worker implements Runnable {
        private final String name;

        Worker(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            // Print a few steps to visualize scheduling
            for (int i = 1; i <= 8; i++) {
                System.out.printf("[%s] step=%d, priority=%d, thread=%s%n",
                        name, i,
                        Thread.currentThread().getPriority(),
                        Thread.currentThread().getName());
                try {
                    // Short sleep gives the scheduler chances to switch threads
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println(name + " interrupted");
                    return;
                }
            }
            System.out.println("[" + name + "] finished");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        // Create threads with different priorities
        Thread low = new Thread(new Worker("LOW"), "LOW-Worker");
        Thread normal = new Thread(new Worker("NORMAL"), "NORMAL-Worker");
        Thread high = new Thread(new Worker("HIGH"), "HIGH-Worker");

        // Set priorities (must be between 1 and 10)
        low.setPriority(Thread.MIN_PRIORITY);       // 1
        normal.setPriority(Thread.NORM_PRIORITY);   // 5 (default)
        high.setPriority(Thread.MAX_PRIORITY);      // 10

        // Print what we set
        System.out.printf("LOW priority=%d%n", low.getPriority());
        System.out.printf("NORMAL priority=%d%n", normal.getPriority());
        System.out.printf("HIGH priority=%d%n", high.getPriority());

        // Start after priorities are set
        high.start();    // often scheduled more aggressively (not guaranteed)
        normal.start();
        low.start();

        // Wait for all to finish
        high.join();
        normal.join();
        low.join();

        System.out.println("Main done");
    }
}