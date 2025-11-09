package MultiThreading;

/*
Thread Communication (VERY EASY)

Idea:
- One shared object (Box) holds ONE number.
- A Producer thread puts a number into the box.
- A Consumer thread takes the number out.
- If box is FULL, producer must WAIT.
- If box is EMPTY, consumer must WAIT.
- When state changes, we wake the other thread with notify().

Words:
wait()      -> go to waiting state AND release the lock.
notify()    -> wake ONE waiting thread on the same object.
notifyAll() -> wake ALL waiting threads on the same object.

Rules:
1. Must call wait/notify/notifyAll INSIDE synchronized block/method.
2. They act on the lock object you synchronize on.

We show notify(); to use notifyAll(), just replace it (same here because only 1 of each waits).
*/

class Box {
    private Integer value = null; // null means EMPTY

    // Put a number if box empty; else wait
    public synchronized void put(int x) {
        while (value != null) {    // while FULL -> wait
            try { wait(); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        }
        value = x;                  // put number
        System.out.println("Producer PUT: " + x);
        notify();                   // wake consumer (box now FULL)
    }

    // Get number if box full; else wait
    public synchronized int get() {
        while (value == null) {     // while EMPTY -> wait
            try { wait(); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        }
        int x = value;
        value = null;               // make box EMPTY
        System.out.println("Consumer GOT: " + x);
        notify();                   // wake producer (box now EMPTY)
        return x;
    }
}

public class ThreadCommunicationDemo {
    public static void main(String[] args) {
        Box box = new Box();

        // Producer: puts numbers 1..5
        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                box.put(i);
                try { Thread.sleep(200); } catch (InterruptedException ignored) {}
            }
        }, "Producer");

        // Consumer: takes 5 numbers
        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                box.get();
                try { Thread.sleep(300); } catch (InterruptedException ignored) {}
            }
        }, "Consumer");

        producer.start();
        consumer.start();
    }
}

/*
Flow (typical):
1) Producer sees EMPTY -> puts 1 -> notifies -> Consumer wakes.
2) Consumer sees FULL -> gets 1 -> notifies -> Producer wakes.
Repeat until done.

Why while (value == null)?
- Always re-check condition after waking (spurious wakeups or multiple waiters).
*/