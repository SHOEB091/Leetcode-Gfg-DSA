package string;

public class LongestCommonPrefix {

    //Method 1 
    public String longestcommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
           return "";
       }
            // Outer loop: iterate through each character position of the prefix
           String prefix = strs[0];
           for (int i = 0; i < prefix.length(); i++) {
           // Inner loop: iterate through each string in the array
           for (int j = 1; j < strs.length; j++) {
               // Check if the current string is shorter than the prefix or if there is a mismatch
               if (i >= strs[j].length() || strs[j].charAt(i) != prefix.charAt(i)) {
                   // Return the substring of the prefix from the beginning to position i
                   return prefix.substring(0, i);
               }
           }
       }
       return prefix;
       }

       //method 2
       // Method to find the longest common prefix using the indexOf method
    public static String longestPrefix(String[] strs) {
        // If the input array is empty, return an empty string
        if (strs.length == 0) return "";

        // Initialize the prefix with the first string in the array
        String prefix = strs[0];

        // Iterate through the rest of the strings in the array
        for (int i = 1; i < strs.length; i++) {
            // While the current string does not start with the prefix
            while (strs[i].indexOf(prefix) != 0) {
                // Shorten the prefix by removing the last character
                prefix = prefix.substring(0, prefix.length() - 1);

                // If the prefix becomes empty, return an empty string
                if (prefix.isEmpty()) return "";
            }
        }

        // Return the longest common prefix
        return prefix;
    }

}
