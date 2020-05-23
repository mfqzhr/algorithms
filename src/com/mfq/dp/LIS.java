package com.mfq.dp;

import java.util.Arrays;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/5/22 16:09
 * @description：
 * @modified By：
 * @version: $
 * 最长递增子序列
 */
public class LIS {
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
                if (nums[j] < nums[i])
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
            }
        }

        int res = 0;
        for (int i = 0; i < dp.length; i++) {
            res = Math.max(res, dp[i]);
        }

        return res;
    }
}
