package string;

import java.util.Scanner;
public class ArrayStringInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array \n");
		int size = sc.nextInt();
		
		String arr[]=new String[size];
		
		int totalLength=0;
		
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.next();
			
			totalLength += arr[i].length();
		}
		
		System.out.println(totalLength);
		
		sc.close();
	}

}
