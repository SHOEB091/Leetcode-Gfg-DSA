package LInear_Searching;
import java.util.Scanner;
public class Search_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    String name = "Shoeb";
        System.out.println("Enter the target element \n");

    char target = sc.next().charAt(0);
        System.out.println(stringSearch(name,target));
    }
    public static boolean stringSearch(String str,char target)
    {
           if(str.length()==0)
           {
               return false;
           }
           for(int i= 0 ;i<str.length();i++)
           {
               if(target == str.charAt(i))
               {
                   return true;
               }
           }
           return false;
    }

    static boolean search2(String str, char target)
    {
        if(str.length()==0)
        {
            return false;
        }

        for(char ch: str.toCharArray())
        {
            if(ch==target)
            {
                return true;
            }
        }
        return false;
    }




}

