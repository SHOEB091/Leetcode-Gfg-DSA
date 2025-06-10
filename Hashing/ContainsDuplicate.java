package Hashing;
import java.util.*;

public class ContainsDuplicate {

    public static boolean contain(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                return true; // Duplicate found
            } else {
                set.add(arr[i]);
            }
        }
        return false; // No duplicates found
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 2};
        System.out.println("arr1 contains duplicate? " + contain(arr1)); // false
        System.out.println("arr2 contains duplicate? " + contain(arr2)); // true
    }

}
