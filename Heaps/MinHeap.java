package Heaps;

import java.util.PriorityQueue;

public class MinHeap {

    public static void klargestElement(int[] arr, int k) {
        if (arr == null || k <= 0 || k > arr.length) {
            System.out.println("Invalid input or k out of bounds.");
            return;
        }

        // Min-heap keeps track of the k largest elements seen so far
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            minHeap.add(arr[i]);
            if (minHeap.size() > k) {
                minHeap.poll(); // Evict the smallest element when capacity exceeds k
            }
        }

        // Print the k largest elements (extracted in ascending order)
        System.out.println("The " + k + " largest elements are:");
        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll());
        }
    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        klargestElement(arr, k);
    }
}