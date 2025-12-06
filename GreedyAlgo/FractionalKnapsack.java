package GreedyAlgo;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {

    // ============================================================================
    // METHOD: fractionalKnapsack
    // PURPOSE: Finds the maximum value of items we can fit in a knapsack of 
    //          capacity W, allowing us to take fractional parts of items
    // 
    // PARAMETERS:
    //   W = Maximum weight the knapsack can hold
    //   weight = Array containing weights of each item
    //   val = Array containing values of each item
    // ============================================================================
    public static int fractionalKnapsack(int W, int[] weight, int[] val) {
        
        // Step 1: Create a 2D array to store value-to-weight ratios
        // We need this ratio to determine which items are most valuable per unit weight
        // Format: [[item_index, val/weight_ratio], ...]
        double ratio [][] = new double [val.length][2];
        
        // 0th column stores the original index of the item (so we can track it)
        // 1st column stores the value-to-weight ratio (higher ratio = more value per weight)
        
        // Step 2: Calculate value-to-weight ratio for each item
        for(int i=0; i<val.length; i++){
            // Store the original item index in column 0
            ratio[i][0] = i;
            
            // Calculate and store the ratio (value divided by weight)
            // We cast weight to double to ensure we get decimal division
            // Example: if value=60 and weight=10, ratio = 6.0
            ratio[i][1] = val[i] / (double)weight[i];
        }

        // Step 3: Sort items by their value-to-weight ratio in ASCENDING order
        // This sorts from lowest ratio to highest ratio
        // We use a Comparator to compare the 2nd column (index 1) which has the ratios
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        // Step 4: Initialize variables to track knapsack filling
        int capacity = W;      // Remaining capacity of the knapsack (starts at max)
        int finalVal = 0;      // Total value accumulated (starts at 0)

        // Step 5: Greedily pick items starting from HIGHEST ratio (end of sorted array)
        // We traverse from right to left (ratio.length-1 to 0) because after sorting,
        // the highest ratios are at the end of the array
        for(int i = ratio.length-1; i >= 0; i--){
            // Get the original index of the current item we're considering
            int index = (int)ratio[i][0];
            
            // Check if the entire item fits in remaining capacity
            if(capacity >= weight[index]){
                // YES: Add the entire item's value to our total
                finalVal += val[index];
                
                // Reduce remaining capacity by this item's weight
                capacity -= weight[index];
            }
            else{
                // NO: The item doesn't fully fit, but we can take a fraction
                // Calculate how much value we get from the fractional part:
                // ratio[i][1] is value per unit weight
                // capacity is remaining space
                // So: (value per unit) * (remaining space) = fractional value
                finalVal += ratio[i][1] * capacity;
                
                // Knapsack is now completely full
                capacity = 0;
                
                // Exit loop since knapsack is full
                break;
            }
        }

        // Step 6: Return the maximum value we could fit in the knapsack
        return finalVal;
    }

    public static void main(String[] args) {
        // Example test case
        int [] val = {60, 100, 120};      // Values of 3 items
        int weight[] = {10, 20, 30};      // Weights of 3 items
        int W = 50;                        // Maximum capacity of knapsack
        
        // Solve the fractional knapsack problem
        int maxVal = fractionalKnapsack(W, weight, val);
        
        // Print the result
        System.out.println("Maximum value in Knapsack = " + maxVal);
    }
}

/*
================================================================================
                              DRY RUN WALKTHROUGH
================================================================================

GIVEN:
  val = {60, 100, 120}
  weight = {10, 20, 30}
  W = 50 (knapsack capacity)

STEP 1: Create ratios for each item
  Item 0: ratio = 60/10 = 6.0   → ratio[0] = [0, 6.0]
  Item 1: ratio = 100/20 = 5.0  → ratio[1] = [1, 5.0]
  Item 2: ratio = 120/30 = 4.0  → ratio[2] = [2, 4.0]

STEP 2: After sorting in ascending order:
  ratio = [[2, 4.0], [1, 5.0], [0, 6.0]]
           (lowest)             (highest)

STEP 3: Greedily pick items from highest ratio (right to left)
  
  Iteration 1 (i = 2): 
    - index = 0 (original index from ratio[2][0])
    - weight[0] = 10, val[0] = 60
    - Check: capacity (50) >= weight[0] (10)? YES
    - Take full item 0: finalVal = 0 + 60 = 60
    - capacity = 50 - 10 = 40
  
  Iteration 2 (i = 1):
    - index = 1 (original index from ratio[1][0])
    - weight[1] = 20, val[1] = 100
    - Check: capacity (40) >= weight[1] (20)? YES
    - Take full item 1: finalVal = 60 + 100 = 160
    - capacity = 40 - 20 = 20
  
  Iteration 3 (i = 0):
    - index = 2 (original index from ratio[0][0])
    - weight[2] = 30, val[2] = 120
    - Check: capacity (20) >= weight[2] (30)? NO
    - Take fractional part of item 2
    - ratio[0][1] = 4.0 (value per unit weight)
    - finalVal = 160 + (4.0 × 20) = 160 + 80 = 240
    - capacity = 0
    - BREAK (knapsack is full)

FINAL ANSWER: Maximum value = 240

BREAKDOWN OF WHAT WAS PACKED:
  ✓ Item 0 (value=60, weight=10)    - FULLY taken
  ✓ Item 1 (value=100, weight=20)   - FULLY taken
  ✓ Item 2 (value=120, weight=30)   - 2/3 of it taken (weight=20, value=80)
  
  Total weight used: 10 + 20 + 20 = 50 ✓ (exactly fills capacity)
  Total value: 60 + 100 + 80 = 240

================================================================================
*/










