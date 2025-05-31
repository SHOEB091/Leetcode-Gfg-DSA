package sorting;

public class QuickSort {

 //The pivot index is the position in the array where the pivot element ends up after partitioning, dividing the array into two parts for further sorting.


    // Utility function to print the array
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Recursive function to perform quick sort
    public static void quickSort(int[] arr, int start, int end) {
        // Base case: if the subarray has one or no elements, it's already sorted
        if (start >= end) {
            return;
        }

        // Partition the array and get the pivot index
        int pindex = partition(arr, start, end);

        // Recursively sort the left part
        quickSort(arr, start, pindex - 1);

        // Recursively sort the right part
        quickSort(arr, pindex + 1, end);
    }

    // Function to partition the array and return the pivot index
    public static int partition(int arr[], int start, int end) {
        int pivot = arr[end]; // Choose the last element as pivot
        int i = start - 1;    // Index of smaller element

        // Traverse through all elements and compare with pivot
        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // Place the pivot in the correct position
        i++;
        int temp = arr[end];
        arr[end] = arr[i];
        arr[i] = temp;

        return i; // Return the pivot index
    }

    public static void main(String args[]) {
        int[] arr = { 6, 3, 9, 8, 2, 5 }; // Example array

        System.out.println("Before Quick Sort:");
        printArr(arr); // Print the original array

        quickSort(arr, 0, arr.length - 1); // Perform quick sort

        System.out.println("After Quick Sort:");
        printArr(arr); // Print the sorted array
    }
}