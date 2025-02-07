package basics;
public class OddNumberTraianglePattern {
    
    public static void main(String [] args)
    {
        int range =5;
        for(int row=0;row<range;row++)
        {   
            //printng space 
            for(int space =1;space<=range-row;space ++)
            {
                System.out.print(" ");
            }

            int odd= 2*row+1;

            //printing star 
            for(int star=1;star<=odd;star++)
            {
               
                    System.out.print("*");
               
            }
            System.out.println();
        }
    }

}
//codeforwin