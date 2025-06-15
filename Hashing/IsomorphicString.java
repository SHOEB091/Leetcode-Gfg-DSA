package Hashing;

import java.util.HashMap;

public class IsomorphicString {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character , Character> map1 = new HashMap<>();
        HashMap<Character , Character> map2 = new HashMap<>();
        
        char[] words1 = s.toCharArray();
        char[] words2 = t.toCharArray();
        
        for (int i = 0; i < s.length(); i++) {
            char c1 = words1[i];
            char c2 = words2[i];

            if (map1.containsKey(c1)) {
                if (map1.get(c1) != c2) return false;
            } else {
                map1.put(c1, c2);
            }

            if (map2.containsKey(c2)) {
                if (map2.get(c2) != c1) return false;
            } else {
                map2.put(c2, c1);
            }
        }

        return true;
    }
    
    public static void main(String[] args) {
        IsomorphicString iso = new IsomorphicString();
        String s1 = "egg";
        String t1 = "add";
        String s2 = "foo";
        String t2 = "bar";
        String s3 = "paper";
        String t3 = "title";
        System.out.println("Are '" + s1 + "' and '" + t1 + "' isomorphic? " + iso.isIsomorphic(s1, t1)); // true
        System.out.println("Are '" + s2 + "' and '" + t2 + "' isomorphic? " + iso.isIsomorphic(s2, t2)); // false
        System.out.println("Are '" + s3 + "' and '" + t3 + "' isomorphic? " + iso.isIsomorphic(s3, t3)); // true
    }
}
