package com.mfq.leetcode.code322;


import java.util.Arrays;

/**
 * @author 穆繁强
 * @date 2019/12/13
 */
public class Solution {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        for (int coin : coins) {
            // 金额不可达
            if (amount - coin < 0) {
                continue;
            }
            int subProb = coinChange(coins, amount - coin);
            // 子问题无解
            if (subProb == -1) {
                continue;
            }
            ans = Math.min(ans, subProb + 1);
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;


    }


    public static void main(String[] args) {

        int[] nums = new int[]{1,2,5};
        System.out.println(new Solution().coinChange(nums, 11));
    }
}
