package Hashing;

import java.util.*;

public class LimitedRangeFrequency {
    // Function to count the frequency of all elements from 1 to N in the array.
    public List<Integer> frequencyCount(int[] arr, int N) {
        // Create a map to count frequencies
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequencies
        for (int num : arr) {
            if (num >= 1 && num <= N) { // Only consider numbers in the range 1 to N
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        // Create a list of size N to store frequencies
        List<Integer> frequencies = new ArrayList<>(Collections.nCopies(N, 0));

        // Populate the list with frequencies
        for (int i = 0; i < N; i++) {
            frequencies.set(i, map.getOrDefault(i + 1, 0));
        }

        return frequencies;
    }

    public static void main(String[] args) {
        LimitedRangeFrequency solution = new LimitedRangeFrequency();
        int[] arr = {2, 3, 2, 5}; // Example array
        int N = 5; // Size of the array

        // Call the frequencyCount function and print the result
        List<Integer> result = solution.frequencyCount(arr, N);
        System.out.println("Frequency List: " + result);
    }
}
