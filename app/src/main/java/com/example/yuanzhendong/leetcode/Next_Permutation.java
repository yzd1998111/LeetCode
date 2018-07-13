package com.example.yuanzhendong.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Next_Permutation {
    public void nextPermutation(int[] nums) {
        if (nums.length <= 1) {
            return ;
        }
        int tmp;
        int numLen = nums.length;
        int index = numLen - 1;
        int breakPoint;
        int swapPoint = numLen - 1;

        while (index >= 1 && nums[index-1] >= nums[index]) {
            index = index - 1;
        }

        breakPoint = index - 1;
        if (breakPoint >= 0) {
            for (int i = numLen - 1; i >= 0; i--) {
                if (nums[i] > nums[breakPoint]) {
                    swapPoint = i;
                    break;
                }
            }
        }
        if (breakPoint >= 0) {
            tmp = nums[breakPoint];
            nums[breakPoint] = nums[swapPoint];
            nums[swapPoint] = tmp;
        }
        Arrays.sort(nums, breakPoint+1, numLen);
    }
}
