package BinarySearch;

public class SearchInBitonicArray {
    // Find the peak element in a bitonic array
    public static int maxPeakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid > 0 && mid < arr.length - 1) {
                if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                    return mid;
                } else if (arr[mid - 1] > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (mid == 0) {
                if (arr[0] > arr[1]) {
                    return 0;
                } else {
                    return 1;
                }
            } else if (mid == arr.length - 1) {
                if (arr[arr.length - 1] > arr[arr.length - 2]) {
                    return arr.length - 1;
                } else {
                    return arr.length - 2;
                }
            }
        }

        return -1; // Should never reach here if the array is bitonic
    }

    // Order-agnostic binary search
    public static int agnosticBinarySearch(int[] arr, int start, int end, int key) {
        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            if (isAscending) {
                if (key < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (key > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1; // Element not found
    }

    // Search for a key in a bitonic array
    public static int searchInBitonic(int[] arr, int key) {
        int peakIndex = maxPeakElement(arr);

        // Search in the ascending part
        int result = agnosticBinarySearch(arr, 0, peakIndex-1, key);
        if (result != -1) {
            return result;
        }

        // Search in the descending part
        return agnosticBinarySearch(arr, peakIndex , arr.length - 1, key);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 12, 4, 2};
        int key = 4;
        int result = searchInBitonic(arr, key);
        System.out.println("Element found at index: " + result);
    }
}