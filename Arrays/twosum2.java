package Arrays;

import java.util.HashMap;
import java.util.Map;

public class twosum2 {
    /* APPROACH 1
    public int[] twoSum(int[] numbers, int target) {
        Map <Integer, Integer> map =new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int remaining = target - numbers[i];

            if(map.containsKey(remaining)){
               return new int[]{map.get(remaining)+1,i+1}; //returns one based indexes like [1,2]
            }
            map.put(numbers[i],i);
        }
        return new int[]{};
    }
    */

    //APPROACH2

    //all this work if ARRAY is Sorted 

    // arr []= {1,2,4,6,8,9}
    // i=0; j=arr.length-1;
    // compare arr[i]+arr[j] 
    // if arr[i]+arr[j] is greater than target then decrement j j--;
    //if arr[i]+arr[j] is less than target then increment i i++
    // if arr[i]+arr[j] =target return index;

    public int[] twoSum(int[] numbers, int target) {
        int start =0;
        int end = numbers.length-1;
        while(start<end){
            int sum = numbers[start]+numbers[end];
            if(numbers[start]+numbers[end]>target){
                end--;
            }
            else if(numbers[start]+numbers[end]<target){
                start++;
            }
            else{
                return new int[]{start+1,end+1};
            }
        }
        return new int[]{};
    }

    

}
