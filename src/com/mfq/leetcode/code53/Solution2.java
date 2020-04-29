package com.mfq.leetcode.code53;

import java.util.Arrays;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/29 15:21
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution2 {
    public int maxSubArray(int[] nums) {
        if (nums == null) {
            return Integer.MIN_VALUE;
        }
        if (nums.length == 0) {
            return Integer.MIN_VALUE;
        }
        int cur;
        int pre = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            cur = Math.max(pre, 0) + nums[i];
            max = Math.max(max, cur);
            pre = cur;
        }
        return max;
    }
}
