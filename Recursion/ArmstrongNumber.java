package Recursion;

public class ArmstrongNumber {

    //Digit count
    static int DigitCount(int num )
    {
        //base case
        if(num ==0)
        {
            return 0;
        }

       int count = DigitCount(num/10);
       return count+1;
    }
    static void ArNumber(int num ,int sum,int cpy,int count)
    {
        //base case
        if(num==0)
        {
            if(sum==cpy)
            {
                System.out.println("Armstrong NUmber");
            }
            else {
                System.out.println("Not an Armstrong Number: ");
            }
            return;
        }

        int digit = num%10;
       int result= (int)Math.pow(digit,count);
       sum = sum+result;

       ArNumber(num/10,sum,cpy,count);
    }
    public static void main(String[] args) {

        int num = 153;
        int count = DigitCount(num);
        ArNumber(num,0,num,count);


    }

}
