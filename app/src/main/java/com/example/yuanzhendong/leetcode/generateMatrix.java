package com.example.yuanzhendong.leetcode;

public class generateMatrix {
    public int[][] generateMatrix(int n) {
        int counter = 0;
        int maxCounter = n * n;
        int order = 0;
        int curRow = 0;
        int curCol = -1;
        int maxCol = n - 1;
        int maxRow = n - 1;
        int minCol = 0;
        int minRow = 0;
        int[][] resMat = new int[n][n];
        while (counter < maxCounter) {

            switch (order) {
                case 0:
                    while (curCol < maxCol) {
                        curCol = curCol + 1;
                        counter = counter + 1;
                        resMat[curRow][curCol] = counter;
                    }
                    minRow = minRow + 1;
                    order = 1;
                    break;
                case 1:
                    while (curRow < maxRow) {
                        curRow = curRow + 1;
                        counter = counter + 1;
                        resMat[curRow][curCol] = counter;
                    }
                    maxCol = maxCol - 1;
                    order = 2;
                    break;
                case 2:
                    while (curCol > minCol) {
                        curCol = curCol - 1;
                        counter = counter + 1;
                        resMat[curRow][curCol] = counter;
                    }
                    maxRow = maxRow - 1;
                    order = 3;
                    break;
                case 3:
                    while (curRow > minRow) {
                        curRow = curRow - 1;
                        counter = counter + 1;
                        resMat[curRow][curCol] = counter;
                    }
                    minCol = minCol + 1;
                    order = 0;
                    break;
            }
        }
        return resMat;
    }
}
