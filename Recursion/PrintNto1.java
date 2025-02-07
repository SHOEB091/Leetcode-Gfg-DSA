package Recursion;

public class PrintNto1 {

    static void printNto1(int i,int num)
    {
        if(i<1)
        {
            return;
        }
        System.out.println(i);
        printNto1(i-1,num);
    }

    public static void main(String[] args) {
        printNto1(5,5);
    }

}
