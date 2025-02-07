package function_method;

import java.util.Scanner;

public class method_new1 {
    
	public static void printMyName(String name)
	{
		System.out.println(name);
		return;
	}
	
	public static void main(String[] args) {
		
		//function syntax
        /* returnType functionName(type arg1,type arg2..) {
              * return type = int,float,String etc.
              * void = no return value .
              * better function name is important e.g = CalculateSum, Interger_Add              etc.
              * camelcase notation = printMyName 
        	operation
        } */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name :");
		String name = sc.next();
		printMyName(name);
		sc.close();
	}
}
