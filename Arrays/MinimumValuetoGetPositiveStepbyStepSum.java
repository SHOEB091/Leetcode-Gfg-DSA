package Arrays;

class MinimumValuetoGetPositiveStepbyStepSum {
    // This method finds the minimum positive start value so that the step-by-step sum is always positive
    public int minStartValue(int[] nums) {
        int total = 0; // running sum of the array
        int minPrefixSum = Integer.MAX_VALUE; // the lowest value that total reaches

        // Traverse the array and keep track of the running sum and its minimum
        for (int i = 0; i < nums.length; i++) {
            total += nums[i]; // update running sum
            minPrefixSum = Math.min(minPrefixSum, total); // update minimum prefix sum
        }

        // If the minimum prefix sum is >= 0, we only need to start with 1
        // Otherwise, we need to offset the minimum prefix sum to make all sums positive
        return minPrefixSum >= 0 ? 1 : 1 - minPrefixSum;
    }

    // Example usage and test
    public static void main(String[] args) {
        MinimumValuetoGetPositiveStepbyStepSum solver = new MinimumValuetoGetPositiveStepbyStepSum();
        int[] nums = {-3, 2, -3, 4, 2};
        // The minimum start value should be 5 for this example
        System.out.println(solver.minStartValue(nums)); // Output: 5
    }
}