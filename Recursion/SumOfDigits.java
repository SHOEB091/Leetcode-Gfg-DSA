package Recursion;

public class SumOfDigits {

    static int sumofDigit(int num)
    {
        if(num==0)
        {

            return 0;

        }
        int sum = sumofDigit(num/10);
        int digit=num%10;
        sum = sum + digit; // stack fall time
        return sum;
        //return num%10+ sumofDigit(num/10);

    }
    static void sumofDigit(int num ,int sum)
    {
        if(num==0)
        {
            System.out.println(sum);
            return;

        }
        sumofDigit(num/10,sum+num%10);

    }

    public static void main(String[] args) {
    sumofDigit(12345,0);
    }

}
