package Arrays;

public class ReversePairs{
    
    //problem states that you have given an array
    // arr[] = [40,45,19,12,9,6,2];
    // i<j && a[i] > 2* arr[j];
    // 6 + 3 +3 +2 +1 = 15

    //Brute Force Approach 

    public int reversePairs(int[] nums) {
        int count = 0;
        int n = nums.length;
        
        // Iterate from left to right
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((long) nums[i] > 2L * nums[j]) { // Prevent integer overflow
                    count++;
                }
            }
        }
        
        return count;
    }    
}
    
    //OPTIMAL APPROACH 
    //merge sort approach 

class Solution {
    public int reversePairs(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        return mergeSort(nums, 0, nums.length - 1);
    }

    private int mergeSort(int[] nums, int left, int right) {
        if (left >= right) return 0;

        int mid = left + (right - left) / 2;
        int count = mergeSort(nums, left, mid) + mergeSort(nums, mid + 1, right);
        
        // Count reverse pairs before merging
        count += countPairs(nums, left, mid, right);
        
        // Merge the two sorted halves
        merge(nums, left, mid, right);
        
        return count;
    }

    private int countPairs(int[] nums, int left, int mid, int right) {
        int count = 0, j = mid + 1;
        
        // Count valid pairs (nums[i] > 2 * nums[j])
        for (int i = left; i <= mid; i++) {
            while (j <= right && (long) nums[i] > 2L * nums[j]) {
                j++;
            }
            count += (j - (mid + 1));
        }
        
        return count;
    }

    private void merge(int[] nums, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        while (i <= mid) temp[k++] = nums[i++];
        while (j <= right) temp[k++] = nums[j++];
        
        // Copy back to original array
        System.arraycopy(temp, 0, nums, left, temp.length);
    }
}
