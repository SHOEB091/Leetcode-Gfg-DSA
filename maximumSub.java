public abstract class maximumSub {
    public int maximumSubArray(int[] nums){
    int maxSum = Integer.MIN_VALUE;
    
    for(int i=0;i<nums.length;i++){
        int currentSum = 0;
        for(int j=i; j<nums.length;j++){
            currentSum += nums[j];
            maxSum = Math.max(maxSum,currentSum);
        }
    }
    return maxSum;
    }
    //optimal approach 
    
    public static int maxSubArr(int[] nums){
        int currentSum = nums[0];
        int maxSum = nums[0];

        for(int i = 1;i<nums.length;i++){
            currentSum = Math.max(nums[i],currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }



    public static void main(String[] args){
        // arr[] = { -2, 1, -3, 4, -1 , 2, 1, -5, 4}
  
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArr(nums));
    }
}
