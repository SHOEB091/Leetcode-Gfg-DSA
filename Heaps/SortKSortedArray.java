package Heaps;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class SortKSortedArray {
    public static ArrayList<Integer> sortedArray(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            // Push current element into min-heap
            minHeap.add(arr[i]);

            // Keep heap size at k; smallest element moves to result
            if (minHeap.size() > k) {
                list.add(minHeap.poll());
            }
        }

        // Add remaining elements in sorted order
        while (!minHeap.isEmpty()) {
            list.add(minHeap.poll());
        }

        return list;
    }

    public static void main(String[] args) {
        int arr[] = {6, 5, 3, 2, 8, 10, 9};
        int k = 3;

        // Prints: [2, 3, 5, 6, 8, 9, 10]
        System.out.println(sortedArray(arr, k));
    }
}