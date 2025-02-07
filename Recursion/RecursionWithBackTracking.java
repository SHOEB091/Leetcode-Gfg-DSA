package Recursion;

public class RecursionWithBackTracking {

    static void print1ToN(int i,int num)
    {
        //base Condition
        if(i<1)
        {
            return;
        }
        //from here it will start back track
        print1ToN(i-1,num);
        System.out.println(i);
    }


    public static void main(String[] args) {
        print1ToN(5,5);
    }

}
