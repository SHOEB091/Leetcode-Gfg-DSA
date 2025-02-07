package function_method;

import java.util.Scanner;

public class prime_number {
	
	public static int primeCalculate(int n)
	{
		int count=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count>1)
		{
			System.out.println("The number is not a prime: ");
			return 0;
		}
		else
		{
			System.out.println("The number is prime: ");
			return 1;
		}
		
	}
	
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);	
	
	System.out.println("Enter the number to check the prime number: ");
	int n= sc.nextInt();
	
    primeCalculate(n);
	
	sc.close();
	}

}
