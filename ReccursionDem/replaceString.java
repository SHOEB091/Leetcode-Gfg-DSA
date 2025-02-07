package ReccursionDem;

public class replaceString {
    
    static  String StringReplace(char search,String str,char replace )
    {

        if(str.length()==0)
        {
            return " ";
        }

        String result = StringReplace(search,str.substring(1),replace);
        if(result.charAt(0)==search)
        {
            return replace+result;
        }
        else{
            return str.charAt(0)+result;
        }
    }

    public static void main(String[] args) {
       
       String result = StringReplace('l',"Hello",'x');
        System.out.println(result);

    }

}
