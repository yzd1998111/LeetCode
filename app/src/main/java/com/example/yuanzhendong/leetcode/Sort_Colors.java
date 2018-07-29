package com.example.yuanzhendong.leetcode;

public class Sort_Colors {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length == 1) {
            return;
        }
        int low = 0;
        int high = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                swap(nums, i, high);
                high = high - 1;
            }
            if (nums[i] == 0) {
                swap(nums, i, low);
                low = low + 1;
            }
        }
    }
    private void swap(int[] nums, int low, int high) {
        int tmp = nums[low];
        nums[low] = nums[high];
        nums[high] = tmp;
        return;
    }
}
