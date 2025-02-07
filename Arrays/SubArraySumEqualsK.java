package Arrays;
import java.util.*;

public class SubArraySumEqualsK {

    // Function to find the number of subarrays that sum to a given value k
    public static int subArray(int[] arr, int k) {
        // HashMap to store the cumulative sum and its frequency
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int result = 0; // Initialize result to store the count of subarrays
        int sum = 0; // Initialize sum to store the cumulative sum

        // Initialize the map with a base case (sum 0 has one occurrence)
        map.put(0, 1);

        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // Update the cumulative sum

            // Check if there is a subarray (ending at index i) whose sum is k
            if (map.containsKey(sum - k)) {
                result += map.get(sum - k); // Increment result by the frequency of (sum - k)
            }

            // Update the frequency of the current cumulative sum in the map
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return result; // Return the count of subarrays that sum to k
    }

    //BruteForce Approach

    class Solution {
        public int subarraySum(int[] nums, int k) {
            int count = 0;
    
            // Outer loop to fix the starting point
            for (int i = 0; i < nums.length; i++) {
                int sum = 0; // Reset sum for each starting point
    
                // Inner loop to calculate sum for subarrays starting at 'i'
                for (int j = i; j < nums.length; j++) {
                    sum += nums[j]; // Add the current element to the sum
    
                    // Check if the sum equals k
                    if (sum == k) {
                        count++; // Increment count if condition is met
                    }
                }
            }
    
            return count; // Return total count of subarrays
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1};
        int k = 2;
        System.out.println(subArray(arr, k)); // Output: 2
    }
}