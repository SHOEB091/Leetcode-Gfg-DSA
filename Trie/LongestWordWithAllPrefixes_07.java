package Trie;

public class LongestWordWithAllPrefixes_07 {
    public static class Node {
        Node[] children = new Node[26];
        boolean eow = false;

        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }
    
    // FIXED: Must be static so our static methods (insert, search, main) can access it.
    public static Node root = new Node();

    /*
    Step 1. Initialize a current node pointer and set it to the root.
    Step 2. Run a for loop from i = 0 to i < word.length().
    Step 3. Calculate the index for the current character (word.charAt(i) - 'a').
    Step 4. Check if the child node at this index is null. If it is, create a new Node() at that index.
    Step 5. Move the current pointer down to this child node (current = current.children[index]).
    Step 6. After the loop finishes, mark the last node's End of Word flag as true (current.eow = true).
    */
    public static void insert(String word) {
        // FIXED: Start at root, not a new Node()
        Node current = root; 
        
        // FIXED: Loop up to word.length(), not 26
        for (int i = 0; i < word.length(); i++) { 
            int index = word.charAt(i) - 'a';
            if (current.children[index] == null) {
                current.children[index] = new Node();
            }
            current = current.children[index];
        }
        current.eow = true;
    }

    /*
    Step 1. Initialize a current node pointer and set it to the root.
    Step 2. Run a for loop from i = 0 to i < key.length().
    Step 3. Calculate the index for the current character (key.charAt(i) - 'a').
    Step 4. Check if the child node at this index is null. If it is, return false.
    Step 5. Move the current pointer down to this child node.
    Step 6. After the loop finishes, return the final node's End of Word flag.
    */
    public static boolean search(String key) {
        Node current = root; // FIXED
        for (int i = 0; i < key.length(); i++) { // FIXED
            int index = key.charAt(i) - 'a';
            if (current.children[index] == null) {
                return false;
            }
            current = current.children[index];
        }
        return current.eow;
    }

    public static String ans = "";

    /**
     * Finds the longest word where EVERY prefix of the word is also a valid word.
     * Uses Depth First Search (DFS) and Backtracking.
     */
    public static void longestWord(Node root, StringBuilder temp) {
        if (root == null) {
            return;
        }
        
        // Loop from 0 to 25 ('a' to 'z'). 
        // Traversing in alphabetical order ensures that if we find a tie (e.g., "apple" vs "apply"),
        // the lexicographically smaller one ("apple") is naturally stored first.
        for (int i = 0; i < 26; i++) {
            
            // CRITICAL CHECK: We ONLY step into a node if it exists AND its eow is true.
            // If eow is false, it means this prefix was NOT in our original word list, 
            // so we immediately stop exploring this path.
            if (root.children[i] != null && root.children[i].eow == true) {
                
                char ch = (char) (i + 'a');
                temp.append(ch); // Step forward: add character to our temporary string
                
                // If our newly formed valid word is strictly longer than our current answer, update it.
                // Because of the 'a' to 'z' loop, "apple" is found before "apply".
                // Since "apply" is not > "apple" in length (5 is not > 5), "apple" remains the answer.
                if (temp.length() > ans.length()) {
                    ans = temp.toString();
                }
                
                // Recursively explore deeper to see if we can form an even longer word
                longestWord(root.children[i], temp);
                
                // BACKTRACKING: We finished exploring paths under this character.
                // Remove the character from the end of StringBuilder so we can explore sibling branches.
                temp.deleteCharAt(temp.length() - 1);
            }
        }
    }

    public static void main(String[] args) {
        String words[] = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
        
        // Step 1: Insert all words into the Trie
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        
        // Step 2: Start DFS traversal from the root with an empty StringBuilder
        longestWord(root, new StringBuilder());
        
        // Step 3: Print the result ("apple")
        System.out.println(ans); 
    }
}