package com.example.yuanzhendong.leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Combination_Sum_Two {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Set<List<Integer>> solutions = new HashSet<>();

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> tmpSolution = new ArrayList<>();

        if (candidates == null || target < 0) {
            return new ArrayList<>();
        }
        if (candidates.length == 0 && target != 0) {
            return new ArrayList<>();
        }

        if (target == 0) {
            result.add(tmpSolution);
            return result;
        }

        List<List<Integer>> solution1 = new ArrayList<>();
        List<List<Integer>> solution2 = new ArrayList<>();

        solution1 = combinationSum2(Arrays.copyOfRange(candidates, 1, candidates.length), target - candidates[0]);
        solution2 = combinationSum2(Arrays.copyOfRange(candidates, 1, candidates.length), target);

        for (List<Integer> entry1 : solution1) {
            entry1.add(candidates[0]);
        }
        for (List<Integer> a : solution1) {
            Collections.sort(a);
            solutions.add(a);
        }

        for (List<Integer> b : solution2) {
            Collections.sort(b);
            solutions.add(b);
        }
        for (List<Integer> d : solutions) {
            result.add(d);
        }
        return result;
    }
}
