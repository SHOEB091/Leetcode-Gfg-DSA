package string;

public class String_Intro {

	public static void main(String[] args) {
		// java String is basically an object that represents sequence of char values. An array of characters works same as java string. 
		
		char[] ch = {'s','h','o','e','b'};
		String s = new String(ch);
		System.out.println(s);
		
		// also we can write it as a 
		String b = "javatpoint";
		System.out.println(b);
		
		//compare(),concat(),equals(),split(),length(),replace(),compareTo(), intern(), substring() etc.
		
//METHOD ONE		
		//String Literal
		// java String literal is created by using double quotes. 
		String c = "welcome";
		System.out.println(c);

//SECOND METHOD new Keyword
		String d = new String("Welcome"); //creates two objects and one reference variable 
		System.out.println(d);
      
			String s1="java";//creating string by Java string literal    
			char bh[]={'s','t','r','i','n','g','s'};    
			String s2=new String(bh);//converting char array to string    
			String s3=new String("example");//creating Java string by new keyword    
			System.out.println(s1);    
			System.out.println(s2);    
			System.out.println(s3);     
		
			
			
	}

}
