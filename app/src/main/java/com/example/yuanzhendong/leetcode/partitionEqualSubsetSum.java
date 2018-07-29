package com.example.yuanzhendong.leetcode;

public class partitionEqualSubsetSum {

    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        if (sum % 2 == 1) {
            return false;
        } else {
            boolean[] dp = new boolean[sum+1];
            dp[0] = true;

            for(int i = nums.length - 1; i >= 0; i--) {
                for (int j = sum; j >= 0; j--) {
                    if (dp[j]) {
                        dp[j + nums[i]] = true;
                    }
                }
                if (dp[sum/2]) {
                    return true;
                }
            }

            return false;
        }
    }

}
