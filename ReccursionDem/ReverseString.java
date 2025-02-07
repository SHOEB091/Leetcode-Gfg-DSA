package ReccursionDem;
//Search and replac ea charcter ina String 
public class ReverseString {

    static String reverse(String str )
    {
        if(str.length()==0)
        {
            return " ";
        }
        String smallString = str.substring(1);
        String result =reverse(smallString);
        return result+str.charAt(0);
    }

    public static void main(String[] args) {
        String r = reverse("bhattal chullliya");
        System.out.println(r);
    }
    
}
