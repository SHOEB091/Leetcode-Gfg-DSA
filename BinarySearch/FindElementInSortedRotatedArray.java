package BinarySearch;

public class FindElementInSortedRotatedArray {

    public static int findElement(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (arr[mid] == target) {
                return mid;
            }
            
            // Check if the left half is sorted
            if (arr[start] <= arr[mid]) {
                if (target >= arr[start] && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            // If the left half is not sorted, then the right half must be sorted
            else {
                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int arr[] = {11, 12, 15, 18, 2, 5, 6, 8};
        int target = 18;
        System.out.println("The element found at index: " + findElement(arr, target));
    }
}
