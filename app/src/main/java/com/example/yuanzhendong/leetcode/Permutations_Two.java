package com.example.yuanzhendong.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Permutations_Two {
    public List<List<Integer>> permuteUnique(int[] nums) {
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
            Set<List<Integer>> result = new HashSet<>();
            List<List<Integer>> finalRes = new ArrayList<>();
            List<List<Integer>> restPermute = permuteUnique(Arrays.copyOfRange(nums, 1, nums.length));
            for (List<Integer> entry : restPermute) {
                for (int i = 0; i <= entry.size(); i++) {
                    entry.add(i, nums[0]);
                    result.add(new ArrayList<Integer>(entry));
                    entry.remove(i);
                }
            }
            for (List<Integer> single : result) {
                finalRes.add(single);
            }
            return finalRes;
        }
    }
}
