package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collections;

public class UnionOfArray {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements from the first array to the set
        for (int num : a) {
            set.add(num);
        }

        // Add elements from the second array to the set
        for (int num : b) {
            set.add(num);
        }

        // Convert the set to a list
        list.addAll(set);

        // Sort the list
        Collections.sort(list);

        return list;
    }

    public static void main(String[] args) {
        int[] arr1 = {-7, 8};
        int[] arr2 = {-8, -3, 8};
        ArrayList<Integer> union = findUnion(arr1, arr2);
        System.out.println(union); // Output: [-8, -7, -3, 8]
    }
}