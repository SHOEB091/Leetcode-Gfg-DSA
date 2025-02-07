package function_method;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		System.out.println("Enter the number to get armstrong ");
	Scanner sc = new Scanner (System.in);
	
	int n = sc.nextInt();
	for(int i=100;i<1000;i++)
	{
		if(isArmstrong(i))
		{
			System.out.println(i + " ");
		}
	}
	
	System.out.println(isArmstrong(n));
	
	sc.close();
	}
	static boolean isArmstrong(int n)
	{
		int original =n;
		int sum =0;
		
		while(n>0)

		{
			int rem = n%10;
			n=n/10;
			sum = sum+rem*rem*rem;
		}
		if(sum == original)
		{
			return true;
		}
		return false;
	}

}
