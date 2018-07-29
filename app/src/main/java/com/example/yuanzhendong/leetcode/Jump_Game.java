package com.example.yuanzhendong.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Jump_Game {
    public boolean canJump(int[] nums) {
        if (nums.length == 0) {
            return false;
        } else if (nums.length == 1) {
            return true;
        } else {
            return canJumpWrapper(nums, 0);
        }
    }

    private boolean canJumpWrapper(int[] nums, int index) {
        int counter = Integer.min(nums[index],nums.length - index - 1);
        if (index == nums.length - 1) {
            return true;
        }
        for (int next = index + counter; next > index; next --) {
            if (canJumpWrapper(nums, next)) {
                return true;
            }
        }
        return false;
    }
}
