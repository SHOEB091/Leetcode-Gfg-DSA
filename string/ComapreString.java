package string;

public class ComapreString {

	public static void main(String[] args) {
		String name1 = "Tony";
		String name2 = "Tony";
		
		//compareTo
		//1 s1>s2 : +ve value
		//2 s1==s2 : 0
		//3 s1<s2 : -ve value
		
		if(name1.compareTo(name2)==0)
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("String are not equal");
		}
		
		
		
		
		if(name1.equals(name2))
		{
			System.out.println("They are the same String");
		}
		else
		{
			System.out.println("They are different strings");
		}
		
		//Do Not use == to check the String equality
		//gives correct answer here
		if(name1==name2)
		{
			System.out.println("They are the same string");
		}
		else
		{
			System.out.println("They are different strings");
		}
		
		
		//Gives incorrect answer here 
		if(new String("Tony")== new String("Tony"))
		{
			System.out.println("They are the same string");
		}
		else 
		{
			System.out.println("They are differnt strings");
		}

	}

}
