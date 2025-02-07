package BinarySearch;

import java.util.HashMap;
import java.util.Map;

public class SortColors {
     public static void sortColors(int[] nums) {
        Map<Integer, Integer> colorCount = new HashMap<>();
        
        // Count each color
        for (int num : nums) {
            colorCount.put(num, colorCount.getOrDefault(num, 0) + 1);
        }
        
        // Fill the array based on the count
        int index = 0;
        for (int color = 0; color <= 2; color++) { // For colors 0, 1, and 2
            int count = colorCount.getOrDefault(color, 0);
            while (count > 0) {
                nums[index++] = color;
                count--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}

/*
 class Solution3 {
    public void sortColors(int[] nums) {
        int n = nums.length;

        int i = 0;   // denotes for 0
        int j = 0;   // denotes for 1
        int k = n - 1; // denotes for 2

        while (j <= k) {
            if (nums[j] == 1) {
                j++;
            } else if (nums[j] == 2) {
                int temp = nums[j];
                nums[j] = nums[k];
                nums[k] = temp;
                k--;
            } else { // nums[j] == 0
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
                j++;
            }
        }
    }
}

 */