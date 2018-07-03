package com.example.yuanzhendong.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class three_sum {
    public List<List<Integer>> threeSum(int[] nums) {
        int numLen = nums.length;
        int index = 0;
        int targetSum = 0;
        int left;
        int right;

        if (numLen < 3) {
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        List<List<Integer>> solutions = new ArrayList<>();
        HashSet<String> solu = new HashSet<>();
        for (int i = 0; i < numLen; i++) {
            if (nums[i] > 0) {
                break;
            }
            left = i + 1;
            right = numLen - 1;
            targetSum = nums[i] * -1;
            List<Integer> curSol = new ArrayList<>();
            while (left < right) {
                if (nums[left] + nums[right] < targetSum) {
                    left = left + 1;
                } else if (nums[left] + nums[right] > targetSum) {
                    right = right - 1;
                } else {
                    if (left != i && right != i ) {
                        curSol.add(nums[i]);
                        curSol.add(nums[left]);
                        curSol.add(nums[right]);
                    }
                    Collections.sort(curSol);

                    if (!curSol.isEmpty() ) {
                        String tmpStr = "" + curSol.get(0) + "" + curSol.get(1) + "" + curSol.get(2);
                        if (!solu.contains(tmpStr)) {
                            solu.add(tmpStr);
                            solutions.add(curSol);
                        }
                    }
                    curSol = new ArrayList<>();
                    
                    while(left < right && nums[left] == nums[left+1]) {
                        System.out.println("aa");
                        left++;
                    }
                    while(left < right && nums[right] == nums[right-1]) {
                        System.out.println("bb");
                        right--;
                    }
                }
            }
        }
        System.out.println("Abc");
        return solutions;
    }
}
