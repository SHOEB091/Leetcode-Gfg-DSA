package sorting;

public class MergeSort {
    
    // Utility function to print the array
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    // Recursive function to perform merge sort
    public static void mergesort(int[] arr, int start, int end) {

        // Base case: if the subarray has one or no elements, it's already sorted
        if(start >= end){
            return;
        }

        // Find the middle index to divide the array into two halves
        int mid = start + (end - start) / 2;

        // Recursively sort the left half
        mergesort(arr, start, mid);

        // Recursively sort the right half
        mergesort(arr, mid + 1, end);

        // Merge the two sorted halves
        merge(arr, start, mid, end);
    }

    // Function to merge two sorted subarrays
    public static void merge(int[] arr, int start, int mid, int end) {
        int temp[] = new int[end - start + 1]; // Temporary array to store merged result
        int i = start;     // Pointer for left subarray
        int j = mid + 1;   // Pointer for right subarray
        int k = 0;         // Pointer for temp array

        // Merge elements from both subarrays in sorted order
        while(i <= mid && j <= end){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements from the left subarray
        while(i <= mid){
            temp[k++] = arr[i++];
        }

        // Copy any remaining elements from the right subarray
        while(j <= end){
            temp[k++] = arr[j++];
        }

        // Copy the merged elements back to the original array
        for(k = 0, i = start; k < temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }

    public static void main(String args[]){
        int[] arr = {6, 3, 9, 5, 2, 8}; // Example array
        mergesort(arr, 0, arr.length - 1); // Sort the array using merge sort

        printArray(arr); // Print the sorted array
    }
}