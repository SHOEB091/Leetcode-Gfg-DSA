package basics;
public class TrianglePattern {
    
    public static void main(String [] args)
    {
        int range =6;
        for(int row=1;row<=range;row++)
        {   
            //printng space 
            for(int space =1;space<=range-row;space ++)
            {
                System.out.print(" ");
            }

            //printing star 
            for(int star=1;star<=row;star++)
            {
               
                    System.out.print("* ");// just give space 
               
            }
            System.out.println();
        }
    }

}
