package BinarySearch;

public class SearchInNearlySortedArray {

    public static int nearlySorted(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (key == arr[mid]) {
                return mid;
            } else if (mid - 1 >= start && arr[mid - 1] == key) {
                return mid - 1; // Corrected to return the index
            } else if (mid + 1 <= end && arr[mid + 1] == key) {
                return mid + 1; // Corrected to return the index and condition
            } else if (key < arr[mid]) {
                end = mid - 2; // Move left, skipping one element
            } else {
                start = mid + 2; // Move right, skipping one element
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] arr = {10, 3, 40, 20, 50, 80, 70};
        int key = 40;
        System.out.println("Element found at index: " + nearlySorted(arr, key));
    }
}