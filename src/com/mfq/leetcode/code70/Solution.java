package com.mfq.leetcode.code70;

/**
 * @author mufanqiang
 */
public class Solution {
    public int climbStairs(int n) {
        int[] nums = new int[n + 3];
        nums[0] = 0;
        nums[1] = 1;
        nums[2] = 2;
        if (n < 3) {
            return nums[n];
        }
        for (int i = 3; i <= n; i++) {
            nums[i] = nums[i - 1] + nums[i - 2];
        }

        return nums[n];
    }

    public static void main(String[] args) {
        System.out.println(new Solution().climbStairs(0));
    }
}
