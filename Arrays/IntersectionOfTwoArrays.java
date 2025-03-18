package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArrays {
    
    // Brute Force Approach
    public int[] intersectionBruteForce(int[] nums1, int[] nums2) {
        List<Integer> resultList = new ArrayList<>();
        
        // Iterate through each element of nums1
        for (int i = 0; i < nums1.length; i++) {
            // Check if the element is already in the result list to ensure uniqueness
            if (!resultList.contains(nums1[i])) {
                // Iterate through each element of nums2
                for (int j = 0; j < nums2.length; j++) {
                    // If a common element is found, add it to the result list
                    if (nums1[i] == nums2[j]) {
                        resultList.add(nums1[i]);
                        break;
                    }
                }
            }
        }
        
        // Convert the result list to an array
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        
        return result;
    }

    public static void main(String[] args) {
        IntersectionOfTwoArrays solution = new IntersectionOfTwoArrays();
        
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] result1 = solution.intersectionBruteForce(nums1, nums2);
        System.out.println("Brute Force Result: " + Arrays.toString(result1)); // Output: [2]

        int[] nums3 = {4, 9, 5};
        int[] nums4 = {9, 4, 9, 8, 4};
        int[] result2 = solution.intersectionBruteForce(nums3, nums4);
        System.out.println("Brute Force Result: " + Arrays.toString(result2)); // Output: [4, 9]
    }
}