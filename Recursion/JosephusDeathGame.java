package Recursion;

public class JosephusDeathGame {

    static int josephus(int n , int k)
    {
        //bse case
        if(n==1)
        {
            return 0;
        }
        return (josephus(n-1,k)+k)%n;
    }
    public static void main(String [] args)
    {
        int k=3;
        int n =5;
        System.out.println(josephus(n,k));
    }

}
