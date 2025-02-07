package Recursion;

public class print1ToN {

    static void Print1ToN(int i,int num)
    {   //base case
        if(i>num)
        {
            return;
        }
        System.out.println(i);

        Print1ToN(i+1,num);
    }

    public static void main(String[] args) {
        Print1ToN(1,5);
    }

}
