package com.mfq.leetcode.code322;


import java.util.Arrays;

/**
 * @author 穆繁强
 * @date 2019/12/13
 * dp[41] = 凑到41分需要的最少硬币个数
 * dp[21] = 凑到21分所需要的最少硬币个数
 * dp[n] = 凑到n分所需要的最少硬币个数
 * 假设 dp[n]是凑到n分需要的最少硬币个数
 * 如果第一次选了25分的硬币那么: dp[n] = dp[n -25] + 1
 * 如果第一次选了20的硬币那么: dp[n] = dp[n - 20] + 1
 * 如果第一次选了5分的硬币那么: dp[n] = dp[n -5] + 1
 * 如果第一次选了1的硬币那么: dp[n] = dp[n - 1] + 1
 */
public class Solution {

    /**
     * 暴力递归,自顶向下
     *
     * @param coins
     * @param amount
     * @return
     */

    public int coinChange(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        int res = help(coins, amount);
        return res >= 1 ? res : -1;
    }


    private int help(int[] coins, int amount) {
        if (amount < 1) {
            return Integer.MAX_VALUE;
        }
        for (int i = 0; i < coins.length; i++) {
            if (amount == coins[i]) {
                return 1;
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < coins.length; i++) {
            int res = help(coins, amount - coins[i]);
            min = Math.min(res, min);
        }
        return min + 1;
    }

    public int coinChange2(int[] coins, int amount) {
        Arrays.sort(coins);
        if (amount < 1) {
            return amount == 0 ? 0 : -1;
        }
        int[] dp = new int[amount + 1];
        for (int i = 0; i < coins.length; i++) {
            if (amount < coins[i]) continue;
            dp[coins[i]] = 1;
        }
        int res = help2(coins, amount, dp);
        return res >= 1 ? res : -1;
    }

    /**
     * 记忆化搜索(自顶向下调用)
     *
     * @param coins
     * @param amount
     * @return
     */
    private int help2(int[] coins, int amount, int[] dp) {
        if (amount < 1) {
            return Integer.MAX_VALUE;
        }
        if (dp[amount] == 0) {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < coins.length; i++) {
                int res = help2(coins, amount - coins[i], dp);
                min = Math.min(res, min);
            }
            dp[amount] = min + 1;
        }
        return dp[amount];
    }

    /**
     * 递推..(自底向上)
     *
     * @param coins
     * @param amount
     * @return
     */
    public int coinChange3(int[] coins, int amount) {
        if (amount < 1) {
            return amount == 0 ? 0 : -1;
        }
        int[] dp = new int[amount + 1];
        for (int i = 1; i <= amount; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j++) {
                if (i - coins[j] >= 0 && dp[i - coins[j]] < min) {
                    min = dp[i - coins[j]] + 1;
                }
            }
            dp[i] = min;
        }
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        int[] nums = new int[]{83, 186, 419, 408};
        System.out.println(new Solution().coinChange3(nums, 6249));
    }
}
