package Arrays;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int n = nums.length;

        // First, find the blue gola
        int golaIndex = -1;

        for (int i = n - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                golaIndex = i - 1;
                break;
            }
        }

        if (golaIndex != -1) {
            int swapIndex = golaIndex;

            for (int j = n - 1; j > golaIndex; j--) {
                if (nums[j] > nums[golaIndex]) {
                    swapIndex = j;
                    break;
                }
            }

            // Swap nums[golaIndex] and nums[swapIndex]
            int temp = nums[golaIndex];
            nums[golaIndex] = nums[swapIndex];
            nums[swapIndex] = temp;
        }

        // Reverse from golaIndex + 1 to the end
        reverse(nums, golaIndex + 1, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
