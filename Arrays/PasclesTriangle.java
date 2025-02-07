package Arrays;
import java.util.*;

    //Input: numRows = 5
    //Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
    //First Convert Pascles triangle in 2D Array

    /*
        vector<vector<int>> result(numRows);
        
        for(int i = 0; i<numRows; i++) {
            
            result[i] = vector<int>(i+1, 1);
            
            for(int j = 1; j < i; j++) {
                
                result[i][j] = result[i-1][j] + result[i-1][j-1];
                
            }
            
        }
        
        return result;

    */
public class PasclesTriangle {

     // Function to generate Pascal's Triangle
     public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>(); // Initialize the result list to store rows of Pascal's Triangle
        
        // Outer loop to iterate through each row
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>(i + 1); // Initialize the current row with size i+1
            
            // Inner loop to iterate through each element in the row
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1); // The first and last elements of each row are always 1
                } else {
                    // Calculate the current element as the sum of the two elements directly above it

                    //uppar wala row aur same column
                    int num = result.get(i - 1).get(j) + result.get(i - 1).get(j - 1);
                    row.add(num);
                }
            }
            result.add(row); // Add the current row to the result list
        }
        return result; // Return the generated Pascal's Triangle
    }

    public static void main(String[] args) {
        PasclesTriangle pt = new PasclesTriangle();
        List<List<Integer>> triangle = pt.generate(5);
        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }

}
