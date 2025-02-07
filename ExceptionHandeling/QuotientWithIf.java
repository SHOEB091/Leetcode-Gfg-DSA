package ExceptionHandeling;

import java.util.Scanner;

public class QuotientWithIf {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two integers: ");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		
		if(number2 !=0)
		{
			System.out.println(number1 + "/" + number2 + "is" +(number1/number2));
			
		}
		else
		{
			System.out.println("Divisor cnnot be zero");
		}
		
		
		
		
		
		sc.close();
		

	}

}
