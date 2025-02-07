package string;
import java.util.Scanner;

public class string_user_input {

	public static void main(String[] args) {
		// string with user input
		String s1,s2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 strings ");
		s1=sc.nextLine();
		s2=sc.nextLine();
		
		// join these two strings means concatenate 
		
		String s3=s1.concat(s2); // s1.concat(s2)  or s1+s2;
		System.out.println("Result on Concatenation is : " + s3);
		
		//to get the length of the string s1.length();
		int l1 = s1.length();
		int l2 = s2.length();
		
		System.out.println("The lenght of the string is " + l1);
		System.out.println("The lenght of the string is " + l2);
		
		// Converting it into upper case 
		s1=s1.toUpperCase();
		s2=s2.toUpperCase();
		
		System.out.println("first string upper case "+s1);
		System.out.println("second string upper case "+s1);
		
		
		
		sc.close();
	}

}
