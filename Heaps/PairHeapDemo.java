/*
// Min-Heap: compares the first element (index 0)
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);

// Max-Heap: b[0] - a[0] puts the largest first
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] - a[0]);        
*/
// MIN HEAP Tradition mehtod 
import java.util.PriorityQueue;

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
