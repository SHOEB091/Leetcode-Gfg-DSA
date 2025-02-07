package loops;

public class ReverseNumber {

    public static int reverseNumber(int number) {
        int reverse = 0;
        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        int number = 371;
        int reversedNumber = reverseNumber(number);
        System.out.println("Reversed Number: " + reversedNumber); // Should print 173
    }
}