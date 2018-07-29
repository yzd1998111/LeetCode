package com.example.yuanzhendong.leetcode;

import java.util.HashMap;

public class Unique_Paths {
    HashMap<String, Integer> solution = new HashMap<>();
    public int uniquePaths(int m, int n) {
        if (m == 0 || n ==0) {
            return 0;
        } else if (m == 1 || n == 1) {
            return 1;
        } else {
            if (solution.containsKey("row" + m + "col" + n)) {
                return solution.get("row" + m + "col" + n);
            } else {
                int res = uniquePaths(m - 1, n) + uniquePaths(m, n - 1);
                solution.put("row" + m + "col" + n, res);
                return res;
            }
        }
    }
}
