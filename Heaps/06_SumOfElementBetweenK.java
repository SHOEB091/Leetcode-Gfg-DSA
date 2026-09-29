package Heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class SumOfElementBetweenK {

    // Helper: Finds the kth smallest element using a Max-Heap of size k
    public static int kthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            maxheap.add(arr[i]);
            if (maxheap.size() > k) {
                maxheap.poll();
            }
        }
        return maxheap.peek();
    }

    // Main logic: sums elements strictly between the k1-th and k2-th smallest
    public static int sumBetweenK(int[] arr, int k1, int k2) {
        int first = kthSmallest(arr, k1);
        int second = kthSmallest(arr, k2);

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first && arr[i] < second) {
                sum = sum + arr[i];
            }
        }
        // FIX: Moved return outside the loop
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {20, 8, 22, 4, 12, 10, 14};
        int k1 = 3;
        int k2 = 6;

        // Elements sorted: [4, 8, 10, 12, 14, 20, 22]
        // 3rd smallest = 10, 6th smallest = 20
        // Numbers strictly between 10 and 20: 12 + 14 = 26
        System.out.println("Sum: " + sumBetweenK(arr, k1, k2)); // Output: 26
    }
}
