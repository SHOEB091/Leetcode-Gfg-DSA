package ReccursionDem;



public class countEnvenOddNumber {
    // static int [] countEvenOdd(int range)
    // {
        
    // }
    static void countEvenOdd(int range,int evenCount , int oddCount)
    {
        if (range==0)
        {
            System.out.println("Even numbers" + evenCount + "Odd Numbers" + oddCount) ;
            return;
        }
        if(range%2==0)
        {
            evenCount++;
        }
        else
        {
                oddCount++;
        }
        countEvenOdd(range-1,evenCount,oddCount);
        }
    

    public static void main(String[] args) {
        countEvenOdd(10,0,0);
    }

}
