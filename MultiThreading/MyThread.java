package MultiThreading;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("RUNNING");
        try {
            Thread.sleep(2000); // TIMED_WAITING
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();

        System.out.println(t1.getState()); // NEW
        t1.start();
        System.out.println(t1.getState()); // RUNNABLE

        try { Thread.sleep(100); } catch (InterruptedException ignored) {}
        System.out.println(t1.getState()); // likely TIMED_WAITING

        try { t1.join(); } catch (InterruptedException ignored) {}
        System.out.println(t1.getState()); // TERMINATED
    }
}