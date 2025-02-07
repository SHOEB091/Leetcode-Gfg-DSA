package Recursion;

public class PrintTable {

    static String printTable2(int num ,int val)
    {
        if(val==0)
        {
            return "";
        }
        String result= printTable2(num,val-1);
        String expression = num + "*" + val + "=" +(num * val)+"\n";
        return result + expression;
    }

    static void printTable(int num , int val,int result)
    {
        if(val==0)
        {

            return;
        }
         result=num*val;
        printTable(num,val-1,result);
        System.out.println( num + "*" + val + "=" + result);
    }
    public static void main(String[] args) {
    printTable(5,10,1);

    String r = printTable2(5,10);
        System.out.println(r);

    }
}
