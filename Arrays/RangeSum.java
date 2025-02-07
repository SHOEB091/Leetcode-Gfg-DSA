package Arrays;

class NumArray {
    private int[] prefixSum;
    public NumArray(int[] nums) { ///converting input array into prefix sum 
       for(int i=1;i<nums.length;i++){
        nums[i]+=nums[i-1];
       }
       this.prefixSum = nums;
    }
    
    public int sumRange(int left, int right) {
       if(left ==0){
        return prefixSum[right];
       }

       return prefixSum[right]-prefixSum[left-1];
    }
}

//bruteForce Approach 

class NumArray1 {
    private int[] nums;
    public NumArray1(int[] nums) {
        this.nums = nums;
    }
    
    public int sumRange(int left, int right) {
        int sum =0;
        
        for(int i=left;i<=right;i++){
            sum +=nums[i];
        }

        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
