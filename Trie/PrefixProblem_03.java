package Trie;

public class PrefixProblem_03 {

    // Definition of a Trie Node
    public static class Node {
        // Pointers for 26 lowercase English letters ('a' through 'z')
        Node[] children = new Node[26];
        
        // Marks whether this node marks the end of a complete word
        boolean eow = false;
        
        // Tracks how many inserted words pass through this specific character node
        int freq;

        public Node() {
            // Explicitly initialize all child references to null
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
            // A node is created because at least 1 word passes through it
            freq = 1;
        }
    }

    // Root node representing the entry point (holds no character itself)
    public static Node root = new Node();

    /**
     * Inserts a word into the Trie while maintaining the frequency count at each character node.
     */
    public static void insert(String word) {
        Node current = root;

        for (int i = 0; i < word.length(); i++) {
            // Map character to array index: 'a' -> 0, 'b' -> 1, ..., 'z' -> 25
            int index = word.charAt(i) - 'a';

            if (current.children[index] == null) {
                // First time encountering this branch: create a node (freq initialized to 1)
                current.children[index] = new Node();
            } else {
                // Another word shares this prefix character: increment its frequency counter
                current.children[index].freq++;
            }

            // Advance down the Trie
            current = current.children[index];
        }

        // Mark the end of the word
        current.eow = true;
    }

    /**
     * Traverses the Trie using DFS to find the shortest unique prefix for each word.
     * @param root The current node being visited
     * @param ans  The accumulated prefix string up to this point
     */
    public static void findPrefix(Node root, String ans) {
        // Base case: Safety check for null nodes
        if (root == null) {
            return;
        }

        // Key Logic: If frequency is 1, this path is unique to exactly one word.
        // We have found its shortest unique prefix and do not need to traverse deeper.
        if (root.freq == 1) {
            System.out.println(ans);
            return;
        }

        // If freq > 1, multiple words share this path; explore all active child branches
        for (int i = 0; i < root.children.length; i++) {
            if (root.children[i] != null) {
                // Convert index back to character: 0 -> 'a', 1 -> 'b', etc.
                findPrefix(root.children[i], ans + (char)(i + 'a'));
            }
        }
    }

    public static void main(String[] args) {
        String arr[] = {"zebra", "dog", "duck", "dove"};

        // Step 1: Insert all words into the Trie
        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }

        // Step 2: Prevent premature termination at the root.
        // The root is initialized with freq = 1, which would falsely trigger
        // the `root.freq == 1` check before descending into any characters.
        root.freq = -1;

        // Step 3: Traverse and print unique prefixes
        // Output for {"zebra", "dog", "duck", "dove"}:
        // - "dog"  -> "dog"  (shares 'd' and 'o' with "dove")
        // - "dove" -> "dov"  (shares 'd' and 'o' with "dog")
        // - "duck" -> "du"   (shares 'd' with "dog" and "dove")
        // - "zebra"-> "z"    (unique right from the start)
        findPrefix(root, "");
    }
}