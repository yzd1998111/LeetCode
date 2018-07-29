package com.example.yuanzhendong.leetcode;

import java.util.ArrayList;
import java.util.List;

public class getPermutation {
    static int factorial(int n)
    {
        if (n == 0)
            return 1;

        return n*factorial(n-1);
    }

    public String getPermutation(int n, int k) {
        if (n == 0 || k == 0) {
            return "";
        } else if (n == 1) {
            return "1";
        } else {
            k = k - 1;
            int cls;
            List<Integer> nums = new ArrayList<>();
            for (int j = 1; j <= n; j++) {
                nums.add(j);
            }

            StringBuilder res = new StringBuilder();
            for (int i = n; i > 0; i--) {
                cls = k / factorial(i - 1);
                k = k % factorial(i - 1);
                res.append(Integer.toString(nums.remove(cls)));
            }
            return res.toString();
        }
    }
}
