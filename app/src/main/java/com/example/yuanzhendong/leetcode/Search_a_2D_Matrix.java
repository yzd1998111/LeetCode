package com.example.yuanzhendong.leetcode;

public class Search_a_2D_Matrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int low = 0;
        int high = matrix.length;
        int mid = 0;
        while (low < high) {
            mid = low + (high - low)/2 ;
            if (target < matrix[mid][0]) {
                high = mid;
            } else if (target == matrix[mid][0]) {
                return true;
            } else {
                if ((mid + 1) < matrix.length &&  target < matrix[mid + 1][0]) {
                    break;
                }
                low = mid + 1;
            }
        }
        int secLow = 0;
        int secHigh = matrix[0].length;
        int secMid;
        System.out.println("mid" + mid);
        while (secLow < secHigh) {
            secMid = secLow + (secHigh - secLow) / 2;
            if (matrix[mid][secMid] == target) {
                return true;
            } else if (matrix[mid][secMid] > target) {
                secHigh = mid;
            } else {
                secLow = mid + 1;
            }
        }
        return false;
    }
}
