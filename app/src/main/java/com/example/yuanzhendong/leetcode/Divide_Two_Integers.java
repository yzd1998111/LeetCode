package com.example.yuanzhendong.leetcode;

public class Divide_Two_Integers {
    public int divide(int dividend, int divisor) {
        int sign = 0;
        long count = 0;
        long divisor2 = divisor;
        long dividend2 = dividend;

        if (dividend > 0 && divisor < 0) {
            sign = -1;
            divisor2 = 0- (long) divisor;
        } else if (dividend < 0 && divisor > 0) {
            sign = -1;
            dividend2 = 0- (long)dividend;
        }
        if (dividend < 0) {
            dividend2 = 0 -  (long)dividend;
        }
        if (divisor < 0) {
            divisor2 = 0 - (long) divisor;
        }
        count = maxDivide(dividend2, divisor2);

        if (sign == -1) {
            if (count < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            } else {
                return (int) (0-count);
            }

        } else {
            if (count > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else {
                return (int) count;
            }
        }
    }

    private long maxDivide(long curDividend, long curDivisor) {
        if (curDividend < curDivisor) {
            return 0;
        }
        long maxDivisor = curDivisor;
        long multiple = 1;
        while ((maxDivisor+maxDivisor) <= curDividend) {
            maxDivisor += maxDivisor;
            multiple += multiple;
        }
        return multiple + maxDivide(curDividend - maxDivisor, curDivisor);
    }
}
