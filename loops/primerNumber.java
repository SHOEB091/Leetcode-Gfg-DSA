package loops;
import java.util.*;
public class primerNumber {
    
    public static void main(String[] args) {
        int num =17;
        //int count =0;
        // for(int i=0;i<num;i++)
        // {
        //     if(num%i==0)
        //     {
        //         count++;
        //     }
        // }
        // System.out.println(count==2?"Prime Number ":" not a prime number ");

        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                System.out.println("not a prime number :");
                return;
            }
        }
        System.out.println("Its a prime number : ");
        // for(int i=2;i<num;i++)
        // {
        //     if(num%i==0)
        //     {
        //         System.out.println("not a prime number :");
        //         return;
        //     }
        // }
        // System.out.println("Its a prime number : ");
    }
}
