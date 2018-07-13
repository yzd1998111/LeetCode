package com.example.yuanzhendong.leetcode;

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {

    public int[] searchRange(int[] nums, int target) {
        int [] res = new int[2];
        int [] res1 ;
        int [] res2 ;
        res[0] = -1;
        res[1] = -1;
        if (nums == null || nums.length < 1) {
            return res;
        }
        int low = 0;
        int high = nums.length;
        int mid;

        while (low < high) {
            mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                res[0] = mid;
                res[1] = mid;

                res1 = binarySearch(nums, low, mid, target);
                res2 = binarySearch(nums, mid + 1, high, target);

                if (res1[0] < res[0] && res1[0] != -1) {
                    res[0] = res1[0];
                }

                if (res2[1] > res[1] && res2[1] != -1) {
                    res[1] = res2[1];
                }
                break;
            }

            if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid;
            }
        }
        return res;

    }

    public int[] binarySearch(int[] nums, int low, int high, int target) {
        int mid;
        int [] res = new int[2];
        res[0] = -1;
        res[1] = -1;
        int [] res1 = new int[2];
        int [] res2 = new int[2];


        while (low < high) {
            mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                res[0] = mid;
                res[1] = mid;
                res1 = binarySearch(nums, low, mid, target);
                res2 = binarySearch(nums, mid + 1, high, target);
                break;
            }
            if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid;
            }
        }
        if (res1[0] < res[0] && res1[0] != -1) {
            res[0] = res1[0];
        }

        if (res2[1] > res[1] && res2[1] != -1) {
            res[1] = res2[1];
        }
        return res;
    }
}
