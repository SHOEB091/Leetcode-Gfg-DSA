package Recursion;

public class ReplaceCharacterInString {

    static String searchAndReplace(String str, char search ,char replace )
    {
        //base case
        if(str.length()==0)
        {
            return " ";
        }
        //small problem
        String result = searchAndReplace(str.substring(1),search,replace);
        if(str.charAt(0)==search)
        {
            return  replace+ result;
        }
        else {
            return str.charAt(0)+result;
        }
    }

    public static void main(String[] args) {
        String result = searchAndReplace("hello",'l','x');
        System.out.println(result);
    }
}
