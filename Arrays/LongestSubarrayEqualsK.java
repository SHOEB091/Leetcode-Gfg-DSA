package Arrays;

public class LongestSubarrayEqualsK {

    // Function to find the length of the longest subarray that sums to a given value k
    public static int longestSubArray(int[] a, int k) {
        int n = a.length; // size of the array

        int left = 0, right = 0; // 2 pointers
        long sum = a[0];
        int maxLen = 0;

        while (right < n) {
            // if sum > k, reduce the subarray from left
            // until sum becomes less or equal to k:
            while (left <= right && sum > k) {
                sum -= a[left];
                left++;
            }

            // if sum = k, update the maxLen i.e. answer:
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            // Move forward the right pointer:
            right++;
            if (right < n) sum += a[right];
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, -1, 5, -2, 3};
        int k1 = 3;
        System.out.println(longestSubArray(arr1, k1)); // Output: 4

        int[] arr2 = {-2, -1, 2, 1};
        int k2 = 1;
        System.out.println(longestSubArray(arr2, k2)); // Output: 2

        int[] arr3 = {1, 2, 3};
        int k3 = 3;
        System.out.println(longestSubArray(arr3, k3)); // Output: 2

        int[] arr4 = {1, 2, 3, 4, 5};
        int k4 = 15;
        System.out.println(longestSubArray(arr4, k4)); // Output: 5

        int[] arr5 = {1, 2, 3, 4, 5};
        int k5 = 10;
        System.out.println(longestSubArray(arr5, k5)); // Output: 4
    }
}