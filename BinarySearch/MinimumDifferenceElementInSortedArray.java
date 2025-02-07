package BinarySearch;

public class MinimumDifferenceElementInSortedArray {

    static int findMinimumDifference(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (key == arr[mid]) {
                return arr[mid];
            } else if (key < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        // Handle edge cases where start or end might go out of bounds
        if (start >= arr.length) {
            return arr[end];
        }
        if (end < 0) {
            return arr[start];
        }

        // Calculate absolute differences
        int absolute1 = Math.abs(arr[start] - key);
        int absolute2 = Math.abs(arr[end] - key);

        // Return the element with the minimum difference
        return absolute1 < absolute2 ? arr[start] : arr[end];
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 10, 15};
        int key = 12;
        System.out.println("Element with minimum difference to " + key + " is: " + findMinimumDifference(arr, key));
    }
}