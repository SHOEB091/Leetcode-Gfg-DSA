package Arrays;

public class ReversePairs{
    
    //problem states that you have given an array
    // arr[] = [40,45,19,12,9,6,2];
    // i<j && a[i] > 2* arr[j];
    // 6 + 3 +3 +2 +1 = 15

    //Brute Force Approach 

    public int reversePairs(int[] nums) {
        int count = 0;
        int n = nums.length;
        
        // Iterate from left to right
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((long) nums[i] > 2L * nums[j]) { // Prevent integer overflow
                    count++;
                }
            }
        }
        
        return count;
    }

    



}