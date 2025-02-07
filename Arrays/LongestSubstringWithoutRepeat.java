package Arrays;
import java.util.*;
public class LongestSubstringWithoutRepeat {

    //Brute force approach 

    public static int LongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;

        // Outer loop to set the starting point of the substring
        for (int i = 0; i < n; i++) {
            String sub = ""; // Current substring

            // Inner loop to expand the substring
            for (int j = i; j < n; j++) {
                char currentChar = s.charAt(j);

                // If character is already in the substring, stop expanding
                if (sub.contains(String.valueOf(currentChar))) {
                    break;
                }

                // Add character to the substring
                sub += currentChar;

                // Update the maximum length
                maxLength = Math.max(maxLength, sub.length());
            }
        }

        return maxLength;
    }

    // Optimal Approach 
    // Using Sliding Window 
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
             return 0; // Edge case
         }
 
         HashMap<Character, Integer> map = new HashMap<>();
         int i = 0, j = 0, maxLen = 0;
 
         while (j < s.length()) {
             // Adding the current character to the hashMap
             char currentChar = s.charAt(j);
             map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);
 
             // If no repeating characters in the current window
             if (map.size() == j - i + 1) {
                 maxLen = Math.max(maxLen, j - i + 1);
                 j++;
             } else {
                 // If repeating characters exist, shrink the window
                 while (map.size() < j - i + 1) {
                     char charAtI = s.charAt(i);
                     map.put(charAtI, map.get(charAtI) - 1);
 
                     // Remove the character from the map if its count becomes 0
                     if (map.get(charAtI) == 0) {
                         map.remove(charAtI);
                     }
                     i++;
                 }
                 j++;
             }
         }
         return maxLen;
     }



    public static void main(String[] args) {
        String input = "abcabcbb";
        System.out.println("The length of the longest substring without repeating characters is: " + LongestSubstring(input));
    }
}
