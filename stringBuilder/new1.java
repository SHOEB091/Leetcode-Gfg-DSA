package stringBuilder;

public class new1 {

	public static void main(String[] args) {
		//Declaration of String builder 
		StringBuilder sb = new StringBuilder("Tony");
		System.out.println(sb);
		
		
		// get Char
		System.out.println(sb.charAt(0));
		
		//Set Char 
		sb.setCharAt(0,'p');
		System.out.println(sb);

		sb.insert(0,'s');
		System.out.println(sb);
		
		//delete the extra 's'
		sb.delete(2, 3);
		System.out.println(sb);
	}

}
