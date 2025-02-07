import java.util.Scanner;
public class hypotenuse_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x ;
		double y;
		double z;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enetr the side of the triangle: ");
		x = scanner.nextDouble();
		
		System.out.println("Enetr the side of the triangle: ");
		y = scanner.nextDouble();
		
		z=Math.sqrt((x*x)+(y*y));
		
		System.out.println("Ther hypotenuse is : "+z);
		
		scanner.close();
	}

}
