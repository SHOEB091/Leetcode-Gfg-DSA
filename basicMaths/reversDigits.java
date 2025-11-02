package basicMaths;

class reversDigits{

    public static void reverse(int number){
        int revNum=0;
        while(number>0){
            int lastdigit = number%10;
            revNum = revNum*10+lastdigit;
            number= number/10;
        }
        System.out.println(revNum);
    }

    public static void main (String[]args){
        int number = 12345;
        reverse(number);
    }
}