package ARRAY2D;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the number of rows \n");
		int n=sc.nextInt();
		
		System.out.println("Enter the number of columns \n");
		int m=sc.nextInt();
		
		System.out.println("Enter the numebr of elements in the array");
		
		int matrix[][] = new int[n][m];
	      for(int i=0; i<n; i++) {
	           for(int j=0; j<m; j++) {
	               matrix[i][j] = sc.nextInt();
	           }
	      }


	      System.out.println("The transpose is : ");
	      //To print transpose
	      for(int j=0; j<m ;j++) {
	          for(int i=0; i<n; i++) {
	              System.out.print(matrix[i][j]+" ");
	          }

			System.out.println();
		}
		
		sc.close();
	}

}
