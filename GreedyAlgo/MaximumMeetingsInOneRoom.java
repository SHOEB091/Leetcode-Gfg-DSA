package GreedyAlgo;

/*
=============================================================
QUESTION: Maximum Meetings in One Room (GFG) — Greedy

You are given N meetings with arrays:
S[i] = start time of meeting i
F[i] = finish time of meeting i

You must select the maximum number of meetings such that:
- A meeting can be chosen only if its start time is strictly 
  greater than the finish time of the previously chosen meeting.
- If two meetings have the same available slot, 
  choose the one that finishes earlier.

Return the list of selected meeting numbers (1-based indexing).

Example:
Input:
N = 6
S = {1,3,0,5,8,5}
F = {2,4,6,7,9,9}

Output:
{1,2,4,5}
=============================================================
*/

import java.util.*;

public class MaximumMeetingsInOneRoom {

    public static ArrayList<Integer> maxMeetings(int N, int[] S, int[] F) {

        // ---------------------------------------------------------
        // STEP 1: Create a 2D array to store meetings:
        // meetings[i] = {start, finish, meetingNumber}
        // ---------------------------------------------------------
        int[][] meetings = new int[N][3];

        for (int i = 0; i < N; i++) {
            meetings[i][0] = S[i];      // start time
            meetings[i][1] = F[i];      // finish time
            meetings[i][2] = i + 1;     // meeting number (1-based)
        }

        // ---------------------------------------------------------
        // STEP 2: Sort meetings by finishing time (ascending)
        // Greedy rule: pick meeting that ends first
        // ---------------------------------------------------------
        Arrays.sort(meetings, Comparator.comparingInt(a -> a[1]));

        // ---------------------------------------------------------
        // STEP 3: Choose the first meeting (after sort)
        // ---------------------------------------------------------
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(meetings[0][2]);        // store meeting number

        int lastEnd = meetings[0][1];   // finish time of selected meeting

        // ---------------------------------------------------------
        // STEP 4: Check remaining meetings
        // Select if start time > last selected end time
        // ---------------------------------------------------------
        for (int i = 1; i < N; i++) {

            // Condition: start time strictly greater than last end time
            if (meetings[i][0] > lastEnd) {

                ans.add(meetings[i][2]);    // add meeting number

                lastEnd = meetings[i][1];   // update lastEnd (IMPORTANT!)
            }
        }

        Collections.sort(ans);  // Sort meeting numbers in ascending order

        // ---------------------------------------------------------
        // Return selected meeting numbers
        // ---------------------------------------------------------
        return ans;
    }
}

