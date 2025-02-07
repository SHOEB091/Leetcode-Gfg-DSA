package Recursion;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.*;
public class combinationSum {
        public List<List<Integer>> combiSum(int[] candidates, int target) {
            List<Integer> smallList = new ArrayList<>();
            List<List<Integer>> bigList = new ArrayList<>();
            helper(candidates , target , 0, smallList , bigList);
            return bigList;
        }
        void helper(int []nums , int target , int index , List<Integer>smallList, List<List<Integer>>bigList)
        {
            //base case
            if(target==0)
            {
                bigList.add(new ArrayList<>(smallList));
                return;
            }

            if(target<0)
            {
                return;
            }
            for (int i=index;i<nums.length;i++){
                smallList.add(nums[i]);//modify
                helper(nums,target-nums[i],i,smallList,bigList);//resursive call
                //stack fall;
                smallList.remove(smallList.size()-1);
            }
        }

    public static void main(String[] args) {
            int []candidates ={1,2,3,4,5,6,7};
        combinationSum sp = new combinationSum();
        List<List<Integer>> result  = sp.combiSum(candidates,3);
        for (List<Integer> list : result) {
            System.out.println(list);
        }

    }

    }


