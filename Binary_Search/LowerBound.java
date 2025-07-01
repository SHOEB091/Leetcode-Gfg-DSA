package Binary_Search;

public class LowerBound {
    
    /**
     * Linear search approach to find lower bound
     * Lower bound: The smallest index i such that arr[i] >= x
     * Time Complexity: O(n)
     */
    public static int lowerBound(int []arr, int n, int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] >= x) {
                // lower bound found:
                return i;
            }
        }
        return n; // x is greater than all elements in array
    }

    /**
     * Binary search to find if an element exists in a sorted array
     * Time Complexity: O(log n)
     */
    public static boolean binarysearch(int [] arr ,int k){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){ // Changed to <= to include when start equals end
            int mid = start+(end-start)/2;
            if(arr[mid]==k){
                return true; // Found the element
            }
            else if(arr[mid]>k){
                end = mid-1; // Search in left half
            }
            else{
                start= mid+1; // Search in right half
            }
        }
        return false; // Element not found
    }

    /**
     * Binary search approach to find lower bound
     * Lower bound: The smallest index i such that arr[i] >= x
     * Time Complexity: O(log n)
     */
    public static int lowerboundbinarysearch(int []arr, int x){
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int ans = n; // Default answer if no lower bound exists
        
        while(start <= end){
            int mid = start + (end - start) / 2;
            
            // If current element is >= x, it's a potential answer
            if(arr[mid] >= x){
                ans = mid; // Update the answer
                end = mid - 1; // Look for a better answer in left half
            }
            else{
                start = mid + 1; // Look in the right half
            }
        }
        
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 15, 19};
        int x1 = 8; // Element present
        int x2 = 10; // Element not present
        
        // Using linear search
        System.out.println("Linear Search:");
        System.out.println("Lower bound of " + x1 + " is at index: " + lowerBound(arr, arr.length, x1));
        System.out.println("Lower bound of " + x2 + " is at index: " + lowerBound(arr, arr.length, x2));
        
        // Using binary search
        System.out.println("\nBinary Search:");
        System.out.println("Lower bound of " + x1 + " is at index: " + lowerboundbinarysearch(arr, x1));
        System.out.println("Lower bound of " + x2 + " is at index: " + lowerboundbinarysearch(arr, x2));
    }
}
