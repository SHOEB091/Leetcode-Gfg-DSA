package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    /*
     Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
     Output: [[1,6],[8,10],[15,18]]
     Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
     */

    // Ask interviewer that the interval is sorted or not 
    //BRUTE FORCE APPROACH 
    // step 1 sort the array 
    // create a new data structure 

    //e.g (1,3) (2,4)
    // first element is before the  last element 
    public int[][] merge(int[][] intervals) {
        // Step 1: Sort the intervals by the start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // Step 2: Use a list to store merged intervals
        List<int[]> merged = new ArrayList<>();

        // Step 3: Iterate through the sorted intervals
        for (int[] interval : intervals) {
            // If merged list is empty OR no overlap, add interval
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                merged.add(interval);
            } else {
                // If there is an overlap, merge intervals
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }
        }

        // Convert list to array and return
        return merged.toArray(new int[merged.size()][]);
    }


}
