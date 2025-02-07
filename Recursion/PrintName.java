package Recursion;
import java.util.Scanner;
public class PrintName {

    static void printname(int i,int num)
    {   //base case
        if(i>num)
        {
            return;
        }
        System.out.println("Jame Bond");
        printname(i+1,num);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n");

        int num = sc.nextInt();

        printname(1,num);
    }
}
