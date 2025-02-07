package ReccursionDem;



public class Factorial {

    static int fact(int num)
    {
        //one time
        //Base Case
        if(num==1)
        {
            return 1; //result
        }
       int result = fact(num-1);   
       return result*num;
       //Repeat (N-time)

        
        
    }





    /* 5!=5*4*3*2*1
        small problem
        n=5
        n-1
        base case n==1
    */
    static void fact(int num , int result)
    {
        //base case 
        if(num==1)
        {
            System.out.println("fact"+ result);
            return;
        }

        fact(num-1,num*result);
    }
    public static void main(String[] args) {
        //fact(5,1);
        System.out.println(fact(5));
    }


}
