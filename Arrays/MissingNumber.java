package Arrays;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        
        int n = nums.length;

        int expectedSum = (n*(n+1))/2;

        int actualSum = 0;
        for (int num: nums){
            actualSum+= num;
        }

        return expectedSum - actualSum;

    }
}

//Brute Force Approach 
/*

    class Solution {
    public int missingNumber(int[] nums) {
         Arrays.sort(nums); // Step 1: Sort the array

        // Step 2: Iterate to find the mismatch
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i; // Missing number
            }
        }

        // Step 3: Handle edge cases
        if (nums[0] != 0) {
            return 0; // Missing smallest number
        }
        return nums.length; // Missing largest number
    }
}


 */