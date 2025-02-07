package basics;
public class ArmstrongNumber {
    public static void main(String[] args) {
        int num =153;
        int cpy = num ;
        int count =0;
        int sum = 0;

        while(cpy!=0)
        {
            count++;
            cpy= cpy/10;// make numebr smaller            
        }
        
        cpy = num ;

        while(cpy!=0)
        {
            int digit = cpy%10;
            sum = sum + (int)Math.pow(digit,count);
            cpy/=10;
        }
        System.out.println(num==sum?"Armstrong number ":"Not an Armstrong Number: ");

    }
}
