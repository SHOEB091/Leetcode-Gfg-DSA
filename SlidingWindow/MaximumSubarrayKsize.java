package SlidingWindow;
import java.util.*;
//window calculation j-i=1 =k;

public class MaximumSubarrayKsize {

    static int slidingWindow(int[]arr,int k){
        int i=0;
        int j=0;
        int sum =0;
        int max = Integer.MIN_VALUE;
        while(j<arr.length){
            sum= sum+arr[j]; // in window size j is included 
           if(j-i+1<k){
            j++;
           }
           else if(j-i+1 ==k){
                max = Math.max(max,sum);//Sum is stored in maximum 
                //wehn we reach the window size so we  an incerement the pointer
                sum -= arr[i];//beacuse left part of array is decrement and right part is added  
                i++;
                j++;

           }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 10;
        int k = 3;
        int[] arr = new int[size];
        System.out.println("Enter the values in an array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int maxSum = slidingWindow(arr, k);
        System.out.println("Maximum sum of subarray of size " + k + " is: " + maxSum);
        sc.close();
    
    }
}
