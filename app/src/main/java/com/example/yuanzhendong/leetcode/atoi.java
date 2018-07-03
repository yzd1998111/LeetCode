package com.example.yuanzhendong.leetcode;

public class atoi {
    public int myAtoi(String str) {
        String tmpStr = str.trim();
        tmpStr = tmpStr.substring(0, findFirst(tmpStr));
        if (tmpStr == null || tmpStr.length() == 0 || tmpStr == " ") {
            return 0;
        }

        int curNum = 0;
        int sign = 1;
        int adder = 0;
        if ((tmpStr.charAt(0) != '+' && tmpStr.charAt(0) != '-' && !Character.isDigit(tmpStr.charAt(0)))) {
            return 0;
        } else {
            String digits = tmpStr.replaceAll("[^0-9-+]", "");
            System.out.println("digits" + digits);
            int digitLen = digits.length();

            if (digits.charAt(0) == '-') {
                sign = -1;
                for (int i = 1; i < digitLen; i++) {
                    adder = (digits.charAt(i) - '0');
                    if (! (0 <= adder && adder <= 9)) {
                        return curNum*sign;
                    }

                    if (curNum > (Integer.MAX_VALUE-adder)/10 && sign == -1) {
                        return Integer.MIN_VALUE;
                    } else if (curNum > (Integer.MAX_VALUE-adder)/10 && sign == 1) {
                        return Integer.MAX_VALUE;
                    } else {
                        curNum = curNum * 10 + adder;
                    }
                }
            } else if (digits.charAt(0) == '+') {
                sign = 1;
                for (int i = 1; i < digitLen; i++) {
                    adder = (digits.charAt(i) - '0');
                    if (! (0 <= adder && adder <= 9)) {
                        return curNum*sign;
                    }
                    if (curNum > (Integer.MAX_VALUE-adder)/10 && sign == -1) {
                        return Integer.MIN_VALUE;
                    } else if (curNum > (Integer.MAX_VALUE-adder)/10 && sign == 1) {
                        return Integer.MAX_VALUE;
                    } else {
                        curNum = curNum * 10 + adder;
                    }
                }
            } else {
                for (int i = 0; i < digitLen; i++) {
                    System.out.println("curNum" + curNum);
                    adder = (digits.charAt(i) - '0');
                    if (! (0 <= adder && adder <= 9)) {
                        return curNum*sign;
                    }
                    if (curNum > (Integer.MAX_VALUE-adder)/10) {
                        return Integer.MAX_VALUE;
                    }
                    curNum = curNum * 10 +  adder;

                }
            }

        }
        return curNum*sign;
    }

    private int findFirst(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i)) && str.charAt(i)!= '-' && str.charAt(i) != '+') {
                return i;
            }
        }
        return str.length();
    }
}
