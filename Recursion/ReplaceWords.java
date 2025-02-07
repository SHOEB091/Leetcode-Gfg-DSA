package Recursion;

public class ReplaceWords {

    static String replaceWithWord(String str)
    {
        //base case
        if(str.length()<=1)
        {
            return str;
        }

        if(str.charAt(0)=='h' && str.charAt(1)=='i')
        {
           String smallstring =  str.substring(2);
           String result = replaceWithWord(smallstring);
           return "HELLO" + result ;
        }
        else {
            String smallString = str.substring(1);
            String result = replaceWithWord(smallString);
            char firstChar = str.charAt(0);
            return firstChar+result;
        }
    }

    public static void main(String[] args) {
        String  str = " hi shoeb hi tom";
        System.out.println(replaceWithWord(str));
    }

}
