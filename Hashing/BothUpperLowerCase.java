package Hashing;

import java.util.*;

//Case 2 –  If the string contains only uppercase letters: In this case, we can map the characters like:
//
//‘A’ -> 0, ‘B’ -> 1, ‘C’ -> 2,....., ‘Z’ -> 25.
//In order to get the corresponding value for a character, we will use the following formula:
//
//corresponding value = given character – ‘A’
//
//Then the process will be similar to case 1.

public class BothUpperLowerCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s;
        s = sc.next();

        //precompute:
        int[] hash = new int[256];//do this if we don't know the upper case nad lower case
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)]++;
        }

        int q;
        q = sc.nextInt();
        while (q-- > 0) {
            char c;
            c = sc.next().charAt(0);
            // fetch:
            System.out.println(hash[c]);
        }
    }

}
