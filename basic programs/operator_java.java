import java.util.Scanner;
public class operator_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        // logical operators = used to connect two or more expressions
		
		//    && =(AND) both conditions must be true 
		//    || = (or) either condition must have be true
		//     ! = (Not) reverses boolean value of a condition
		
		Scanner sc = new Scanner(System.in);
		System.out.println("You are playing a game! Press q or Q to quit");
		String response = sc.next();
		
		// .equals is also a == 
		
		if(!response.equals("q") && !response.equals("Q"))
		{
			System.out.println("Your are still playing the game *pew pew*");
		}
		else
		{
			System.out.println("You quit the game");
		}
		
		
		
		
		
		
		
		
		
		sc.close();
	}
}
