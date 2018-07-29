package com.example.yuanzhendong.leetcode;

public class Set_Matrix_Zeroes {
    public void setZeroes(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return;
        } else {
            int max = Integer.MIN_VALUE;
            for (int iii = 0; iii < matrix.length; iii ++) {
                for (int jjj =0; jjj < matrix[0].length; jjj ++) {
                    if (matrix[iii][jjj] > max) {
                        max = matrix[iii][jjj];
                    }
                }
            }

            for (int i = 0; i < matrix.length; i ++) {
                for (int j =0; j < matrix[0].length; j ++) {
                    if (matrix[i][j] == 0) {
                        setZeroesWrapper(matrix,i,j, max + 1);
                    }
                }
            }
            for (int ii = 0; ii < matrix.length; ii++) {
                for (int jj =0; jj < matrix[0].length; jj ++) {
                    if (matrix[ii][jj] == max + 1) {
                        matrix[ii][jj] = 0;
                    }
                }
            }
            return;
        }
    }

    public void setZeroesWrapper(int[][] matrix, int targetRow, int targetCol, int magicNumber) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][targetCol] != 0) {
                matrix[i][targetCol] = magicNumber;
            }
        }

        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[targetRow][j] != 0) {
                matrix[targetRow][j] = magicNumber;
            }
        }
        return;
    }
}
