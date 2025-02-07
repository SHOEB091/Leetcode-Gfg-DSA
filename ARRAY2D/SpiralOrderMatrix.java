package ARRAY2D;

import java.util.Scanner;

public class SpiralOrderMatrix {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of rows\n");
		int n=sc.nextInt();
		System.out.println("Enter the number of columns\n");
		int m=sc.nextInt();
		
		System.out.println("enter the elements in the array\n");
		 int matrix[][] = new int[n][m];
	      for(int i=0; i<n; i++) {
	           for(int j=0; j<m; j++) {
	               matrix[i][j] = sc.nextInt();
	           }
	      }
	      
	      for(int i=0; i<n; i++) {
	           for(int j=0; j<m; j++) {
	                   System.out.print(matrix[i][j]+" ");
	               }
	               System.out.println();
	           }

		System.out.println("The special Order Matrix is : ");
		int rowStart =0;
		int rowEnd = n-1;
	      int colStart = 0;
	      int colEnd = m-1;


	      //To print spiral order matrix
	      while(rowStart <= rowEnd && colStart <= colEnd) {
	          //1
	          for(int col=colStart; col<=colEnd; col++) {
	              System.out.print(matrix[rowStart][col] + " ");
	          }
	          rowStart++;


	          //2
	          for(int row=rowStart; row<=rowEnd; row++) {
	              System.out.print(matrix[row][colEnd] +" ");
	          }
	          colEnd--;


	          //3
	          for(int col=colEnd; col>=colStart; col--) {
	              System.out.print(matrix[rowEnd][col] + " ");
	          }
	          rowEnd--;


	          //4
	          for(int row=rowEnd; row>=rowStart; row--) {
	              System.out.print(matrix[row][colStart] + " ");
	          }
	          colStart++;


	          System.out.println();
	      }

		sc.close();

	}

}
