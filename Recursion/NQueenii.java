package Recursion;

public class NQueenii {


    //chess board
    boolean[][] board;
    public int totalNQueens(int n) {
        board = new boolean[n][n];
        return helper(0, n);
    }

    boolean willIplaceAqueen(int row , int col){
        //1 Above Row
        for(int i = row ;i>=0;i--){
            if(board[i][col]){
                return false;//can't place queen , move to the next column
            }
        }
        //2 left diagonal
        for(int i= row, j=col; i>=0 && j>=0;i--,j--){
            if(board[i][j]){
                return false;//can't place queen move to next column
            }
        }

        //3 Existing queen on right diagonal
        for(int i=row, j=col; i>=0 && j<board[0].length; i--,j++){
            if(board[i][j]){
                return false;
            }
        }

        return true; //i can place queen
    }

    int helper (int row , int n ){
        //base case
        if(row == n){
            return 1;
        }
        int count =0;
        //try to place queen on column
        for(int col=0;col<n;col++){
            if(willIplaceAqueen(row,col)){
                board[row][col] = true; //place a queen and move to next row and col number 0;
                count = count + helper(row+1,n);

                //stack fall case (Backtrack)
                board[row][col]=false;//undo
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Create an instance of your class
        NQueenii instance = new NQueenii();

        // Call the totalNQueens method with n = 4 (or any other value you want)
        int result = instance.totalNQueens(4);

        // Print the results
        System.out.println("Total ways to place 4 queens: " + result);
    }

}
