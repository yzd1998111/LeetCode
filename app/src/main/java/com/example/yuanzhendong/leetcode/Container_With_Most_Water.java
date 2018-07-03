package com.example.yuanzhendong.leetcode;

public class Container_With_Most_Water {
    public int maxArea(int[] height) {
        if (height == null || height.length < 2) {
            return 0;
        }
        int left = 0;
        int right = height.length - 1;
        int maxA = -1;
        int curA = 0;
        while (left != right) {
            curA =  Integer.min(height[left], height[right]) * (right - left);
            if (curA > maxA) {
                maxA = curA;
            }
            if (height[left] < height[right]) {
                left = left + 1;
            } else {
                right = right - 1;
            }
        }

        return maxA;
    }
}
