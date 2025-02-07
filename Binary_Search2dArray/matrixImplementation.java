package Binary_Search2dArray;
import java.util.Scanner;
public class matrixImplementation {

    //Searching in Matrix;
    public static boolean search(int [][]arr,int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.println("found at index " + i + "," +j);
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns");
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int [][]arr=new int[rows][columns];

        System.out.println("Enter the element in the array");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("printing the matrix");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
        search(arr,2);

    }

}
