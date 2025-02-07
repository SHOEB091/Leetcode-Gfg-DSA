import java.util.Scanner;
public class user_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("What is your name? ");
		String name = sc.nextLine();
//		nextLine is used to print words or sentence;
		
		
		System.out.println("How old are you? ");
		int age = sc.nextInt();
		
		System.out.println("Hello "+name);
		System.out.println("You are "+age+" year old");
		sc.close();
	}

}
