package BinarySearch;

public class CountOfElementInSortedArray {

    // Method to find the first occurrence of the key
    public static int findFirstOccurrence(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (key == arr[mid]) {
                ans = mid;
                end = mid - 1; // Move left to find the first occurrence
            } else if (key < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    // Method to find the last occurrence of the key
    public static int findLastOccurrence(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (key == arr[mid]) {
                ans = mid;
                start = mid + 1; // Move right to find the last occurrence
            } else if (key < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    // Method to count the occurrences of the key
    public static int countElement(int[] arr, int key) {
        int firstOccurrence = findFirstOccurrence(arr, key);
        if (firstOccurrence == -1) {
            return 0; // Key not found
        }
        int lastOccurrence = findLastOccurrence(arr, key);
        return lastOccurrence - firstOccurrence + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int key = 2;
        System.out.println("Count of element " + key + " is: " + countElement(arr, key));
    }
}