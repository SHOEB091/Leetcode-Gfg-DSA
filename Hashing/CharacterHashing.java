package Hashing;

import java.util.HashMap;

public class CharacterHashing {

    // Function to count character frequencies in a string
    public static HashMap<Character, Integer> countCharacters(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        // Iterate through each character in the string
        for (char ch : s.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1); // Increment count if character exists
            } else {
                map.put(ch, 1); // Initialize count to 1 if character is not in map
            }
        }

        return map;
    }

    public static void main(String[] args) {
        // Input string
        String s = "abcdabegc";

        // Get the frequency map
        HashMap<Character, Integer> frequencies = countCharacters(s);

        // Print the occurrences of each character
        System.out.println("Character occurrences:");
        for (char key : frequencies.keySet()) {
            System.out.println(key + " -> " + frequencies.get(key));
        }
    }
}
