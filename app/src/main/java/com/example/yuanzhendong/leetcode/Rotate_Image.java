package com.example.yuanzhendong.leetcode;

public class Rotate_Image {
    public void rotate(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return;
        }
        int[] tmpList;
        int tmp;
        int rowLen = matrix.length;
        int colLen = matrix[0].length;
        for(int top = 0, bot = rowLen-1; top<bot; top++,bot--) {
            tmpList = matrix[top];
            matrix[top] = matrix[bot];
            matrix[bot] = tmpList;
        }
        for(int i = 0; i < colLen; i++){
            for(int j = i+1; j < colLen; j++){
                tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
    }
}
