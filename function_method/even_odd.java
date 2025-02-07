package function_method;

import java.util.Scanner;

public class even_odd {
	public static void evenOdd(int n)
	{
		if (n%2==0)
		{
			System.out.println("Number is Even: ");
		}
		else
		{
			System.out.println("Number is Odd: ");
		}
	}
	
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number to check even odd: ");
	int n = sc.nextInt();
	
	evenOdd(n);	
		
	sc.close();	
	}

}
