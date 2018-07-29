package com.example.yuanzhendong.leetcode;

import java.util.HashMap;

public class Minimum_Path_Sum {
    private int rowCnt;
    private int colCnt;
    HashMap<String, Integer> solution = new HashMap<>();
    public int minPathSum(int[][] grid) {
        rowCnt = grid.length;
        colCnt = grid[0].length;
        return minPathSumWrapper(grid, grid.length-1, grid[0].length-1);
    }

    private int minPathSumWrapper(int[][]grid, int m, int n) {
        if (m == 0 && n == 0) {
            return grid[0][0];
        } else if (m < 0 || n < 0) {
            return -1;
        } else {
            if (solution.containsKey("row" + m + "col" + n)) {
                return solution.get("row" + m + "col" + n);
            } else {
                if (m < rowCnt && n < colCnt) {
                    int res = 0;
                    if (minPathSumWrapper(grid, m - 1, n) == -1) {
                        res = minPathSumWrapper(grid, m, n - 1) + grid[m][n];
                    } else if (minPathSumWrapper(grid, m, n - 1) == -1) {
                        res = minPathSumWrapper(grid, m - 1, n) + grid[m][n];
                    } else {
                        res = Integer.min(minPathSumWrapper(grid, m - 1, n), minPathSumWrapper(grid, m, n - 1)) + grid[m][n];
                    }
                    solution.put("row" + m + "col" + n, res);
                    return res;
                } else {
                    return 0;
                }
            }
        }
    }
}
