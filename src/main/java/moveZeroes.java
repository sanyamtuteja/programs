package com.test;

import java.util.Arrays;

public class moveZeroes {

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
//        Output: [1,3,12,0,0]
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {

        int j = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count++;
            } else {
                nums[j++] = nums[i];
            }
        }
        for (int k = 0; k < count; k++) {
            nums[j++] =0;
        }
        System.out.println(Arrays.toString(nums));
    }
}
