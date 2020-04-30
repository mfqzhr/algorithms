package com.mfq.leetcode.code042;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/29 23:04
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution {
    public int trap(int[] height) {
        int res = 0;
        for (int i = 1; i < height.length; i++) {
            int leftMax = getMax(0, i - 1, height);
            int rightMax = getMax(i + 1, height.length - 1, height);
            int min = Math.min(leftMax, rightMax);
            res += (min < height[i] ? 0 : min - height[i]);
        }
        return res;
    }

    private int getMax(int i, int j, int[] height) {
        int max = 0;
        for (int k = i; k <= j; k++) {
            if (max < height[k]) {
                max = height[k];
            }
        }
        return max;
    }
}
