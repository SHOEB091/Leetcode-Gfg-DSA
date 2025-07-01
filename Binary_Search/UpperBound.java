package Binary_Search;

public class UpperBound {
    /**
     * Upper bound: Finds the smallest index i where arr[i] > x
     * Time complexity: O(log n)
     */
    public static int upperBound(int arr[], int x) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int ans = n; // Default if no upper bound exists
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            // If current element is > x, it's a potential answer
            if (arr[mid] > x) {
                ans = mid; // Update answer
                end = mid - 1; // Look for a better (smaller) index in the left half
            } else {
                // If current element is <= x, look in the right half
                start = mid + 1;
            }
        }
        
        return ans;
    }
    
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 15, 19};
        int x1 = 8;  // Element present
        int x2 = 10; // Element not present
        
        System.out.println("Upper bound of " + x1 + " is at index: " + upperBound(arr, x1)); 
        System.out.println("Upper bound of " + x2 + " is at index: " + upperBound(arr, x2));
    }
}
