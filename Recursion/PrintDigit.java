package Recursion;

public class PrintDigit {

    static void printDigit(int  num)
    {
      if(num==0)
      {
          return; //stack fall
      }
      printDigit(num/10);
        System.out.println(num%10); // stack fall output
    }

    public static void main(String[] args) {
        printDigit(12345);
    }

}
