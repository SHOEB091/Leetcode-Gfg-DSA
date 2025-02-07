package LInear_Searching;
import java.util.Scanner;

public class SearchIn2dArray {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        // Get the dimensions of the array from the user
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();

        // Create the 2D array based on the user input
        int[][] array = new int[rows][columns];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        // Get the value to search from the user
        System.out.print("Enter the value to search: ");
        int searchValue = sc.nextInt();

        boolean found =LinearSearch(array,searchValue);
        {
            if(found)
            {
                System.out.println("Value found in the array.");
            }
            else {
                System.out.println("value not found the array");
            }
        }
        //OR
        /*int[] result = search2DArray(array, searchValue);
        if (result != null) {
            System.out.println("Value found at index (" + result[0] + ", " + result[1] + ") in the array.");
            System.out.println("Found value: " + array[result[0]][result[1]]);
        } else {
            System.out.println("Value not found in the array.");
        }*/

    sc.close();
    }
    public static boolean LinearSearch(int[][] array,int searchValue)
    {
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array[i].length;j++)
            {
                if(array[i][j]==searchValue)
                {
                    return true;
                }
            }
        }
        return false;
    }
}








