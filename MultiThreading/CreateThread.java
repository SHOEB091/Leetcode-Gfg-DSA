package MultiThreading;

// To create a new thread in Java, you can either:
// 1. Extend the Thread class
// 2. Implement the Runnable interface

// Example 1: Extending the Thread class
class MyThread extends Thread {
    @Override
    public void run() {
        // This code runs in a separate thread
        for (int i = 0; i < 5; i++) {
            System.out.println("MyThread: " + i);
        }
        System.out.println("MyThread finished. Name: " + Thread.currentThread().getName());
    }
}

// Example 2: Implementing the Runnable interface
class MyRunnable implements Runnable {
    @Override
    public void run() {
        // This code runs in a separate thread
        for (int i = 0; i < 5; i++) {
            System.out.println("MyRunnable: " + i);
        }
        System.out.println("MyRunnable finished. Name: " + Thread.currentThread().getName());
    }
}

public class CreateThread {
    public static void main(String[] args) {
        // Creating a thread by extending Thread class
        MyThread thread1 = new MyThread();
        thread1.start(); // start() launches a new thread and calls run()

        // Creating a thread by implementing Runnable interface
        Thread thread2 = new Thread(new MyRunnable());
        thread2.start(); // start() launches a new thread and calls run()

        // Main thread code
        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread: " + i);
        }
        System.out.println("Main thread finished. Name: " + Thread.currentThread().getName());
    }
}