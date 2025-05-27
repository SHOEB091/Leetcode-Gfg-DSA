package sorting;

public class CountSort {
    
    // Count Sort Algorithm:
    // 1. Find the largest element in the array.
    // 2. Create a count array of size (largest + 1) to store the frequency of each element.
    // 3. Fill the count array with the frequency of each element from the original array.
    // 4. Traverse the count array and overwrite the original array with sorted elements.

    public static void countsort(int[] arr) {
        // Step 1: Find the largest element in the array
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // Step 2: Create a count array
        int[] count = new int[largest + 1];

        // Step 3: Store the frequency of each element
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Step 4: Overwrite the original array with sorted elements
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i; // Place the element in the original array
                j++;
                count[i]--; // Decrease the count
            }
        }
    }

    // Utility function to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 3, 2}; // Example array

        System.out.println("Original array:");
        printArray(arr); // Print the original array

        countsort(arr); // Perform count sort

        System.out.println("Sorted array:");
        printArray(arr); // Print the sorted array
    }
}