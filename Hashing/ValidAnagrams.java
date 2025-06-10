package Hashing;
import java.util.*;

public class ValidAnagrams {
    
    public static boolean anagrams(String s, String t) {
        // If lengths are not equal, they can't be anagrams
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char ch2 = t.charAt(i);
            map2.put(ch2, map2.getOrDefault(ch2, 0) + 1);
        }
        // Compare both frequency maps
        return map.equals(map2);
    }

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        String s3 = "apple";
        System.out.println("Are '" + s1 + "' and '" + s2 + "' anagrams? " + anagrams(s1, s2)); // true
        System.out.println("Are '" + s1 + "' and '" + s3 + "' anagrams? " + anagrams(s1, s3)); // false
    }

}
