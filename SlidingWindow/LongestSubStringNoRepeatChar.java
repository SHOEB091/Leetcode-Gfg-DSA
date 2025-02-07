package SlidingWindow;
import java.util.*;

public class LongestSubStringNoRepeatChar {

    public static int SubStringNorepeatingChar(String str){
        int i = 0;
        int j = 0;
        int max = 0; // It's safe to initialize max to 0 since the minimum valid substring length is 0
        Map<Character, Integer> map = new HashMap<>();
        while (j < str.length()) {
            char endChar = str.charAt(j);
            map.put(endChar, map.getOrDefault(endChar, 0) + 1);

            // If the current character causes a repeat, shrink the window from the left
            while (map.get(endChar) > 1) {
                char startChar = str.charAt(i);
                map.put(startChar, map.get(startChar) - 1);
                if (map.get(startChar) == 0) {
                    map.remove(startChar);
                }
                i++;
            }

            // Update max after ensuring there are no repeating characters in the current window
            max = Math.max(max, j - i + 1);
            j++;
        }

        return max;
    }

    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println("Length of the longest substring without repeating characters: " + SubStringNorepeatingChar(str));
    }
}