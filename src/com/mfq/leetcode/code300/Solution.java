package com.mfq.leetcode.code300;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/3/26 16:01
 * @description：最长上升子序列
 * @modified By：
 * @version: v1$
 */
public class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }
        int[] dp = new int[nums.length];
        int max = 1;
        for (int i = 0; i < dp.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            max = Math.max(dp[i], max);
        }
        return max;
    }
}
