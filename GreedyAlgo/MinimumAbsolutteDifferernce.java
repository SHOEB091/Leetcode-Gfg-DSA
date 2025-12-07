package GreedyAlgo;

import java.util.Arrays;

public class MinimumAbsolutteDifferernce {

    public static int minAbsDifference(int[]arr1,int[]arr2){

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int minDifference = Integer.MAX_VALUE;
        for(int i=0;i<arr1.length;i++){
           minDifference = Math.min(minDifference, Math.abs(arr1[i]-arr2[i]));
        }
        return minDifference;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 2, 3};
        int[] arr2 = {2, 5, 1, 8};

        System.out.println("The minimum absolute difference is " + minAbsDifference(arr1, arr2));
    }
}
