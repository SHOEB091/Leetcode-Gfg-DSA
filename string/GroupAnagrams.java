package string;
import java.util.*;

public class GroupAnagrams {
    // Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
    // Output: [["bat"], ["nat", "tan"], ["ate", "eat", "tea"]]

    // Function to group anagrams
    public List<List<String>> groupAnagrams(String[] strs) {
        // Map to store sorted string as key and list of anagrams as value
        Map<String, List<String>> map = new HashMap<>();

        // Iterate through each string in the input array
        for (String str : strs) {
            // Convert the string to a character array
            char[] charArray = str.toCharArray();
            // Sort the character array
            Arrays.sort(charArray);
            // Convert the sorted character array back to a string
            String sortedStr = new String(charArray);

            // If the sorted string is not already in the map, add it with an empty list
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }
            // Add the original string to the list of anagrams for the sorted string
            map.get(sortedStr).add(str);
        }

        // Return the list of anagram groups
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        GroupAnagrams solution = new GroupAnagrams();
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = solution.groupAnagrams(input);
        System.out.println(result); // Output: [["bat"], ["nat", "tan"], ["ate", "eat", "tea"]]
    }
}