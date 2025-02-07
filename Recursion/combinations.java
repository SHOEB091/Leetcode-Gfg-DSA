package Recursion;
import java.util.*;
public class combinations {

    public List<List<Integer>> combine(int n, int k) {
        List<Integer> smallList = new ArrayList<>();
        List<List<Integer>> bigList = new ArrayList<>();
        helper(1, n, k, smallList, bigList);
        return bigList;
    }

    void helper(int start, int n, int k, List<Integer> smallList, List<List<Integer>> bigList) {
        // base case
        if (k == smallList.size()) {
            bigList.add(new ArrayList<>(smallList));
            return;
        }
        // iterating n
        for (int i = start; i <= n; i++) {
            smallList.add(i); // modify
            helper(i + 1, n, k, smallList, bigList); // Recursive Call
            // stack fall
            smallList.remove(smallList.size() - 1);
        }
    }

    public static void main(String[] args) {
        combinations solution = new combinations();
        List<List<Integer>> result = solution.combine(4, 2);
        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }
}
