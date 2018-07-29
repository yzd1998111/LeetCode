package com.example.yuanzhendong.leetcode;

import java.util.HashMap;

public class Unique_Paths_With_Obstacle {
    HashMap<String, Integer> solution = new HashMap<>();
    private int rowCnt;
    private int colCnt;
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        rowCnt = obstacleGrid.length;
        colCnt = obstacleGrid[0].length;
        return uniquePathsWithObstaclesWrapper(obstacleGrid, obstacleGrid.length, obstacleGrid[0].length);

    }

    private int uniquePathsWithObstaclesWrapper(int[][] grid, int m, int n) {
        if (m == 0 || n ==0 || (m-1 < rowCnt && n-1 < colCnt  &&grid[m-1][n-1] == 1)) {
            solution.put("row" + m + "col" + n, 0);
            return 0;
        } else if (m == 1 || n == 1) {
            return 1;
        } else {
            if (solution.containsKey("row" + m + "col" + n)) {
                return solution.get("row" + m + "col" + n);
            } else {
                int res = uniquePathsWithObstaclesWrapper(grid,m - 1, n) + uniquePathsWithObstaclesWrapper(grid, m, n - 1);
                solution.put("row" + m + "col" + n, res);
                return res;
            }
        }
    }
}
