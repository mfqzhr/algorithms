package com.mfq.leetcode.code011;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/30 15:17
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1, res = 0;
        while (i < j) {
            res = Math.max(Math.min(height[i], height[j]) * (j - i), res);
            if (height[i] <= height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return res;

    }
}
