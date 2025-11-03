package basicMaths;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x < 0) return false; // Negative numbers are not palindromes

        int original = x;
        long revNum = 0;
        while (x > 0) {
            int lastdigit = x % 10;
            revNum = revNum * 10 + lastdigit;
            x = x / 10;
        }
        return revNum == original;
    }

}
