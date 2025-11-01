package basicMaths;

public class CountDigit {

    public static int numberOfDigits(int number){
        int count =0;
        while(number>0){
            count++;
            number= number/10;
        }

        return count;
    }
    public static void main(String[] args) {
        int number = 12345;
        System.out.println("The number of digits are " + numberOfDigits(number));
    }

}
