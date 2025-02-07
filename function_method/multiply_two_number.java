package function_method;

import java.util.Scanner;

public class multiply_two_number {
	
	public static int multiplyNumber(int a, int b)
	{
		int multi = a*b;
		return multi;
	}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		int a = sc.nextInt();
		
		System.out.println("Enter the first number: ");
		int b = sc.nextInt();
		
		int multi = multiplyNumber(a,b);
		System.out.println(multi);
		
		sc.close();
	}

}
