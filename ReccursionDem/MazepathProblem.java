package ReccursionDem;

public class MazepathProblem {
    
    static void mazeOptions(int row , int col , int endRow, int endCol, String result){
        
        //Base Case
        if(row == endRow && col == endCol)
        {
            System.out.println(result);
            return;
        }
        
        
        //moving to right 
        mazeOptions(row,col+1,endRow,endCol,result + "H");
        

        //moving to down
        mazeOptions(row+1,col,endRow,endCol,result+ "V");
    }

    public static void main(String[] args) {
       // mazeOptions
    }

}
