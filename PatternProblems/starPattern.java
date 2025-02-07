package PatternProblems;

import java.util.Scanner;
public class starPattern {

    public static void main(String[] args) {

        System.out.println("Enter the number of rows: ");
        for(int i= 0;i<5;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }


}


