import java.util.*;

public class Permutation_backtracking {

    public List<List<Integer>> permutation(int[] nums) {
        List<Integer> smallList = new ArrayList<>();
        List<List<Integer>> finalList = new ArrayList<>();
        helper(nums, smallList, finalList);
        return finalList;
    }

    void helper(int[] nums, List<Integer> smallList, List<List<Integer>> finalList) {
        // base case
        if (nums.length == smallList.size()) {
            finalList.add(new ArrayList<>(smallList));
            return;
        }
        // iterate the nums
        for (int i = 0; i < nums.length; i++) {
            if (!smallList.contains(nums[i])) {
                smallList.add(nums[i]); // adding the value which is not exist
                helper(nums, smallList, finalList); // recursive call
                smallList.remove(smallList.size() - 1); // backtrack
            }
        }
    }

    public static void main(String[] args) {
        Permutation_backtracking pb = new Permutation_backtracking();
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = pb.permutation(nums);
        System.out.println(result);
    }
}