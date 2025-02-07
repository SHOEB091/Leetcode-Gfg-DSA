package IfElseLadder;

import java.util.Scanner;

public class CalculateElectricitybil {
    
    public static void main(String[] args) {
        int unit;
        float amt, totalAmt, surCharge;

        // Input unit consumed from user
        Scanner scanner = new Scanner(System.in);
        //System.out.print("Enter total units consumed: ");
        unit = scanner.nextInt();

        // Calculate electricity bill according to given conditions
        if (unit <= 50) {
            amt = unit * 0.50f;
        } else if (unit <= 150) {
            amt = 25 + ((unit - 50) * 0.75f);
        } else if (unit <= 250) {
            amt = 100 + ((unit - 150) * 1.20f);
        } else {
            amt = 220 + ((unit - 250) * 1.50f);
        }

        // Calculate total electricity bill after adding surcharge
        surCharge = amt * 0.20f;
        totalAmt = amt + surCharge;

        // Print the electricity bill
        System.out.printf("Electricity Bill = Rs. %.2f\n", totalAmt);

        // Close scanner resource
        scanner.close();
    }

}
