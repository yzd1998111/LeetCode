package com.example.yuanzhendong.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        if (nums == null || nums.length == 0) {
            List emptyList = new ArrayList();
            return new ArrayList<>(emptyList);
        } else if (nums.length == 1) {
            List tmpList = new ArrayList();
            List<List<Integer>> result = new ArrayList<>();
            tmpList.add(nums[0]);
            result.add(tmpList);
            return result;
        } else {
            List<List<Integer>> result = new ArrayList<>();
            List<List<Integer>> restPermute = permute(Arrays.copyOfRange(nums, 1, nums.length));
            for (List<Integer> entry : restPermute) {
                for (int i = 0; i <= entry.size(); i++) {
                    entry.add(i, nums[0]);
                    result.add(new ArrayList<Integer>(entry));
                    entry.remove(i);
                }
            }
            return result;
        }
    }
}
