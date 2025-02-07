package Arrays;

import java.util.HashMap;

public class LargestSubarraySumEqualsZero {
    
    //BRUTE FORCE APPROACH 
    public static int maxLen(int arr[]) {
        int maxLen = 0; // Initialize maxLen to store the length of the largest subarray with sum 0

        for (int i = 0; i < arr.length; i++) {
            int sum = 0; // Initialize sum for the current subarray

            for (int j = i; j < arr.length; j++) {
                sum += arr[j]; // Add the current element to the sum

                // If the sum is 0, update maxLen if the current subarray length is greater
                if (sum == 0) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }

        return maxLen; // Return the length of the largest subarray with sum 0
    }

    //OPTIMAL APPROACH 
    public static int maxLen2(int arr[]) {
        // HashMap to store the cumulative sum and its index
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == 0) {
                maxLen = i + 1;
            }

            if (map.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        
        int[] arr1 = {1, 2, -2, 4, -4};
        System.out.println(maxLen(arr1)); // Output: 4

        int[] arr2 = {1, -1, 3, 2, -2, -3, 3};
        System.out.println(maxLen(arr2)); // Output: 6
    }

}
