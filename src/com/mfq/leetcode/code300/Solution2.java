package com.mfq.leetcode.code300;

import java.util.Arrays;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/30 13:29
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution2 {
    public int lengthOfLIS(int[] nums) {
        if (nums == null) {
            return 0;
        }
        if (nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        int res = 0;
        for (int i = 0; i < dp.length; i++) {
            res = Math.max(dp[i], res);
        }
        return res;
    }
}
