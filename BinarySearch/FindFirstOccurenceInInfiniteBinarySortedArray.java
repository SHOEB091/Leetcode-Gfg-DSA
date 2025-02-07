package BinarySearch;

public class FindFirstOccurenceInInfiniteBinarySortedArray {

    public static int findFirstOccurrence(int[] arr, int key, int start, int end) {
        int result = -1; // Initialize result to -1 to indicate not found by default
        start =0;
        end = arr.length;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                result = mid; // Update result to current mid, but continue searching left
                end = mid - 1; // Move end to mid - 1 to search in the left half
            } else if (arr[mid] < key) {
                start = mid + 1; // Move start to mid + 1 to search in the right half
            } else {
                end = mid - 1; // Move end to mid - 1 to search in the left half
            }
        }

        return result; // Return the found index or -1 if not found
    }

    public static int findBinaryFirstOccurrence(int[] arr, int key) {
        int start = 0;
        int end = 1;

        // Ensure end does not exceed array bounds and adjust if necessary
        while (key > arr[end]) {
            start = end + 1;
            end =(end * 2);
        }

        // Now that we have a safe range, search within it
        return findFirstOccurrence(arr, key, start, end);
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}; // Example of an "infinite" sorted array
        int key = 1; // Corrected key to match the array content
        System.out.println("First occurrence of " + key + " is at index: " + findBinaryFirstOccurrence(arr, key));
    }
}