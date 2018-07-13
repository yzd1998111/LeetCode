package com.example.yuanzhendong.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Valid_Sudoku {
    public boolean isValidSudoku(char[][] board) {
        Set<String> hset = new HashSet<>();
        char curChar;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                curChar = board[i][j];
                if (curChar != '.' && (!hset.add(curChar + "row" + i) || !hset.add(curChar + "col" + j) || !hset.add(curChar + "cross" + i/3 + "," + j/3))) {
                    return false;
                }
            }
        }
        return true;
    }
}
