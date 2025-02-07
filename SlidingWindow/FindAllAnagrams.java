package SlidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAllAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int k = p.length();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < k; i++) {
            char ch = p.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int count = map.size();
        int i = 0, j = 0;
        while (j < s.length()) {
            // Process the current character
            char ch = s.charAt(j);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);
                if (map.get(ch) == 0) {
                    count--;
                }
            }
            // If the window size is less than k, just move the window to the right
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) { // When window size is k
                // If count is 0, all characters match
                if (count == 0) {
                    ans.add(i);
                }
                // Slide the window
                char ch1 = s.charAt(i);
                if (map.containsKey(ch1)) {
                    map.put(ch1, map.get(ch1) + 1);
                    if (map.get(ch1) == 1) {
                        count++;
                    }
                }
                i++;
                j++;
            }
        }
        return ans;
    }
}
