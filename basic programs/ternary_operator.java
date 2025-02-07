
public class ternary_operator {

	public static void main(String[] args) {
		// ?: -> condition ? expr1:expr2
//if condition is true it will execute expression 1 and if condition is false it will execute expression 2
		
		int i =8;
		int j =0;
		
		if(i>6)
			j=1;
		else
			j=2;
		j = i>6?1:2;
		
		System.out.println(j);
	}

}
