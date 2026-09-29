package Heaps;

import java.util.PriorityQueue;

public class ConnectedRopesMinimiseCost {
    public int calculateMinimumCost(int arr[]) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int cost = 0;

        for (int i = 0; i < arr.length; i++) {
            minHeap.add(arr[i]);
        }

        while (minHeap.size() >= 2) {
            int first = minHeap.poll();
            int second = minHeap.poll();
            cost += first + second;
            minHeap.add(first + second);
        }

        return cost;
    }
}
