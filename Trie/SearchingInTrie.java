package Trie;

public class SearchingInTrie {
     // Represents a single letter/character node in the Trie
    public static class Node {
        // Pointers to up to 26 possible children (one for each letter 'a' through 'z')
        Node children[] = new Node[26];
        
        // "End of Word" flag: true if a valid word finishes at this node
        boolean eow = false;

        // Constructor: explicitly initialize all child references to null
        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    // The starting point of the Trie (an empty root node containing no letter)
    public static Node root = new Node();

    // Inserts a word character-by-character into the Trie
    // Time Complexity: O(L), where L is the length of the word
    public static void insert(String word) {
        Node current = root; // Start traversal at the root

        // Step through each character of the input word
        for (int level = 0; level < word.length(); level++) {
            // Map character to array index: 'a' -> 0, 'b' -> 1, ..., 'z' -> 25
            int index = word.charAt(level) - 'a';

            // If the branch for this letter doesn't exist yet, create a new Node
            if (current.children[index] == null) {
                current.children[index] = new Node();
            }

            // Move pointer down to the child node to process the next letter
            current = current.children[index];
        }

        // Once the entire word is traversed, mark the last node as a complete word
        current.eow = true;
    }

    public static boolean search(String key){
        Node current = root;
        for(int level=0; level<key.length();level++){
            int index = key.charAt(level)-'a';
            if(current.children[index]==null){
                return false;
            }
            current = current.children[index];
        }
        return current.eow = true;
    }

    public static void main(String[] args) {
        // Words to store inside our Trie
        String words[] = {"the", "a", "there", "their", "any", "thee"};

        // Insert every word one by one
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }

        System.out.println(search("thee"));
        System.out.println(search("thor"));

        // Print all words stored in the Trie
        System.out.println("Words stored in Trie:");
        printTrie(root, new StringBuilder());
    }

    // Recursively traverses the Trie and prints all stored words in alphabetical order
    public static void printTrie(Node curr, StringBuilder currentWord) {
        if (curr == null) {
            return;
        }

        // If end of word flag is set, print the accumulated string
        if (curr.eow) {
            System.out.println(currentWord.toString());
        }

        // Check all 26 possible child paths
        for (int i = 0; i < 26; i++) {
            if (curr.children[i] != null) {
                // Append character corresponding to index i ('a' + i)
                currentWord.append((char) ('a' + i));

                // Recurse deeper into the trie
                printTrie(curr.children[i], currentWord);

                // Backtrack: remove the last appended character for the next branch
                currentWord.deleteCharAt(currentWord.length() - 1);
            }
        }
    }
}
