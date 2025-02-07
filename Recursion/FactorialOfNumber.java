package Recursion;

public class FactorialOfNumber {

    static int factorial2(int num)
    {

        if(num==0)
        {
            return 1;//returning 0 will be multiplied while backtrack then while become 0;
        }
        return num*factorial2(num-1);
    }

    //parameterised
    static void factorial(int num , int fact)
    {
        //base case
        if(num==0)
        {
            System.out.println(fact);
            return;
        }
        //System.out.println(fact);
        factorial(num-1,fact*num);
    }

    public static void main(String[] args) {
        factorial(5,1);
        System.out.println(factorial2(6));
    }

}
