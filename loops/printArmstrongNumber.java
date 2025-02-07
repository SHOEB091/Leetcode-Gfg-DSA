package loops;

public class printArmstrongNumber {

    public static void main(String[] args) {
        int maxNumber = 371; // Change this value to set the range

        System.out.println("Armstrong numbers up to " + maxNumber + ":");
        for (int number = 1; number <= maxNumber; number++) {
            if (isArmstrong(number)) {
                System.out.println(number);
            }
        }
    }

    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int pow = 0;

        // Find the number of digits (power)
        while (number > 0) {
            number = number / 10;
            pow++;
        }

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
        return sum == originalNumber;
    }
}