package twoDArray;

import java.util.Scanner;

public class searching {
    
     public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int rows = sc . nextInt();
        int cols = sc.nextInt();
        int key = 3;
        int[][] matrix = new int[rows][cols];
        System.out.println("taking input in matrix ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]= sc .nextInt();
            }
        }

        System.out.println("the matrix is :");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
               if(matrix[i][j]== key){
                System.out.println("x found at location (" + i + ", " + j + " )" );
               }
            }
           
        }
        sc.close();

    }

}
