package Recursion;

public class PalindromeNumber {

    static boolean palindromeNumber1(int num,int reverse,int cpy)
    {
        //base case
        if(num==0)
        {
            return reverse==cpy;
        }
        int digit = num%10;
        reverse = reverse * 10 + digit; // to reverse a digit

        //small problem
        return palindromeNumber1(num/10,reverse,cpy);
    }

    static void palindromeNumber(int num,int reverse,int cpy)
    {
        //base case
        if(num==0)
        {
            System.out.println(reverse==cpy?" palindrome":"not a palindrome");
            return;
        }
        int digit = num%10;
        reverse = reverse * 10 + digit; // to reverse a digit

        //small problem
        palindromeNumber(num/10,reverse,cpy);
    }

    public static void main(String[] args) {
    int num=151;
    int cpy=num;
    palindromeNumber(num,0,cpy);
        System.out.println(palindromeNumber1(num,0,cpy));
    }
}
