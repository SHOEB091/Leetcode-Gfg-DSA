package sorting;

public class BubbleSort {
    // Function to perform bubble sort on an array
    public static void bubbleSort(int[] arr) {
        int n = arr.length; // Get the length of the array

        // Outer loop to control the number of passes
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false; // Flag to check if any swapping occurred

            // Inner loop to compare adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) { // If the current element is greater than the next element
                    // Swap the elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true; // Set the flag to true as swapping occurred
                }
            }

            // If no swapping occurred in the inner loop, the array is already sorted
            if (!swapped) {
                break;
            }
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

        bubbleSort(arr); // Perform bubble sort

        System.out.println("Sorted array:");
        printArray(arr); // Print the sorted array
    }
}