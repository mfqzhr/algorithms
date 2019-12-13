package com.mfq.leetcode.code122;

/**
 * @author 穆繁强
 * @date 2019/12/13
 */
public class Solution {

    public int maxProfit(int[] prices) {
        int sum = 0;
        if (prices.length <= 1) {
            return sum;
        }
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] > prices[i]) {
                sum += (prices[i + 1] - prices[i]);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 5, 3, 4};
        System.out.println(new Solution().maxProfit(nums));
    }
}
