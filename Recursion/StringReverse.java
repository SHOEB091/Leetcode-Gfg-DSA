package Recursion;

public class StringReverse {

    static String reverse(String str)
    {
        //base case
        if(str.length()==0)
        {
            return " ";
        }

        //small Problem
        String SmallString =reverse(str.substring(1));
        char firstChar = str.charAt(0);

        return SmallString+firstChar;
    }


    public static void main(String[] args) {
        String str = reverse("SHOEB");
        System.out.println(str);
    }

}
