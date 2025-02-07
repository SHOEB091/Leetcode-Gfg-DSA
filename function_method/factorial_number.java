package function_method;

import java.util.Scanner;

public class factorial_number {


	// n!= n*(n-1)*(n-2)*(n-3)....(n-1)!
	public static int printFactorial(int n) {
	       //loop
	       if(n < 0) {
	           System.out.println("Invalid Number");
	           return 1;
	       }
	       int factorial = 1;
	 
	       for(int i=n; i>=1; i--) {
	           factorial = factorial * i;
	       }
	 
	       //System.out.println(factorial);
	       return factorial;
	   }

	
	
	public static void main(String args[]) {
	       Scanner sc = new Scanner(System.in);
	       int n = sc.nextInt();
	 
	       int factorial = printFactorial(n);
	       
	       System.out.println(factorial);
	       
	       sc.close();
	}
}
