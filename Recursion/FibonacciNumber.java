package Recursion;

public class FibonacciNumber {

    static int fibonacci(int num)
    {
        //base case
        if(num<=1)
        {
            return num;
        }
        int firstTerm = fibonacci(num-1);
        int secondTerm = fibonacci(num-1);
        return firstTerm+secondTerm;
    }

    public static void main(String[] args) {
        int result = fibonacci(3);
        System.out.println(result);
    }

}
