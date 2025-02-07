package Recursion;

public class PowerOfNumber {

    static int computePower(int num,int pow)
    {
        if(pow==1)
        {
            return num;
        }
        int result =computePower(num,pow-1) ;
        return result * num;

    }
    static void computePower(int num , int pow, int result)
    {
        //Base Case
        if(pow==0)
        {
            System.out.println(result);
            return ;
        }

        //small problem
        computePower(num, pow-1,num*result);

    }

    public static void main(String[] args) {
        computePower(2,5,1);
        System.out.println(computePower(2,4));
    }

}
