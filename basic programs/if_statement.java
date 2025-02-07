
public class if_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if statement = performs a block of code if it's condition evaluates to be true
		int age = 13;
		if(age==75)
		{
			System.out.println("ok Boomer!");
		}
		else if(age>=18)
		{
			System.out.println("You are an adult!");
		}
		else if(age>=13)
		{
			System.out.println("Your are a teenager!");
		}
		else
		{
			System.out.println("Your are not an adult!");
		}
	}

}
