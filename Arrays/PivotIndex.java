package Arrays;
class PivotIndex {
    public int pivotIndex(int[] nums) {

        // Step 1: Calculate the total sum of the array
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num; // Add each number to totalSum
        }

        // Step 2: Initialize leftSum to 0 (nothing to the left initially)
        int leftSum = 0;

        // Step 3: Traverse the array to check for pivot index
        for (int i = 0; i < nums.length; i++) {

            // rightSum is totalSum - leftSum - nums[i]
            // Why? Because rightSum = totalSum - leftSide - currentElement
            int rightSum = totalSum - leftSum - nums[i];

            // Step 4: Check if left and right sums are equal
            if (leftSum == rightSum) {
                return i; // Found pivot index
            }

            // Step 5: If not equal, update leftSum by adding current element
            leftSum += nums[i];
        }

        // Step 6: If no pivot index found, return -1
        return -1;
    }
}

/*
 * Given an array of integers nums, calculate the pivot index of this array.

 *The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

 *If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

 *Return the leftmost pivot index. If no such index exists, return -1.
 */