package Recursion;

public class RemoveConsecutiveCharacter {

    static String removeConsDup(String str)
    {

        if(str.length()==1)
        {
            return str;
        }
        //oth chr with 1st char
        if(str.charAt(0)==str.charAt(1))
        {
            return removeConsDup(str.substring(1));
        }
        else {
            return str.charAt(0)+ removeConsDup(str.substring(1));
        }
    }
    public static void main(String[] args) {
        System.out.println(removeConsDup("aaabbbcdcc"));
    }

}
