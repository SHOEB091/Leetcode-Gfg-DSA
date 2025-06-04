package Arrays;
//Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
public class MinimumSizeSubArraySum {
    
    //Brute Force Approach 
    public int minSubArrayLen(int target, int[] nums) {
        int minimumLength = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            for(int j =i;j<nums.length;j++){
                sum = sum + nums[j];
                if(sum>=target){
                    minimumLength = Math.min(minimumLength,j-i+1);
                    break;
                }
            }
        }
         return (minimumLength == Integer.MAX_VALUE) ? 0 : minimumLength;
    }

    //Sliding Window Approach 
    public int minimumSubArraysum(int arr[], int target){
        int left = 0;
        int sum =0;
        int minLength = Integer.MIN_VALUE;
        for(int right = 0; right<arr.length;right++){
            sum +=arr[right];
            while(sum>=target){
                minLength = Math.min(minLength,right-left+1);
                sum -=arr[left];
                left++;
            }
        }
        return (minLength == Integer.MIN_VALUE) ? 0 : minLength;
    }
}
