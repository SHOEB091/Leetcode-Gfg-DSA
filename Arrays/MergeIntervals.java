package Arrays;

import java.util.*;
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

    public static List<List<Integer>> mergeOverlappingIntervals(int[][] arr) {
        int n = arr.length; // size of the array
        //sort the given intervals:
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) { // select an interval:
            int start = arr[i][0];
            int end = arr[i][1];

            //Skip all the merged intervals:
            if (!ans.isEmpty() && end <= ans.get(ans.size() - 1).get(1)) {
                continue;
            }

            //check the rest of the intervals:
            for (int j = i + 1; j < n; j++) {
                if (arr[j][0] <= end) {
                    end = Math.max(end, arr[j][1]);
                } else {
                    break;
                }
            }
            ans.add(Arrays.asList(start, end));
        }
        return ans;
    }


    // Optimal Approach 1
    public static List<List<Integer>> mergeOverlappingIntervals2(int[][] arr) {
        int n = arr.length; // size of the array
        //sort the given intervals:
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            // if the current interval does not
            // lie in the last interval:
            if (ans.isEmpty() || arr[i][0] > ans.get(ans.size() - 1).get(1)) {
                ans.add(Arrays.asList(arr[i][0], arr[i][1]));
            }
            // if the current interval
            // lies in the last interval:
            else {
                ans.get(ans.size() - 1).set(1,
                                            Math.max(ans.get(ans.size() - 1).get(1), arr[i][1]));
            }
        }
        return ans;
    }



    //Optimal APPROACH 2

class Solution {
   public int[][] merge(int[][] intervals) {

        // Edge case: If there's only one interval, return it as is
        if(intervals.length == 1){
            return intervals;
        }
        
        // Create a list to store the merged intervals
        List<int[]> merged = new ArrayList<>();

        // Sort the intervals based on the start value (intervals[i][0])
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // Take the first interval as the initial "current" interval
        int[] current = intervals[0];

        // Iterate through the rest of the intervals
        for(int i = 1; i < intervals.length; i++){
            // If the current interval overlaps with the next one
            if(intervals[i][0] <= current[1]){
                // Merge them by updating the end value
                current[1] = Math.max(intervals[i][1], current[1]);                
            }
            else{
                // If no overlap, store the current interval and move to the next
                merged.add(current);
                current = intervals[i];
            }
        }

        // Add the last interval to the merged list
        merged.add(current);

        // Convert the list to a 2D array and return it
        return merged.toArray(new int[merged.size()][]);
    }
}

    


}
