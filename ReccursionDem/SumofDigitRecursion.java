package ReccursionDem;

//Small problem me divide karo 
//jo ak bar chalna hai woh base case me dalna hai 
//jo bar bar chalana hai woh recursion me dalna hai 
public class SumofDigitRecursion {

    static int sumOfDigits(int num)
    {
        if(num==0)
        {
            return 0;
        }
        int sum = sumOfDigits(num/10);
        sum = sum+num %10;
        return sum;
    }


    static void sumOfDigit(int num,int sum)
    {
        
        if(num==0)
        {
            System.out.println("Sum " + sum);
            return;
        }
        int digit = num%10;
        sum = sum +digit;
        sumOfDigit(num/10,sum);

    }

    public static void main(String[] args) {
        //sumOfDigit(123, 0);

        System.out.println(sumOfDigits(123));
    }

}
