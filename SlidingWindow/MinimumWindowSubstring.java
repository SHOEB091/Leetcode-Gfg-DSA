package SlidingWindow;
import java.util.*;
public class MinimumWindowSubstring {

    public static int miminumWindow(String str , String s1){
        //creating hashMap to store unordered list 
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char currentChar = s1.charAt(i);
            map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);
        }
        //creating variables
        int ans = Integer.MAX_VALUE;
        int i=0,j=0;
        int count =map.size();

        //calculations 
        while(j<str.length()){
            if (map.containsKey(str.charAt(j))) {
                map.put(str.charAt(j), map.get(str.charAt(j)) - 1);
                if (map.get(str.charAt(j)) == 0) {
                    count--;
                }
            }
            if(count>0){
                j++;
            }

            else if(count ==0){
                ans = Math.min(ans,j-i+1); //A candidate for our Anaser 

                //trying to minimize the size after getting a candidate for answer 

                while (count == 0) {
                    if (!map.containsKey(str.charAt(i))) {
                        i++;
                        ans = Math.min(ans, j - i + 1); // updating the answer
                    } else {
                        map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
                        if (map.get(str.charAt(i)) > 0) {
                            i++;
                            count++;
                        } else {
                            i++;
                            ans = Math.min(ans, j - i + 1); // updating the answer
                        }
                    }
                }
                j++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String str = " totmtaptat";
        String s1 = "tta";
        System.out.println(miminumWindow(str, s1));
    }
    
}
