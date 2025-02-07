package Arrays;

import java.util.*;
public class fourSum {


    public List<List<Integer>> fourSUM(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);  // Sort the array
        int n = nums.length;

        for (int i = 0; i < n - 3; i++) {
            // Skip duplicate elements for i
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            for (int j = i + 1; j < n - 2; j++) {
                // Skip duplicate elements for j
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int p = j + 1, q = n - 1;  // another two pointer ahead of  j+1 of that sorted array
                
                while (p < q) {
                    long sum = (long) nums[i] + nums[j] + nums[p] + nums[q]; // Avoid integer overflow
                    
                    if (sum < target) {
                        p++;
                    } else if (sum > target) {
                        q--;
                    } else {
                        // Add the quadruplet to the result list
                        list.add(Arrays.asList(nums[i], nums[j], nums[p], nums[q]));
                        
                        // Skip duplicate elements for p and q
                        while (p < q && nums[p] == nums[p + 1]) p++;
                        while (p < q && nums[q] == nums[q - 1]) q--;

                        p++;
                        q--;
                    }
                }
            }
        }
        return list;
    }


}
/*
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int sum =0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int p= j+1 , q = nums.length-1;
                while(p<q){
                    sum = nums[i]+nums[j]+nums[p]+nums[q];
                    if(sum<target){
                        p++;
                    }
                    else if(sum>target){
                        q--;
                    }
                    else if(sum==target){
                        list.add(sum);
                        p++;
                        q--;
                    }
                }
            }
        }
        return list;
    }
 */
