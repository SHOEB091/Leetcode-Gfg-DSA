
public class break_and_continue_statements {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++)
		{
			if(i==7)
			{
				// continue statement skip that one iteration here;
				//continue;
				
				// break statement will break the the iteration when it found the the given number .
				break;
			}
			System.out.println("value is "+i);
		}

	}

}
