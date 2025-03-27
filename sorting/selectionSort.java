package sorting;

public class selectionSort {
    // Function to perform selection sort on an array
    public static void selection(int[] arr) {
        int n = arr.length; // Get the length of the array

        // Outer loop to iterate through the array
        for (int i = 0; i < n - 1; i++) {
            int mini = i; // Assume the current index is the minimum

            // Inner loop to find the minimum element in the unsorted part of the array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[mini]) { // If a smaller element is found, update mini
                    mini = j;
                }
            }

            // Swap the minimum element with the first element of the unsorted part
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
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
        int[] arr = {64, 25, 12, 22, 11}; // Example array

        System.out.println("Original array:");
        printArray(arr); // Print the original array

        selection(arr); // Perform selection sort

        System.out.println("Sorted array:");
        printArray(arr); // Print the sorted array
    }
}