package basics;
public class StrongNumber {
    public static void main(String[] args) {
        
        int num =145;
        int cpy = num;
        int sum =0;
        while(cpy!=0)
        {
            int digit = cpy%10;
            int factorial=fact(digit);
            sum = sum +factorial;
            cpy /= 10;
        }   
        if(sum == num )
        {
            System.out.println("BOth are Equla: ");
        }

    }
    static int fact(int digit)
    {
        int result =1;
        while(digit>1)
        {
            result = result * digit;
            digit --;
        }

        return result;
    }
}
