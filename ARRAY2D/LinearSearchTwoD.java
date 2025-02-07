package ARRAY2D;

import java.util.Scanner;

public class LinearSearchTwoD {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x; 
		System.out.println("enter the numebr you want to search in the matrix ");
		
		x=sc.nextInt();
		
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
	                   if(numbers[i][j]==x)
	                   {
	                	   System.out.println("element found at the index\n" + i + "," + j);
	                   }
	               }
	      
	           }

		
		
		sc.close();

	}

}
