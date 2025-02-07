package loops;

public class palindromeNumber {


    public static int reverseNumber(int number){
        int reverse=0;
        while(number>0){
             int digit = number %10;
             reverse = reverse*10+digit;
             number = number/10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        int number = 121;
        if(number==reverseNumber(number)){
            System.out.println("palindromeNumber");
        }
        else{
            System.out.println("not a palindrome");
        }
    }



}
