package Recursion;

public class treeRecursion {

    static void fun(int num)
    {
        //base case
        if(num<=0)
        {
            return;
        }
        System.out.println("Pre Call " +num);
        fun(num-1); //Recursive Call
        System.out.println(" In between Call " +num);
        fun(num-2); //recursive Call
        System.out.println("Post Call " +num);
    }

    public static void main(String[] args) {
        fun(3);
    }

}
