package Arrays;

public class IsSusequence {

    static boolean  Subsequence(String s , String t){
        int i =0;
        int j = 0;
        while(i<s.length()&&j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }
        return i ==s.length();
        
    }

    public static void main (String[] args){

    }
}
