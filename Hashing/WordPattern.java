package Hashing;
import java.util.*;

public class WordPattern {
    
    public static boolean word(String pattern , String s){
        HashMap<Character , String> map1 = new HashMap<>();
        HashMap<String,Character> map2 = new HashMap<>();
        String[] n = s.split(" ");
        if(pattern.length() != n.length){
            return false;
        }
        
        for(int i=0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
            String word = n[i];

            //If ch is already mapped to a differrent word -> false
            if(map1.containsKey(ch)){
                if(!map1.get(ch).equals(word)){
                    return false;
                }
            }
            else{
                map1.put(ch,word);
            }

            //If word is already mapped to a different char -> false
            if(map2.containsKey(word)){
                if(map2.get(word)!=ch){
                    return false;
                }
            }
            else{
                map2.put(word,ch);
            }
        }


        return false;
    }

}
