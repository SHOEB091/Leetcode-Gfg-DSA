package Arrays;

public class SetMatrixZeroes {

    // BRUTE FORCE APPROACH
    public static void setZeroes(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        // First pass: mark the rows and columns that need to be set to zero
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    markRow(arr, i, m);
                    markCol(arr, j, n);
                }
            }
        }

        // Second pass: set the marked rows and columns to zero
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == -1) {
                    arr[i][j] = 0;
                }
            }
        }
    }

    public static void markRow(int[][] arr, int i, int m) {
        for (int j = 0; j < m; j++) {
            if (arr[i][j] != 0) {
                arr[i][j] = -1;
            }
        }
    }

    public static void markCol(int[][] arr, int j, int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i][j] != 0) {
                arr[i][j] = -1;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 0, 6},
            {7, 8, 9}
        };

        setZeroes(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Better Approach
    /*
         int n = matrix.length; // Number of rows
        int m = matrix[0].length; // Number of columns

        // Arrays to mark the rows and columns that need to be set to zero
        int[] row = new int[n];
        int[] col = new int[m];

        // First pass: mark the rows and columns that need to be set to zero
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        // Second pass: set the marked rows and columns to zero
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }

     */
    public void setZeroes1(int[][] matrix) {
        int n = matrix.length; // Number of rows
        int m = matrix[0].length; // Number of columns

        // Arrays to mark the rows and columns that need to be set to zero
        int[] row = new int[n];
        int[] col = new int[m];

        // First pass: mark the rows and columns that need to be set to zero
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        // Second pass: set the marked rows and columns to zero
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
}

     //OPTIMAL APPROACH 

     /*
        int col0 =0;
        int col[m] ={0} -> matrix[0][..]  
        int row[n] ={0} -> matrix[0][..] 
        
        int col = 1;
        for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(matrix[i][j]==0){
                //mark the  i-th row
                matrix[i][0] =0;

                //mark the j-th col
                if(j!=0){
                    matrix[0][j]=0;
                }
                else{
                    col0 = 0;
                }    

            }
        }
         }

         for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matix[i][j] !=0){
                    //check for col & row 
    
                    if(matix[0][j]==0 || matrix[i][0]==0){
                        matrix[i][j]=0;
                    }   
                    
                }
            }
         }

         if(matrix[0][0]==0){
            for(int j=0;j<m;j++){
                matrix[0][j]=0;
            }
         }
         if(col0==0){
            for(in ti=0;i<n;i++){
                matrix[i][0] =0;
            }
         }   
    
      */
      public void setZeroes2(int[][] matrix) {
        int col0 = 1; // Initialize col0 as 1 to handle the first column separately
        int n = matrix.length;
        int m = matrix[0].length; // Assume matrix is non-empty and rectangular
        
        // Step 1: Identify zero locations and mark the first row and first column
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    // Mark the i-th row
                    matrix[i][0] = 0;
        
                    // Mark the j-th column
                    if (j != 0) {
                        matrix[0][j] = 0;
                    } else {
                        col0 = 0; // Indicate that the first column should be set to zero
                    }
                }
            }
        }
        
        // Step 2: Use the markers to set appropriate elements to zero
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        
        // Step 3: Update the first row if necessary
        if (matrix[0][0] == 0) {
            for (int j = 0; j < m; j++) {
                matrix[0][j] = 0;
            }
        }
        
        // Step 4: Update the first column if necessary
        if (col0 == 0) {
            for (int i = 0; i < n; i++) {
                matrix[i][0] = 0;
            }
        }
        
      }

}