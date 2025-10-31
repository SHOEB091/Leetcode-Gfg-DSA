package Pattern;

import java.util.Scanner;

public class RightHalfStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for one half (e.g., 5): ");
        int n = sc.nextInt();
        sc.close();

        System.out.println("Printing the Hollow Diamond Pattern:");

        // Upper half of the diamond
        for (int i = 1; i <= n; i++) {
            // Print characters for the left side
          
            // Print spaces in the middle to make it hollow
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            // Print characters for the right side, unless it's the first row
            // if (i > 1) {
            //     System.out.print("*");
            // }
            System.out.println(); // Move to the next line
        }

        // Lower half of the diamond (the inverted triangle)
        // Starts with one less row to avoid repeating the middle line
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
    }
}
