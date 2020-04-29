package com.mfq.leetcode.code121;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/29 16:14
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution2 {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > min) {
                ans = Math.max(ans, prices[i] - min);
            } else {
                min = prices[i];
            }
        }
        return ans;
    }
}
