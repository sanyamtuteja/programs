package com.test;

import java.util.*;

public class twosum {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
//        int[][] dp = new int[nums.length+1][]1
//        Output: [0,1]
    }

    public static int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[0] = map.get(target - nums[i]);
                result[1] = i;
            } else
                map.put(nums[i], i);
        }
        return result;
    }

    public static boolean twoSumRec(int[] nums, int index, int target) {

        if (target == 0) {
            return true;
        }
        if (index == 0) {
            return (nums[0] == target);
        }

        boolean nottake = twoSumRec(nums, index - 1, target);
        boolean take = false;
        if (target > nums[index]) {
            take = twoSumRec(nums, index - 1, target - nums[index]);
        }
        return nottake || take;
    }


}
