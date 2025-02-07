package ReccursionDem;

public class Fibo {
    
    static int fibonacci(int num)
    {
        //base case 
        if(num<=1)
        {
            return num;
        }
        int firstterm=fibonacci(num-1);
        int secondterm=fibonacci(num-2);
        int thirdterm= firstterm+secondterm;
        return thirdterm;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(7));
    }

}
