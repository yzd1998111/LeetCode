package com.example.yuanzhendong.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class three_sum_closest {
    public int threeSumClosest(int[] nums, int target) {
        int numLen = nums.length;
        int left;
        int right;

        if (numLen < 3) {
            return 0;
        }
        Arrays.sort(nums);
        List<List<Integer>> solutions = new ArrayList<>();
        HashSet<String> solu = new HashSet<>();
        int actualTarget = -1;
        int curClosest = 0;
        int curMinDif = Integer.MAX_VALUE;
        for (int i = 0; i < numLen; i++) {
            left = i + 1;
            right = numLen - 1;
            actualTarget = target - nums[i];
            while (right >=0 && left < numLen && left != right) {
                if (nums[left] + nums[right] == actualTarget) {
                    return target;
                } else if (nums[left] + nums[right] > actualTarget) {
                    if (Math.abs(actualTarget - nums[left] - nums[right]) < curMinDif) {
                        curMinDif = Math.abs(actualTarget - nums[left] - nums[right]);
                        curClosest = nums[left] + nums[right] + nums[i];
                        System.out.println(curClosest + "" + left + "" + right + "" + i);
                    }
                    right = right - 1;
                } else if (nums[left] + nums[right] < actualTarget) {
                    if (Math.abs(actualTarget - nums[left] - nums[right]) < curMinDif) {
                        curMinDif = Math.abs(actualTarget - nums[left] - nums[right]);
                        System.out.println(curClosest + "" + left + "" + right + "" + i);
                        curClosest = nums[left] + nums[right] + nums[i];
                    }
                    left = left + 1;
                }
            }
        }
        return curClosest;
    }
}
