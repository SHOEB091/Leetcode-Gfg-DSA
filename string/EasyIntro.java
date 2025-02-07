package string;

import java.util.Scanner;

public class EasyIntro {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
//		System.out.println("Enter anything \n");
//		String name = sc.nextLine();
//		System.out.println("Your name is : "+  name );
		
		
		//concatenation adding two strings 
		System.out.println("concatenation\n");
		
		String firstName = "Tony";
		String lastname = "Stark";
		String fulName = firstName +" "+lastname;
		System.out.println(fulName);
		
		System.out.println("length method\n\n");
		
		//Length function to get the length of the string.
		String firstName1 = "Shoeb";
		String lastname2 = "Iqbal";
		String fulName3 = firstName1 +" "+lastname2;
		System.out.println(fulName3.length());
		
		//charAt to split the words 
		//traversing the string 
		System.out.println("using charAt and traveersing string\n\n");
		
		String firstname="Tony";
		String secondname="Stark";
		
		String fullname = firstname+" "+secondname;
		
		for(int i=0;i<fullname.length();i++)
		{
			System.out.println(fullname.charAt(i));
		}
		
		sc.close();
	}

}
