package loops;

import java.util.Scanner;

public class hcf {
    public static void main(String[] args) {
        int i, num1, num2, min, hcf = 1;

        // Input two numbers from user
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter any two numbers to find HCF:");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        // Find minimum between num1 and num2
        if (num1 < num2) {
            min = num1;
        } else {
            min = num2;
        }

        // Find the HCF by checking for common divisors
        for (i = 1; i <= min; i++) {
            // If 'i' is a divisor of both num1 and num2, it could be the HCF
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i; // Update HCF
            }
        }

        // Print HCF
        System.out.println("HCF is " + hcf);

        // Close the scanner
        scanner.close();
    }
}
