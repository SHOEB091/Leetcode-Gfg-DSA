package ExceptionHandeling;

import java.util.Scanner;

public class QuotientWithException {
    public static int quotient(int number1, int number2)
    {
        if(number2==0)
            throw new ArithmeticException("Divisor cannot be zero");
        return number1/number2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two integers: ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        try{
            int result = quotient(number1,number2);
            System.out.println(number1 + "/" + number2 + "is" + result);
        }
        catch(ArithmeticException ex)
        {
            System.out.println("Exception an integer " + "cannot be divided by zero ");

        }
        System.out.println("Execution continues...");

    }
}
