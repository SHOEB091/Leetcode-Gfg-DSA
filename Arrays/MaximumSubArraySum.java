package Arrays;

public class MaximumSubArraySum{
    //int arr[] = [ -2, -3, 4,-1,-2,1,5,-3]
    /* 
    int max = Integer.MIN_VALUE;
     for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
            Sum =0;
            for(int k=i;k<j;k++){
            sum += arr[k]

            }
            int max = Math.max(max , sum);
        }
     }
        return max 
    */

    public int pairWithMaxSum(int arr[]) {
        // Your code goes here
      int n=arr.length,sum=0,max=0;
      for(int i=0;i<n-1;i++){
          sum=arr[i]+arr[i+1];
          max=Math.max(sum,max);
      }
      return max;
    }

}