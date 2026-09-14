package Heaps;

import java.util.PriorityQueue;

public class kClosestNumber {

    // Step 1: Define a Pair class to hold the distance (key) and the array number (value)
    public static class Pair implements Comparable<Pair> {
        int key;   // Stores the distance: |arr[i] - x|
        int value; // Stores the actual number from arr[]

        // Constructor to initialize the Pair
        public Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }

        // compareTo decides the priority inside the heap
        @Override
        public int compareTo(Pair other) {
            // "other.key - this.key" creates a MAX-HEAP based on the key (distance).
            // The pair with the larger distance goes to the top of the heap.
            return other.key - this.key; 
        }  
    }

    // Step 2: Method to find and print the k closest numbers to target x
    public static void kClosest(int arr[], int k, int x) {
        // PriorityQueue stores Pair objects using the compareTo rules defined above
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>();

        // Loop through every number in the input array
        for (int i = 0; i < arr.length; i++) {
            // Calculate absolute distance from x: Math.abs(arr[i] - x)
            // Create a new Pair and push it into the maxHeap
            maxHeap.add(new Pair(Math.abs(arr[i] - x), arr[i]));

            // If the heap grows larger than k, remove the top element.
            // Because this is a Max-Heap, poll() automatically removes the element
            // that is FARTHEST from x (has the largest distance).
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        // At this point, the heap holds only the k closest elements.
        // We pop each pair out and print its value.
        while (!maxHeap.isEmpty()) {
            Pair p = maxHeap.poll(); // poll() retrieves and removes the head Pair
            System.out.println("k closest elements are -> " + p.value);
        }
    }

    // Step 3: Main method to run and test the logic
    public static void main(String[] args) {
        int arr[] = {5, 6, 7, 8, 9};
        int k = 3; // Number of closest elements to find
        int x = 7; // Target number to measure distance from

        kClosest(arr, k, x);
    }
}
