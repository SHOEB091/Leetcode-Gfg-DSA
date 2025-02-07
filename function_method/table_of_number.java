package function_method;

import java.util.Scanner;

public class table_of_number {

	public static int createTable(int n)
	{
		for(int i=1; i<=10;i++)
		{
			System.out.println(n+" * "+i+" = "+n*i);
			
		}
		return 1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		
		createTable(n);
		
		sc.close();
	}

}
