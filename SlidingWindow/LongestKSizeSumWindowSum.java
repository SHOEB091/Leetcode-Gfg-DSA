package SlidingWindow;
public class LongestKSizeSumWindowSum {
    public static int longestsum(int[]arr,int k){
        int i=0;
        int j=0;
        int maxsum =0;
        int sum =0;
        while(j<arr.length){
            sum = sum +arr[j];
            if(j-i+1 <k){
                j++;
            }
            else if(j-i+1 ==k){
                maxsum = Math.max(maxsum , sum);
                sum -= arr[i];
                i++;
                j++;
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;
        System.out.println("Maximum sum of a subarray of size " + k + ": " + longestsum(arr, k));
    }
}
