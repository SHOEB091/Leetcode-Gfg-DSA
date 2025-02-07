package Arrays;

class Solution {
    // Function to find the maximum number of consecutive 1s in the array.
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0; // Initialize count to keep track of the current number of consecutive 1s.
        int max = 0;   // Initialize max to keep track of the maximum number of consecutive 1s found.

        // Iterate through the array.
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) { // If the current element is 1,
                count++;        // increment the count.
                max = Math.max(max, count); // Update max if the current count is greater than max.
            } else { // If the current element is not 1,
                count = 0; // reset the count to 0.
            }
        }

        return max; // Return the maximum number of consecutive 1s found.
    }
}
