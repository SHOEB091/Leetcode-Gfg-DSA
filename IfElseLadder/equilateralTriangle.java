package IfElseLadder;

import java.util.Scanner;

public class equilateralTriangle {
    
    public static void main(String[] args) {
        int side1, side2, side3;

        // Input sides of a triangle
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three sides of triangle:");
        side1 = scanner.nextInt();
        side2 = scanner.nextInt();
        side3 = scanner.nextInt();

        // Classify the triangle based on the sides
        if (side1 == side2 && side2 == side3) {
            System.out.println("Equilateral triangle"); // If all sides are equal
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("Isosceles triangle"); // If any two sides are equal
        } else {
            System.out.println("Scalene triangle"); // If no sides are equal
        }

        // Close scanner resource
        scanner.close();
    }

}
