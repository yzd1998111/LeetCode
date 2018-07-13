package com.example.yuanzhendong.leetcode;

public class Search_in_Rotated_Sorted_Array {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length -1;
        return find(nums, target, low, high);
    }

    private int find(int[] nums, int target, int low, int high) {
        int mid = low + (high - low)/2;
        if(low > high) {
            return -1;
        }
        if(nums[mid] == target) {
            return mid;
        }
        if(nums[low] <= nums[mid]) {
            if(nums[low] <= target && nums[mid] >=target) {
                return find(nums, target, low, mid);
            }else{
                return find(nums, target, mid+1, high);
            }
        }
        else {
            if(nums[mid] <= target && nums[high] >=target) {
                return find(nums, target, mid+1, high);
            }else{
                return find(nums, target, low, mid);
            }
        }
    }
}
