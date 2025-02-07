package BinarySearch;

/**
 * FindMinimumInSortedRotatedArray
 */
public class FindMinimumInSortedRotatedArray {

    public static int FindMinimum(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[end]) {
                // If mid element is greater than the end element, minimum is in the right part
                start = mid + 1;
            } else {
                // If mid element is less than or equal to the end element, minimum is in the left part including mid
                end = mid;
            }
        }
        // After the loop, start will be pointing to the minimum element
        return arr[start];
    }

    public static void main(String[] args) {
        int arr[] = {11, 12, 15, 18, 2, 5, 6, 8};
        System.out.println("The minimum element in the array is " + FindMinimum(arr));
    }
}