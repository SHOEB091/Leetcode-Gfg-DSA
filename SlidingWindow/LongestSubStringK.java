package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

// Variable size window
public class LongestSubStringK {

    static int LongestSubString(String str, int k) {
        int i = 0;
        int j = 0;
        int max = Integer.MIN_VALUE;
        Map<Character, Integer> map = new HashMap<>();
        while (j < str.length()) {
            // Put the value of j in map and increase count
            char endChar = str.charAt(j);
            map.put(endChar, map.getOrDefault(endChar, 0) + 1);
            
            if (map.size() < k) {
                j++; // Increment j to avoid infinite loop
            } else if (map.size() == k) {
                // Update windowSize here after j has been incremented
                int windowSize = j - i + 1;
                max = Math.max(max, windowSize);
                j++;
            } else if (map.size() > k) {
                while (map.size() > k) {
                    char startChar = str.charAt(i);
                    map.put(startChar, map.get(startChar) - 1);
                    if (map.get(startChar) == 0) {
                        map.remove(startChar);
                    }
                    i++;
                }
                j++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String str = "aabacbebebe";
        int k = 3;
        System.out.println("Length of the longest substring: " + LongestSubString(str, k));
    }
}