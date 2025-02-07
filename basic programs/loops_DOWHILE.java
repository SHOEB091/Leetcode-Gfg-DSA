import  java.util.Scanner;

public class loops_DOWHILE {

	public static void main(String[] args) {

       // The Java do-while loop is used to iterate a part of the program repeatedly, until the specified condition is true
       // Java do-while loop is called an exit control loop
		
		Scanner sc = new Scanner(System.in);
		String name = "";
		
		do {
			System.out.println("Enter your name :");
			name = sc.nextLine();
		}while(name.isBlank());
		
		System.out.println("Hello sir!");
		
		sc.close();
	}

}
