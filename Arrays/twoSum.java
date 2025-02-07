package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum {
    /*  //Approach 1
    public static int [] twosum(int[]arr,int targetSum){
        int sum =0;
      
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==targetSum){
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
        */
    public static int[] mapTwoSum(int[]arr,int target){
        Map<Integer , Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int remaining = target - arr[i];

            //check that if it is in map or not in past 
            if(map.containsKey(remaining)){
                return new int[]{map.get(remaining),i};
            }
            map.put(arr[i],i);    
        }


        return new int[]{};

    }

    public static void main(String[] args) {
        int []arr = {3,4,9,2};
       // int [] result = twosum(arr, 11);
       // System.out.println(Arrays.toString(result));

    }


}
