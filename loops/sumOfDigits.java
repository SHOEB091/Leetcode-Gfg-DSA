package loops;

public class sumOfDigits {

    public static void main(String[] args) {
        int num=8765;
        int evenPos=0;
        int oddPos=0;
        int pos=0;
        while(num<0)
        {
            int digit = num%10;
            pos++;
            if(pos%2==0)
            {
                evenPos+=digit;
            }
            else{
                oddPos+=digit;
            }
             num =num /10;
        }
        System.out.println("Odd Sum " + oddPos);
        System.out.println("Even Posisiton Sum " + evenPos);
    
    }
    
}
