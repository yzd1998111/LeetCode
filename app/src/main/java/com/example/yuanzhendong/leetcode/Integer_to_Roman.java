package com.example.yuanzhendong.leetcode;

import java.util.HashMap;

public class Integer_to_Roman {
    public String intToRoman(int num) {
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanChars = {"M", "CM", "D", "CD","C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int tmp = num;
        int curInedx = 0;
        int reps;
        StringBuilder res = new StringBuilder();
        while(tmp != 0) {
            if (tmp / values[curInedx] > 0) {
                reps = tmp / values[curInedx];
                tmp = tmp - reps * values[curInedx];
                while (reps > 0) {
                    res.append(romanChars[curInedx]);
                    reps = reps - 1;
                }
            }
            curInedx = curInedx + 1;
        }
        return res.toString();
    }
}
