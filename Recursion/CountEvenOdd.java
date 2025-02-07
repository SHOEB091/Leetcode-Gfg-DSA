package Recursion;

public class CountEvenOdd {

    static int [] countEvenOdd(int range)
    {
        //base case
        if(range ==0)
        {
            int result[] =new int[2];
            //[0]=evenCount , [1] = oddCount
            return result;
        }
    //small problem
       int result[]= countEvenOdd(range-1);
        //logic
        if(range%2==0)
        {
            result[0]=result[0]+1;
        }
        else
        {
            result[1]=result[1]+1;
        }
        return result;
    }
    static void countEvenOdd(int range,int even,int odd)
    {
        //base case
      if(range==0)
      {
          System.out.println("Even Count " + even + " Odd Count " +odd);
          return; //exit from current function call
      }

      //Logic
      if(range%2==0)
      {
          even++;
      }
      else {
          odd++;
      }

      //Small Problem
      countEvenOdd(range-1,even,odd);

    }

    public static void main(String[] args) {
        countEvenOdd(10,0,0);

        int [] arr = countEvenOdd(10);
        System.out.println("Even Count " +arr[0]);
        System.out.println("Odd Count " +arr[1]);
    }
}
