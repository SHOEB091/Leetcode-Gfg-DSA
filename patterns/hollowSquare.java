package patterns;

public class hollowSquare {
    
    public static void main(String[] args) {
        int num =5;
        for(int row=1;row<=num;row++)
        {
            for(int col =1;col<=num;col++)
            {
                if(row==1 || row==5 || col==1 || col==num)
                {
                    System.out.print("* ");
                }
                else{
                    System.err.print("  ");
                }
            }
            System.out.println();
        }
    }

}
