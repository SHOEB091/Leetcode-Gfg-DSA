package Recursion;

import java.util.*;

class subsets {
    public List<List<Integer>> subset(int[] nums) {
        List<Integer> smallList = new ArrayList<>();
        List<List<Integer>> bigList = new ArrayList<>();
        helper(nums, 0, smallList, bigList);
        return bigList;
    }

    void helper(int[] nums, int index, List<Integer> smallList, List<List<Integer>> bigList) {
        // adding to bigList
        bigList.add(new ArrayList<>(smallList));

        // iterating over nums
        for (int i = index; i < nums.length; i++) {
            if (!smallList.contains(nums[i])) {
                smallList.add(nums[i]); // modify
                helper(nums, i + 1, smallList, bigList); // Recursive Call
                // Stack fall
                smallList.remove(smallList.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        subsets solution = new subsets();
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = solution.subset(nums);
        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }
}
