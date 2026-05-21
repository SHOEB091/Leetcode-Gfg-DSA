package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

//Anagarm means matching leter ( reshuffle of for present in the given text like)
/*
for
fro
ofr
orf
rof
rfo
*/
//Input: txt = forxxorfxdofr
       //pat = for
//Output = 3
//Explanation in the given text for is present , orf is present ofr is also present

public class OccurenceOfAnagrams {

    //Brute force approach
    public static int countAnagrams(String txt , String pat){

        int count = 0;
        int n = txt.length();
        int k = pat.length();
        Map<Character , Integer> map = new HashMap<>();
        for (int i = 0; i < pat.length(); i++) {
            char ch = pat.charAt(i);
            map.put(ch , map.getOrDefault(ch , 0) + 1);
        }
        // Loop through all substrings of length k in txt
        for (int i = 0; i <= n - k; i++) {
        String sub = txt.substring(i, i + k);
        // Create a frequency map for the current substring
        Map<Character, Integer> subMap = new HashMap<>();
        for (char ch : sub.toCharArray()) {
            subMap.put(ch, subMap.getOrDefault(ch, 0) + 1);
        }
        // If the frequency maps match, it's an anagram
            if (subMap.equals(map)) {
                count++;
            }
        }
        return count; 
    }

    //Optimized approach
    

    public static void main(String[] args) {
        String txt = "forxxorfxdofr";
        String pat = "for";

    }
}
