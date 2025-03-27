package sorting;

public class InsertionSort {
    // Function to perform insertion sort on an array
    public static void insertionSort(int[] arr) {
        int n = arr.length; // Get the length of the array

        // Outer loop to iterate through the array
        for (int i = 1; i < n; i++) {
            int key = arr[i]; // Store the current element as the key
            int j = i - 1;

            // Inner loop to shift elements of the sorted part of the array
            // that are greater than the key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place the key in its correct position
            arr[j + 1] = key;
        }
    }

    // Function to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90}; // Example array

        System.out.println("Original array:");
        printArray(arr); // Print the original array

        insertionSort(arr); // Perform insertion sort

        System.out.println("Sorted array:");
        printArray(arr); // Print the sorted array
    }
}