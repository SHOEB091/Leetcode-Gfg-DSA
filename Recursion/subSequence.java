package Recursion;

import java.util.*;

public class subSequence {

    static void printSubsequences(int index, List<Integer> list, int[] arr, int n) {
        if (index >= n) {
            System.out.println(list);
            return;
        }

        // Include the current element
        list.add(arr[index]);
        printSubsequences(index + 1, list, arr, n);

        // Exclude the current element
        list.remove(list.size() - 1);
        printSubsequences(index + 1, list, arr, n);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        printSubsequences(0, new ArrayList<>(), arr, arr.length);
    }
}
