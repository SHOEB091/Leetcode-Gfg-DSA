package ReccursionDem;
public class ReccursionDemo {
    
    public static void main(String[] args) {
        show(5);
    }

    static void show(int num)
    {
        //base condition 
        //termination condition 
        if(num==0)
        {
            return;
        }
        System.out.println("SHOEB"+num);//Processing Logic 
    
        show(num-1); //Recursion Cycle 
        System.out.println("Iqbal"+num);
    }

}
