package BinarySearch;

public class CountNoOfTimesSortedArrayRotated {
    
    public static int CountNoOFSortedRotatedArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int n = arr.length;
        while (start <= end) {
            // If the array is not rotated at all
            if (arr[start] <= arr[end]) {
                return start;
            }
            int mid = start + (end - start) / 2;
            int next = (mid + 1) % n;
            int prev = (mid + n - 1) % n;
            if (arr[mid] <= arr[next] && arr[mid] <= arr[prev]) {
                return mid;
            } else if (arr[start] <= arr[mid]) {
                start = mid + 1;
            } else if (arr[mid] <= arr[end]) {
                end = mid - 1;
            }
        }
        return -1; // This case should never be reached if the array is a rotated sorted array
    }

    public static void main(String[] args) {
        int arr[] = {11, 12, 15, 18, 2, 5, 6, 8};
        System.out.println("The number of times a sorted array is rotated: " + CountNoOFSortedRotatedArray(arr));
    }
}