package Trie;

public class UniqueSubstrings_06 {
    
    // Definition of a standard Trie Node
    public static class Node {
        Node[] children = new Node[26];
        boolean eow = false; // end of word
        
        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }
    
    public static Node root = new Node();
    
    /**
     * Standard Trie insertion logic.
     * Inserts a string into the Trie character by character.
     */
    public static void insert(String word) {
        Node current = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (current.children[index] == null) {
                current.children[index] = new Node();
            }
            current = current.children[index];
        }
        current.eow = true;
    }
    
    /**
     * Recursively counts the total number of nodes in the Trie.
     * 
     * Why count nodes?
     * Every valid path from the root to any node in this Trie represents a UNIQUE prefix.
     * Therefore, counting all nodes gives us the total number of unique prefixes stored.
     */
    public static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }
        
        int count = 0;
        // Traverse all possible 26 children
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                // Recursively add the node count of each valid sub-trie branch
                count += countNodes(root.children[i]);
            }
        }
        
        // Add 1 to include the current node itself, then return
        return count + 1; 
    }

    public static void main(String[] args) {
        String str = "ababa";
        
        /* 
         * CORE LOGIC FOR UNIQUE SUBSTRINGS:
         * 
         * 1. Every substring of a string is simply a "prefix" of one of its "suffixes".
         *    For example, "ab" is a prefix of the suffix "ababa".
         * 
         * 2. If we find ALL suffixes of the string and insert them into a Trie, 
         *    the Trie will automatically store all unique prefixes of those suffixes.
         * 
         * 3. Suffixes of "ababa":
         *    i=0 -> "ababa"
         *    i=1 -> "baba"
         *    i=2 -> "aba"
         *    i=3 -> "ba"
         *    i=4 -> "a"
         */
        for (int i = 0; i < str.length(); i++) {
            String suffix = str.substring(i);
            insert(suffix);
        }
        
        /*
         * 4. The total number of nodes in the Trie will exactly equal 
         *    the total number of unique substrings!
         * 
         * Note: The root node itself counts as the empty string ("").
         * If the problem asks for non-empty unique substrings, you would subtract 1.
         */
        System.out.println(countNodes(root)); 
    }
}