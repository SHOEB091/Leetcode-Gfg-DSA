package loops;

public class ArmstrongNumber {

    public static void main(String[] args) {
        int number = 371;
        int originalNumber = number;
        int pow = 0;

        // Find the number of digits (power)
        while (number > 0) {
            number = number / 10;
            pow++;
        }

        System.out.println("Number of digits (power): " + pow);

        // Reset the number to the original value
        number = originalNumber;

        // Calculate the Armstrong number
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, pow);
            number = number / 10;
        }

        // Check if the original number is an Armstrong number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}