package ExceptionHandeling;

import java.util.Scanner;

public class ExceptionOverview {
//Quotient and remainder
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//user input the Integer 
		System.out.println("Enter two Integers");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		
		System.out.println(number1 + "/" + number2 + "is" + (number1/number2));
		
		
		sc.close();

	}

}
