package Heaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentNumbers {

    // A simple container holding the number and its frequency count
    static class Pair implements Comparable<Pair> {
        int count;  // How many times this number appears
        int number; // The actual number

        public Pair(int count, int number) {
            this.count = count;
            this.number = number;
        }

        // Min-Heap sorting: smallest count stays at the top
        @Override
        public int compareTo(Pair other) {
            return this.count - other.count;
        }
    }

    public static int[] topKFrequent(int[] nums, int k) {
        // Step 1: Count how many times each number shows up
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        // Step 2: Min-heap to keep only the top k most frequent numbers
        PriorityQueue<Pair> minHeap = new PriorityQueue<>();

        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();

            // Add the current number and its count into the heap
            minHeap.offer(new Pair(freq, num));

            // If the heap has more than k elements, drop the one with the smallest count
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // Step 3: Put the surviving k numbers directly into the answer array
        int[] answer = new int[k];
        for (int i = 0; i < k; i++) {
            answer[i] = minHeap.poll().number;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        int[] result = topKFrequent(nums, k);

        System.out.println("Result: " + Arrays.toString(result)); 
        // Output: [2, 1]
    }
}
