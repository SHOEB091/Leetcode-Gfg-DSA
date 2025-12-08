package GreedyAlgo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MaxEvents {

    public int maxEvents(int[][] events) {

        int n = events.length;

        // Sort events by start day (as you wrote)
        Arrays.sort(events, Comparator.comparingInt(o -> o[0]));

        // Min-heap storing event end-days
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int day = events[0][0];  // start from first event's start day
        int i = 0;               // pointer to events array
        int count = 0;           // result: events attended

        // Loop while we still have events to process OR heap not empty
        while (!pq.isEmpty() || i < n) {

            // Add all events starting today into heap
            while (i < n && events[i][0] == day) {
                pq.add(events[i][1]);  // push event end-day
                i++;
            }

            // Remove finished events (end < today)
            while (!pq.isEmpty() && pq.peek() < day) {
                pq.poll();
            }

            // Attend the event that ends earliest
            if (!pq.isEmpty()) {
                pq.poll();  // attend 1 event today
                count++;    // increase answer
            }

            day++; // move to next day
        }

        return count;
    }


}
