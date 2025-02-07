package SlidingWindow;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // Example array
        int[] prefixSum = new int[arr.length];

        // Calculate prefix sum
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        // Print prefix sum array
        for (int i = 0; i < prefixSum.length; i++) {
            System.out.println("Prefix sum up to index " + i + " is: " + prefixSum[i]);
        }
    }
}