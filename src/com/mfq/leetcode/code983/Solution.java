package com.mfq.leetcode.code983;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/5/6 16:08
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int[] dp = new int[days[days.length - 1] + 1];
        int curDay = 1;
        for (int i = 0; i < days.length; i++) {
            while (curDay < days[i]) {
                dp[curDay] = dp[curDay - 1];
                curDay++;
            }
            int minCost = dp[curDay - 1] + costs[0];
            minCost = Math.min(minCost, curDay >= 7 ? dp[curDay - 7] + costs[1] : costs[1]);
            minCost = Math.min(minCost, curDay >= 30 ? dp[curDay - 30] + costs[2] : costs[2]);
            dp[curDay] = minCost;
        }
        return dp[curDay];
    }
}
