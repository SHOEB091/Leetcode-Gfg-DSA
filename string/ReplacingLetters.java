package string;

import java.util.Scanner;

public class ReplacingLetters {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter any word \n");
		String str= sc.next();
		
		String result = "";
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='e')
			{
				result+='i';
			}
			else
			{
				result+=str.charAt(i);
			}
		}
		System.out.println(result);
		
		sc.close();
		
		
		/*public static void main(String[] args)
	    {
	        String str = "The quick brown fox jumps over the lazy dog.";

	        // Replace all the 'd' characters with 'f' characters.
	        String new_str = str.replace('d', 'f');

	        // Display the strings for comparison.
	        System.out.println("Original string: " + str);
	        System.out.println("New String: " + new_str);
	    }*/
	}

}
