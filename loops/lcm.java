package loops;

import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        int i, num1, num2, max, lcm = 1;

        // Input two numbers from user
        Scanner scanner = new Scanner(System.in);
       // System.out.println("Enter any two numbers to find LCM:");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        // Find maximum between num1 and num2
        if (num1 > num2) {
            max = num1;
        } else {
            max = num2;
        }

        // First multiple to be checked
        i = max;

        // Run loop indefinitely till LCM is found
        while (true) {
            if (i % num1 == 0 && i % num2 == 0) {
                // If 'i' divides both num1 and num2, then 'i' is the LCM
                lcm = i;

                // Terminate the loop after LCM is found
                break;
            }

            // If LCM is not found, then generate next multiple of 'max'
            i += max;
        }

        // Print LCM
        System.out.println("Lcm = " + lcm);

        // Close the scanner
        scanner.close();
    }
}

