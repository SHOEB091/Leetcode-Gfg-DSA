package Binary_Search;

public class Floor {

    public static void main(String[] args)
    {
        int []arr={2,3,5,9,14,16,18};
        int ans=floor(arr,7);
        if(ans != -1) {
            System.out.println("The floor index is " + ans + ", value: " + arr[ans]);
        } else {
            System.out.println("No floor exists for the target in the array.");
        }
    }

    /**
     * Finds the floor of a target value in a sorted array.
     * Floor: The largest element in the array less than or equal to the target.
     * If the target is smaller than all elements, returns -1.
     * If the target is present, returns its index.
     * Otherwise, returns the index of the largest element less than the target.
     * Time Complexity: O(log n)
     */
    public static int floor(int []arr,int target)
    {
        int start=0;
        int end = arr.length-1;

        // If target is greater than the largest element, no floor exists
        if(target < arr[0]) {
            return -1;
        }
        while(start<=end)
        {
            int mid = start+(end-start)/2;

            // If target is less than mid, search left half
            if(target<arr[mid])
            {
                end= mid-1;
            }
            // If target is greater than mid, search right half
            else if (target>arr[mid])
            {
                start= mid+1;
            }
            // If target equals mid, return mid (exact match)
            else if (target==arr[mid])
            {
                return mid;
            }
        }
        // When loop ends, end points to the largest element less than or equal to target
        return end;
    }

}
