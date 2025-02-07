package Recursion;

//5= 1+2+3+4+5 =15;
//Two ways
//Parameter
//Functional

public class SumOfFirstNnumber {

    //functional Recursion
    static int sumOfNumber(int num)
    {
        if(num==0)
        {
            return 0;
        }
        return num+sumOfNumber(num-1);
    }



    //parameterized
    static void SumOfNnumber(int i,int sum)
    {
        //base case
        if(i<1)
        {
            System.out.println(sum);
            return;
        }
        SumOfNnumber(i-1,sum+i);

    }

    public static void main(String[] args) {
        //SumOfNnumber(3,0);
        System.out.println( sumOfNumber(5));
    }

}
