import java.util.Scanner;
public class loops_while {

	public static void main(String[] args) {
		
        // while loop = executes a block of code as long as a it's condition            remains true
		Scanner scanner = new Scanner(System.in);
		String name = "";
		
//		isBlank() is an instance method that returns true if the string is empty or contains only white space codepoints.
		
		while (name.isBlank())
		{
			// .nextLine It places the cursor in the next line after reading the input.
			System.out.println("enter your name: ");
			name = scanner.nextLine();
		}
		System.out.println("Hello ");
		
		scanner.close();
	}

}
