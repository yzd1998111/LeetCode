package com.example.yuanzhendong.leetcode;

public class reachNumber {
    public int reachNumber(int target) {
        target = Math.abs(target);
        int curSum = 0;
        int count = 0;
        while (curSum < target) {
            count = count + 1;
            curSum = curSum + count;
        }
        if (curSum == target) {
            return count;
        } else {
            int dif = curSum - target;
            if (dif % 2 == 0) {
                return count;
            } else {
                int nextCnt = count + 1;
                if (nextCnt % 2 == 0) {
                    return count + 2;
                } else {
                    return count + 1;
                }
            }
        }
    }
}
