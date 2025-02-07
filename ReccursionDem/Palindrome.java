package ReccursionDem;



public class Palindrome {
    static boolean palindrome2(int org,int reverse,int num)
    {
        int count =0;
        //base case 
        if(num==0)
        {

            return reverse==org;
           
        }
        int digit =num%10;
        reverse=reverse*10+digit;
        
        
        return palindrome2(org,reverse,num/10);
    }
    static void palindrome(int org,int reverse,int num)
    {
        int count =0;
        //base case 
        if(num==0)
        {

            if(org==reverse)
            {
                System.out.println("Palindrome");
                System.out.println(reverse);
                
            }
            else{
                System.out.println("not a palindrime;");
            }
            return;
        }
        int digit =num%10;
        reverse=reverse*10+digit;
        
        
        palindrome(org,reverse,num/10);
    }

    public static void main(String[] args) {
        int num =151;
        boolean result=palindrome2(num, 0, num);
        System.out.println(result);
    }
}
