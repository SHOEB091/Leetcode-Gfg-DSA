package function_method;


//There are two things function calling and function returning
//return hone ke bad hi fucntion call hogs jaisa neecehe example me hai..


import java.util.Scanner;

public class add_2_number{
	public static int calculateSum(int a,int b) {
	int sum = a+b;
	return sum;
}



	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the value of a: ");
		int a = sc.nextInt();
		
		System.out.println("Enter the value of b: ");
		int b = sc.nextInt();
		
		int sum = calculateSum(a,b);
		System.out.println(sum);
		
		sc.close();
	}
	
}
