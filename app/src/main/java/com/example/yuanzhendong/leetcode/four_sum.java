package com.example.yuanzhendong.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class four_sum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int numLen = nums.length;
        if (numLen < 4) {
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        List<List<Integer>> targets = new ArrayList<>();
        List<Integer> tmp;
        for (int i = 0; i < numLen; i++) {
            for (int j = i + 1; j < numLen; j++) {
                tmp = new ArrayList<>();
                tmp.add(i);
                tmp.add(j);
                tmp.add(target-nums[i]-nums[j]);
                targets.add(tmp);
            }
        }
        List<Integer> attempt;
        int firstIndex, secondIndex, curTarget;
        int left, right;
        List<Integer> curSolution = new ArrayList<>();
        Set<List<Integer>> solutions = new HashSet<>();
        List<List<Integer>> finalSolutions = new ArrayList<>();
        while (!targets.isEmpty()) {
            System.out.println("abc");
            attempt = targets.remove(0);
            firstIndex = attempt.get(0);
            secondIndex = attempt.get(1);
            curTarget = attempt.get(2);
            left = 0;
            right = numLen - 1;
            while (left >=0 && right < numLen && left < right) {
                System.out.println("left" + left +"," + right);
                if (left == firstIndex) {
                    left ++;
                    continue;
                } else if (right == secondIndex) {
                    right --;
                    continue;
                } else {
                    if (nums[left] + nums[right] == curTarget) {
                        System.out.println(left + "," + right +"," +firstIndex +","+secondIndex);
                        curSolution.add(nums[left]);
                        curSolution.add(nums[right]);
                        curSolution.add(nums[firstIndex]);
                        curSolution.add(nums[secondIndex]);
                        Collections.sort(curSolution);
                        solutions.add(curSolution);
                        curSolution = new ArrayList<>();
                        left ++;
                        right --;
                    } else if (nums[left] + nums[right] < curTarget) {
                        left ++;
                    } else if (nums[left] + nums[right] > curTarget) {
                        right --;
                    }
                }
            }
        }
        for (List<Integer> tmpRes: solutions) {
            finalSolutions.add(tmpRes);
        }
        return finalSolutions;
    }
}
