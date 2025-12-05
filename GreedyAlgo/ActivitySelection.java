package GreedyAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {

    // Global list to store selected activities
    static ArrayList<Integer> ans = new ArrayList<>();


    // ---------------------------------------------
    // CASE 1: When start[] and end[] are NOT sorted
    // ---------------------------------------------
    public static int sortByEnd(int[] start, int[] end) {

        int n = start.length;

        // Create activity list: each activity = {start, end, index}
        // index helps us print original activity number
        int activities[][] = new int[n][3];

        for (int i = 0; i < n; i++) {
            activities[i][0] = start[i]; // start time
            activities[i][1] = end[i];   // end time
            activities[i][2] = i;        // original index
        }

        // Sort all activities based on END time (greedy strategy)
        Arrays.sort(activities, Comparator.comparingInt(a -> a[1]));

        // Reset previous answers
        ans.clear();

        // First activity is always selected after sorting
        int maxAct = 1;
        ans.add(activities[0][2]); // store activity index

        int lastEnd = activities[0][1];  // end time of selected activity

        // Check remaining activities
        for (int i = 1; i < n; i++) {

            // Select activity if current start >= last selected end
            if (activities[i][0] >= lastEnd) {
                maxAct++;
                ans.add(activities[i][2]);
                lastEnd = activities[i][1]; // update lastEnd
            }
        }

        return maxAct;
    }


    // Print for unsorted input case
    public static void printByEnd() {
        System.out.print("Selected Activities (Unsorted Input): ");
        for (int i : ans) {
            System.out.print("A" + i + " ");
        }
        System.out.println();
    }



    // ---------------------------------------------------------
    // CASE 2: When the end[] array is ALREADY sorted by default
    // ---------------------------------------------------------
    public static int getMaxActivities(int[] start, int[] end) {

        ans.clear(); // Clear old result

        // First activity is always selected because end time is sorted
        int maxAct = 1;
        ans.add(0); // activity 0 is selected

        int lastEnd = end[0]; // end time of first selected activity

        // Check remaining activities
        for (int i = 1; i < start.length; i++) {

            // Greedy condition
            if (start[i] >= lastEnd) {
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }
        return maxAct;
    }


    // Print for sorted-by-end case
    public static void printMaxActivities() {
        System.out.print("Selected Activities (Sorted by End): ");
        for (int i : ans) {
            System.out.print("A" + i + " ");
        }
        System.out.println();
    }



    // MAIN FUNCTION
    public static void main(String[] args) {

        int start[] = {1, 3, 0, 5, 8, 5};
        int end[]   = {2, 4, 6, 7, 9, 9};

        // Case 2: Already sorted by end
        System.out.println("---- Case 1: Already Sorted by End ----");
        int max1 = getMaxActivities(start, end);
        System.out.println("Max activities: " + max1);
        printMaxActivities();


        // Case 1: NOT sorted
        System.out.println("\n---- Case 2: Unsorted Input ----");
        int max2 = sortByEnd(start, end);
        System.out.println("Max activities: " + max2);
        printByEnd();
    }
}
