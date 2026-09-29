import java.util.Collections;
import java.util.PriorityQueue;

/**
 * METHOD 1: Modern & Compact (Lambdas / Arrays)
 * Best for competitive programming and quick algorithm implementations.
 */
class ModernHeapExamples {
    public static void run() {
        // Min-Heap using int[]: Integer.compare prevents 32-bit overflow bugs
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));

        // Max-Heap using int[]: Inverting comparison order puts the largest element first
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b[0], a[0]));

        minHeap.offer(new int[]{20, 103});
        minHeap.offer(new int[]{10, 102});
        // minHeap.poll()[0] -> returns 10
    }
}

/**
 * METHOD 2: Traditional OOP (Comparable Interface)
 * In standard Java, a class should define a single natural order (typically ascending).
 * Reversing this order is handled via Collections.reverseOrder() at instantiation,
 * avoiding duplicate class declarations.
 */
class Pair implements Comparable<Pair> {
    int key;
    int value;

    public Pair(int key, int value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public int compareTo(Pair other) {
        // Natural ordering (Ascending): smallest key has higher priority
        // Using Integer.compare() avoids underflow/overflow errors from subtraction
        return Integer.compare(this.key, other.key);
    }

    @Override
    public String toString() {
        return "Key: " + key + ", Value: " + value;
    }
}

public class HeapDemo {
    public static void main(String[] args) {
        // --- 1. Min-Heap (Natural Order) ---
        PriorityQueue<Pair> minHeap = new PriorityQueue<>();

        minHeap.offer(new Pair(30, 101));
        minHeap.offer(new Pair(10, 102));
        minHeap.offer(new Pair(20, 103));

        System.out.println("--- Min-Heap Polling ---");
        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll());
        }

        // --- 2. Max-Heap (Reversed Natural Order) ---
        // Instead of redefining the Pair class, pass Collections.reverseOrder()
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        maxHeap.offer(new Pair(30, 101));
        maxHeap.offer(new Pair(10, 102));
        maxHeap.offer(new Pair(20, 103));

        System.out.println("\n--- Max-Heap Polling ---");
        while (!maxHeap.isEmpty()) {
            System.out.println(maxHeap.poll());
        }
    }
}
/*
// Min-Heap: compares the first element (index 0)
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);

// Max-Heap: b[0] - a[0] puts the largest first
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] - a[0]);        
*/
// MIN HEAP Tradition mehtod 
/* import java.util.PriorityQueue;

class Pair implements Comparable<Pair> {
    int key;
    int value;

    public Pair(int key, int value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public int compareTo(Pair other) {
        // Ascending order: smallest key comes out first
        return this.key - other.key;
    }
}

public class MinHeapTraditional {
    public static void main(String[] args) {
        PriorityQueue<Pair> minHeap = new PriorityQueue<>();

        minHeap.offer(new Pair(30, 101));
        minHeap.offer(new Pair(10, 102));
        minHeap.offer(new Pair(20, 103));

        while (!minHeap.isEmpty()) {
            Pair p = minHeap.poll();
            System.out.println("Key: " + p.key + ", Value: " + p.value);
        }
    }
}

// MAX HEAP Traditional Method
class Pair implements Comparable<Pair> {
    int key;
    int value;

    public Pair(int key, int value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public int compareTo(Pair other) {
        // Descending order: largest key comes out first
        return other.key - this.key;
    }
}

public class MaxHeapTraditional {
    public static void main(String[] args) {
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>();

        maxHeap.offer(new Pair(30, 101));
        maxHeap.offer(new Pair(10, 102));
        maxHeap.offer(new Pair(20, 103));

        while (!maxHeap.isEmpty()) {
            Pair p = maxHeap.poll();
            System.out.println("Key: " + p.key + ", Value: " + p.value);
        }
    }
}
*/
