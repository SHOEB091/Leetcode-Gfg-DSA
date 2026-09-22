package Trie;

public class WordBreak {

    // Node class must be static to be referenced by static fields/methods
    public static class Node {
        Node[] children = new Node[26];
        boolean eow = false; // End of word flag

        public Node() {
            // Java initializes object arrays to null by default, 
            // but explicit initialization is safe.
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    // Root of the Trie
    public static Node root = new Node();

    // Inserts a word into the Trie
    public static void insert(String word) {
        Node current = root;
        for (int level = 0; level < word.length(); level++) {
            int index = word.charAt(level) - 'a';

            // Create a new child node if it doesn't already exist
            if (current.children[index] == null) {
                current.children[index] = new Node();
            }
            current = current.children[index];
        }
        // Mark the final character as the end of a valid word
        current.eow = true;
    }

    // Searches whether a complete word exists in the Trie
    public static boolean search(String key) {
        Node current = root;
        for (int level = 0; level < key.length(); level++) {
            int index = key.charAt(level) - 'a';

            // Character path not found
            if (current.children[index] == null) {
                return false;
            }
            current = current.children[index];
        }
        // Return true only if it marks the end of a recognized word
        return current.eow;
    }

    // Recursively checks if the string can be segmented into dictionary words
    public static boolean wordBreak(String key) {
        // Base case: empty string means all prefixes were successfully matched
        if (key.length() == 0) {
            return true;
        }

        // Loop index represents length of the prefix (1 to key.length())
        for (int i = 1; i <= key.length(); i++) {
            // Split into prefix key[0...i-1] and suffix key[i...end]
            String prefix = key.substring(0, i);
            String suffix = key.substring(i);

            // If the prefix exists in Trie and the remaining suffix can also be segmented
            if (search(prefix) && wordBreak(suffix)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        // Dictionary of words
        String[] words = {"i", "like", "sam", "samsung", "mobile", "ice"};

        // Build the Trie
        for (String word : words) {
            insert(word);
        }

        // Test strings
        String query1 = "ilikesamsung";
        String query2 = "ilikesung";

        System.out.println("Can \"" + query1 + "\" be segmented? " + wordBreak(query1)); // Expected: true
        System.out.println("Can \"" + query2 + "\" be segmented? " + wordBreak(query2)); // Expected: false
    }
}
