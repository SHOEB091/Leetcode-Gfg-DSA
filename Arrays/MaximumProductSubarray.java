package Arrays;

public class MaximumProductSubarray {

    //OPTIMAL APPROACH  
    //KADANES ALGORITHM
    public int maxProduct(int[] nums) {
        //uses concept kadanes algorithm 
        int n = nums.length;
        int maxProd = nums[0];  // Stores the global maximum product
        int minProd = nums[0];  // Stores the minimum product for negatives
        int result = nums[0];   // Stores the final maximum product

        for (int i = 1; i < n; i++) {
            if (nums[i] < 0) {
                // Swap maxProd and minProd when encountering a negative number
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }

            // Compute new max and min products including nums[i]
            maxProd = Math.max(nums[i], maxProd * nums[i]);
            minProd = Math.min(nums[i], minProd * nums[i]);

            // Update the final result
            result = Math.max(result, maxProd);
        }

        return result;
    }
}
