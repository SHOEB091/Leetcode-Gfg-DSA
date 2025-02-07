package ReccursionDem;

public class TablePrint {
    
    static String printTable2(int num,int val)
    {
        if(val==0)
        {
            return "";
        }
        String result = printTable2(num, val-1);
        String expression  = num+"*"+val+"="+(num*val)+"\n";
        return result + expression;

    }

    // static void printTable(int num,int val)
    // {
    //     //base case 
    //     if(val>10)
    //     {
    //         return;
    //     }
    //     System.out.println(num+"*"+val+"="+(num*val));
        
    //     printTable(num,val+1);//tail recursion

    // }
    static void printTable(int num,int val)
    {
        //base case 
        if(val==0)
        {
            return;
        }
        //System.out.println(num+"*"+val+"="+(num*val));  //print reverse table 
        
        printTable(num,val-1);//tail recursion
        System.out.println(num+"*"+val+"="+(num*val)); //Post Recursion
        
    }
    public static void main(String[] args) {
        //printTable(5,10);
       String r = printTable2(5,10);
       System.out.println(r);
    }

}
