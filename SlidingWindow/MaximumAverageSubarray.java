package SlidingWindow;

public class MaximumAverageSubarray {
    public double findMaxAverage(int[] nums, int k) {
        int i=0;
        int j=0;
        double max =Double.MIN_VALUE;
       
        int sum =0;
        while(j<nums.length){
            sum = sum +nums[j];
           
            if(j-i+1 <k){
                j++;
            }
            else if(j-i+1==k){
                double avg = (double) sum / k;
               max = Math.max(max,avg);
               sum -= nums[i];
                i++;
                j++;
            }
        }
        return  max;
    }
}
