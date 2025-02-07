package IfElseLadder;

import java.util.Scanner;

public class checkCharacterAlphabet {
    public static void main(String[] args) {
        char ch;

        // Input character from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character:");
        ch = scanner.next().charAt(0);

        // Alphabet check
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("Character is Alphabet");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("Character is Digit");
        } else {
            System.out.println("Character is Special Character");
        }

        scanner.close();
    }
}
