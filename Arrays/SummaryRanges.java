package Arrays;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        
        if (nums == null || nums.length == 0) {
            return result;
        }
        
        int start = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            // Check if the current number is not consecutive
            if (nums[i] != nums[i - 1] + 1) {
                // Add the range to the result list
                if (start == nums[i - 1]) {
                    result.add(String.valueOf(start));
                } else {
                    result.add(start + "->" + nums[i - 1]);
                }
                // Update the start of the new range
                start = nums[i];
            }
        }
        
        // Add the last range to the result list
        if (start == nums[nums.length - 1]) {
            result.add(String.valueOf(start));
        } else {
            result.add(start + "->" + nums[nums.length - 1]);
        }
        
        return result;
    }

    public static void main(String[] args) {
        SummaryRanges solution = new SummaryRanges();
        
        int[] nums1 = {0, 1, 2, 4, 5, 7};
        System.out.println("Summary Ranges: " + solution.summaryRanges(nums1)); // Output: ["0->2", "4->5", "7"]

        int[] nums2 = {0, 2, 3, 4, 6, 8, 9};
        System.out.println("Summary Ranges: " + solution.summaryRanges(nums2)); // Output: ["0", "2->4", "6", "8->9"]
    }
}