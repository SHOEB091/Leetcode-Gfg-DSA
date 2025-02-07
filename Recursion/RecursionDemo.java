package Recursion;

public class RecursionDemo {
    //stack space
    static void recrusionDemo(int count)
    {   //base condition
        if(count==0)
        {
            return;
        }
        System.out.println("Shoeb" + count );

        //termination condition
        recrusionDemo(count-1);
        System.out.println("iqbal" + count);
    }

    public static void main(String [] args)
    {
        recrusionDemo(5);
    }




}
