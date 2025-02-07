package Recursion;

public class FactotialNumber {

    static int fact(int num)
    {
        if(num ==1)
        {
            return 1;
        }
       return num * fact(num-1);
    }
    static void factorial(int num ,int result)
    {
        //base case
        if(num ==1)
        {
            System.out.println(result);
            return;
        }

        //small problem
        factorial(num-1,num*result);
    }


    public static void main(String[] args) {
    factorial(5,1);

        System.out.println(fact(6));
    }

}
