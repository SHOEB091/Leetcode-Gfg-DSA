package BinarySearch;

public class NextLetter {

    public static char nextLetter(String str, char key) {
        int start = 0;
        int end = str.length() - 1;
        char result = '#'; // Initialize result with a placeholder character

        while (start <= end) {
            int mid = start + (end - start) / 2; // Calculate mid index

            // If key is found or mid character is less than key, move to the right half
            if (str.charAt(mid) <= key) {
                start = mid + 1;
            }
            // If mid character is greater than key, update result and move to the left half
            else if (str.charAt(mid) > key) {
                result = str.charAt(mid);
                end = mid - 1;
            }
        }

        // If result is not updated, it means the next letter is not found in the given string.
        // Assuming the characters are sorted and we need to wrap around, return the first character of the string.
        // This handles the case where the search key is greater than any character in the string.
        return result != '#' ? result : str.charAt(0);
    }

    public static void main(String[] args) {
        String str = "acfhijklm"; // Example string
        char key = 'h'; // Key to find the next letter for

        // Print the next letter to the given key in the string
        System.out.println("The next letter to the " + key + " is " + nextLetter(str, key));
    }
}