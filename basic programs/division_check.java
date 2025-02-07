import java.util.Scanner;
public class division_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Please Enter any Number to Check whether it is Divisible by 5");
		number = sc.nextInt();	
		
		if(number % 5 == 0)
		{
			System.out.println("\n Given number " + number + " is Divisible by 5"); 
		}
		else
		{
			System.out.println("\n Given number " + number + " is Not Divisible by 5"); 
		}	
		sc.close();
	}

}
