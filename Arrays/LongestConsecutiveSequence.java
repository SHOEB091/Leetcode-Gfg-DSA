package Arrays;

import java.util.HashSet;

public class LongestConsecutiveSequence {

    //BRUTE FORCE APPROACH
    public int longestConsecutive(int[] arr) {
        int longest = 0; // Initialize longest to 0
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            int x = arr[i];
            int count = 1;
            
            // Check for the next consecutive elements
            while (ls(arr, x + 1)) {
                x = x + 1;
                count = count + 1;
            }
            
            // Update the longest sequence length
            longest = Math.max(longest, count);
        }
        
        return longest;
    }

    // Helper function to check if a number exists in the array
    public boolean ls(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        LongestConsecutiveSequence solution = new LongestConsecutiveSequence();
        int[] arr1 = {100, 4, 200, 1, 3, 2};
        System.out.println(solution.longestConsecutive(arr1)); // Output: 4

        int[] arr2 = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println(solution.longestConsecutive(arr2)); // Output: 9
    }

    //Better  APPROACH
    //int arr[] ={100,102,100,101,101,4,3,2,3,2,1,1,1,2};
    //sort this 
    //int arr[] ={1,1,1,2,2,2,3,3,4,100,100,101,101,102};
    //lastSmallest = Integer.MIN_VALUE 
    //longest = 1;
    //Count =0 

    /*
     for(int i=0;i<n;i++){
        if(arr[i]-1==lastSmallest){
            count =count+1;
            lasrSmallest = arr[i];
        }
        else if(arr[i]!=lastSmallest){  starting new sequence 
                count =1;
                lastSmallest = arr[i];
        }
        lonsest = Math.max(longest,count);            
     }
        return longest 
     */


     /*
        OPTIMAL SOLUTION 
        
        put everything into HashSet DataStructure 
        set only stores Unique Elements so no repetition allowed
        */

        
    public int longestSuccessiveElements(int[] arr) {
        int n = arr.length;
        if (n == 0) return 0; // If array is empty, return 0
        
        int longest = 1; // Initialize the longest sequence length as 1
        HashSet<Integer> set = new HashSet<>(); // Use a HashSet to store elements

        // Insert all elements into the HashSet
        for (int num : arr) {
            set.add(num);
        }

        // Iterate through each element in the HashSet
        for (int num : set) {
            // Check if it's the start of a sequence
            if (!set.contains(num - 1)) {
                int current = num; // Start of the sequence
                int count = 1; // Count the current element

                // Check for consecutive elements
                while (set.contains(current + 1)) {
                    current = current + 1; // Move to the next element
                    count = count + 1; // Increment the count
                }

                // Update the longest sequence length
                longest = Math.max(longest, count);
            }
        }

        return longest; // Return the length of the longest sequence
    }    


}