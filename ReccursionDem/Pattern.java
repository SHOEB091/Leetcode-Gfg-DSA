package ReccursionDem;


public class Pattern{

    static void PrintStar(int numberOfStars)
    {
        //base case 
        if(numberOfStars==0)
        {
            return;
        }
        System.out.print("*");
        PrintStar(numberOfStars-1);
    }

    static void PrintLine(int numberOfLines)
    {

        if(numberOfLines==0)
        {
            return;
        }
        PrintLine(numberOfLines-1);
        PrintStar(numberOfLines);
        System.out.println();

     }

    public static void main(String[] args) {
        
        PrintLine(5);

    }

}