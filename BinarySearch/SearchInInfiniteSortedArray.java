package BinarySearch;

public class SearchInInfiniteSortedArray {

    // Modified binarySearch method to accept start and end indices
    public static int binarySearch(int[] arr, int key, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (key < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int findInInfiniteArray(int[] arr, int key) {
        // Start with a size of 1
        int low = 0;
        int high = 1;
        // Double the size until the high index is greater than or equal to the key
        while (key > arr[high]) {
            low = high; // Move low to high
            high = 2 * high; // Double the high index
        }
        // Now that we have a range [low, high] where the element might be, use binary search within this range
        return binarySearch(arr, key, low, high);
    }

    public static void main(String[] args) {
        // Example usage
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170}; // Assuming an "infinite" array
        int key = 10;
        System.out.println("Element found at index: " + findInInfiniteArray(arr, key));
    }
}