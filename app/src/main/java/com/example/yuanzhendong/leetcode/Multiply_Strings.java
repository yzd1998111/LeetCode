package com.example.yuanzhendong.leetcode;

public class Multiply_Strings {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0") || num1.length() == 0 || num2.length() == 0) {
            return "0";
        }
        int len1 = num1.length();
        int len2 = num2.length();
        int[] res = new int[len1 + len2];
        for (int i = len1 - 1; i >= 0; i--) {
            for (int j = len2 - 1; j >= 0; j--) {
                int multRes = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                res[i + j] += (multRes + (res[i+j+1])) % 10;
                res[i + j + 1] = (multRes + (res[i+j+1])) / 10;
            }
        }
        StringBuilder result = new StringBuilder();
        for (int k = len1 + len2 - 1; k >= 0; k--) {
            result.append(Integer.toString(res[k]));
        }
        String finalRes = result.toString();
        if (finalRes.charAt(0) == '0') {
            finalRes = finalRes.substring(1, finalRes.length());
        }
        return finalRes;
    }
}
