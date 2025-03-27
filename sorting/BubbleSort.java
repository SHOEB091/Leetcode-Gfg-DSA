package sorting;

public class BubbleSort {
    // Function to perform bubble sort on an array
    public static void bubbleSort(int[] arr) {
        int n = arr.length; // Get the length of the array

        // Outer loop to control the number of passes
        for (int i = n - 1; i >= 0; i--) {
            boolean didSwap = false; // Flag to check if any swapping occurred

            // Inner loop to compare adjacent elements
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) { // If the current element is greater than the next element
                    // Swap the elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    didSwap = true; // Set the flag to true as swapping occurred
                }
            }

            // If no swapping occurred in the inner loop, the array is already sorted
            if (!didSwap) {
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
        int[] arr = {13, 46, 24, 52, 20, 9}; // Example array

        System.out.println("Before Bubble Sort:");
        printArray(arr); // Print the original array

        bubbleSort(arr); // Perform bubble sort

        System.out.println("After Bubble Sort:");
        printArray(arr); // Print the sorted array
    }
}