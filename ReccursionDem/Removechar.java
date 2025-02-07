package ReccursionDem;

public class Removechar {
    
    static  String StringCharRemove(String str,char search)
    {

        if(str.length()==0)
        {
            return " ";
        }

        String result = StringCharRemove(str.substring(1),search);
        if(result.charAt(0)==search)
        {
            return result;
        }
        else{
            
            return str.charAt(0)+result;
        }
    }

    public static void main(String[] args) {
       
       String result = StringCharRemove("Hello",'e');
        System.out.println(result);

    }
}
