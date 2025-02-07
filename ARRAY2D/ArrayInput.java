package ARRAY2D;

import java.util.Scanner;

public class ArrayInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Enter the number of rows\n");
		int rows = sc.nextInt();
		System.out.println("Enter the number of columns\n");
	    int cols = sc.nextInt();


	      System.out.println("Enter the elements in an array\n");
	       int[][] numbers = new int[rows][cols];

	       
	       //input
	       //rows
	       for(int i=0; i<rows; i++) {
	           //columns
	           for(int j=0; j<cols; j++) {
	               numbers[i][j] = sc.nextInt();
	           }
	       }


  

	       for(int i=0; i<rows; i++) {
	           for(int j=0; j<cols; j++) {
	                   System.out.print(numbers[i][j]+" ");
	               }
	               System.out.println();
	           }

		
		
		sc.close();
	}

}
