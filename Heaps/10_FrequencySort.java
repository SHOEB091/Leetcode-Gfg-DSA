package Heaps;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
class FrequencySort {

    // Pair represents one entry from our HashMap
    // key   = number
    // value = frequency of that number
    public class Pair implements Comparable<Pair> {

        int key;
        int value;

        public Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public int compareTo(Pair other) {

            // First: sort by frequency in increasing order
            if (this.value != other.value) {
                return this.value - other.value;
            }

            // If frequency is same:
            // sort number in decreasing order
            return other.key - this.key;
        }
    }

    public int[] frequencySort(int[] nums) {

        // 1. Build frequency HashMap
        // key   = number
        // value = frequency
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // 2. Add every HashMap entry into PriorityQueue
        PriorityQueue<Pair> minHeap = new PriorityQueue<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            // entry.getKey()   = number
            // entry.getValue() = frequency

            minHeap.add(
                new Pair(entry.getKey(), entry.getValue())
            );
        }

        // 3. Reconstruct the sorted array
        int[] result = new int[nums.length];
        int index = 0;

        while (!minHeap.isEmpty()) {

            Pair top = minHeap.poll();

            // Add the number according to its frequency
            for (int i = 0; i < top.value; i++) {
                result[index++] = top.key;
            }
        }

        return result;
    }
}
