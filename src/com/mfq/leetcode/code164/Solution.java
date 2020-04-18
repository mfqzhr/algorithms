package com.mfq.leetcode.code164;

import java.util.Arrays;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/14 18:17
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution {
    public int maximumGap(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }
        Arrays.sort(nums);
        int max = 0;
        for (int i = 1; i < nums.length; i++) {
            int v = nums[i] - nums[i - 1];
            if (v > max) {
                max = v;
            }
        }

        return max;
    }
}
