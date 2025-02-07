package SlidingWindow;

public class LongestSubarrayEqualsToK {
    
    static int longestSubarray(int[] arr, int k) {
        long sum = 0;
        int max = 0; 
        int i = 0;
        int j = 0;
        while (j < arr.length) {
            sum += arr[j]; // Add the current element to sum
            while (sum > k && i <= j) { // Changed condition to reduce sum when it's greater than k
                sum -= arr[i];
                i++;
            }
            if (sum == k) { // Check if sum equals k after adjusting
                max = Math.max(max, j - i + 1); // Update max if current subarray is longer
            }
            j++; // Move to the next element
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 1, 1, 2, 3, 5};
        int k = 5;
        System.out.println(longestSubarray(arr, k)); // Added a print statement to display the result
    }
}