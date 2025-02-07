package BinarySearch;

public class FindCielOfElement {

    // ceil of an element = smallest element which is greater than given element

    public static int cielOfNumber(int[] arr, int key) {
        int result = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                return arr[mid];
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else if (arr[mid] > key) {
                result = arr[mid];
                end = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int key = 5;
        System.out.println("Ceiling of " + key + " is: " + cielOfNumber(arr, key));
        key = 20;
        System.out.println("Ceiling of " + key + " is: " + cielOfNumber(arr, key)); // Test case where ceiling does not exist
    }
}