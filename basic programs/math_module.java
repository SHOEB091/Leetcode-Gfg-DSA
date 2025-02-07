
public class math_module {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x=3-14;
		double y =10;
		
		double z=Math.max(x, y);
		
//		get the absolute value of y without any sign.
		double a=Math.abs(y);
		
//		get the round of any number 
		double b=Math.round(x);// ceil and floor are also a roundoff method 
		
//		get the square root of the number
		double c=Math.sqrt(y);
		
		System.out.println(z);
		
		System.out.println(a);
		
		System.out.println(b);
		
		System.out.println(c);
	}

}
