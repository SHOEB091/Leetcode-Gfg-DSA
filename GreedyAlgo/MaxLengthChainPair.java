package GreedyAlgo;

import java.util.*;

public class MaxLengthChainPair {

    public static int maxLengthChainPair(int[][] pairs) {
        // Step 1: Sort pairs based on the second element (end of pair)
        Arrays.sort(pairs, Comparator.comparingInt(o -> o[1]));

        // Step 2: Initialize variables to track the chain
        int count = 1; // At least one pair can always be selected
        int lastEnd = pairs[0][1]; // End of the first selected pair

        // Step 3: Iterate through the sorted pairs to build the chain
        for (int i = 1; i < pairs.length; i++) {
            // If the start of the current pair is greater than the end of the last selected pair
            if (pairs[i][0] > lastEnd) {
                count++; // We can include this pair in our chain
                lastEnd = pairs[i][1]; // Update lastEnd to the end of the current pair
            }
        }

        return count; // Return the maximum length of the chain
    }

    public static void main(String[] args) {
        int pairs[][]={{5,24}, {15,25}, {27,40}, {50,90}};
        
        System.out.println("Maximum Length of Chain Pair: " + maxLengthChainPair(pairs));

    }
}
