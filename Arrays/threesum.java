package Arrays;
import java.util.*;
public class threesum {

    //for comparing but without duplicate element
    //arr[i] == arr[i+1] i++;
    //arr[j] == arr[j+1] j++;

    //dividing threeSum in Parts 
    // two sum and one 
    // n1+n2+n3 =0
    //(n2+n3) = -n1

    //sorting
    //Duplicates
    // Fixed(n1) , duplicates avoid
    public static List<List<Integer>> threeSum (int[]nums){
        if(nums.length<3){
            return new ArrayList<>();
        }

        List<List<Integer>> result = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            //arr[] = { 0,2,-1,-1}. // like here is -1 , -1;
            if(i!=0 && nums[i]==nums[i-1]){
                continue;
            }

            twoSum(nums,i+1,result,-nums[i]);
        }
        return result;
    }
    // k=i+1
    private static void twoSum(int[]nums , int k , List<List<Integer>>result , int target){
        int i=k , j=nums.length-1;
        while(i<j){
            if(nums[i]+nums[j]>target){
                j--;
            }
            else if(nums[i]+nums[j]<target){
                i++;
            }
            else{
                result.add(Arrays.asList(--target,nums[i],nums[j]));

                while(i<j && nums[i]==nums[i+1]){
                    i++;
                }
                while(i<j && nums[j]==nums[j-1]){
                    j--;
                }

                i++;
                j--;
            }

        }

    }

}
