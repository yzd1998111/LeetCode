package com.example.yuanzhendong.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Spiral_Matrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new ArrayList<>();
        }
        List<Integer> map = new ArrayList<>();
        int matSz = matrix.length * matrix[0].length;
        int maxRow = matrix.length;
        int maxCol = matrix[0].length;
        int minRow = -1;
        int minCol = -1;
        int curRow = 0;
        int curCol = 0;
        int order = 0;
        while (map.size() != matSz) {
            switch (order) {
                case 0:
                    while (curCol != maxCol) {
                        if (curRow < matrix.length && curCol < matrix[0].length && curRow >= 0 && curCol >=0) {
                            map.add(matrix[curRow][curCol]);
                        }
                        curCol = curCol + 1;

                    }
                    curCol = curCol - 1;
                    curRow = curRow + 1;
                    order = 1;
                    minRow = minRow + 1;
                    break;
                case 1:
                    while (curRow != maxRow) {
                        if (curRow < matrix.length && curCol < matrix[0].length && curRow >= 0 && curCol >=0) {
                            map.add(matrix[curRow][curCol]);
                        }
                        curRow = curRow + 1;

                    }
                    curRow = curRow - 1;
                    curCol = curCol - 1;
                    order = 2;
                    maxCol = maxCol - 1;
                    break;
                case 2:
                    while (curCol != minCol) {
                        if (curRow < matrix.length && curCol < matrix[0].length && curRow >= 0 && curCol >=0) {
                            map.add(matrix[curRow][curCol]);
                        }
                        curCol = curCol - 1;

                    }
                    curCol = curCol + 1;
                    curRow = curRow - 1;
                    order = 3;
                    maxRow = maxRow - 1;
                    break;
                case 3:
                    while (curRow != minRow) {

                        if (curRow < matrix.length && curCol < matrix[0].length && curRow >= 0 && curCol >=0) {
                            map.add(matrix[curRow][curCol]);
                        }
                        curRow = curRow - 1;
                    }
                    curRow = curRow + 1;
                    curCol = curCol + 1;
                    order = 0;
                    minCol = minCol + 1;
                    break;
            }
        }
        return map;
    }
}
