package com.mfq.leetcode.code75;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/14 15:51
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution3 {
    public void sortColors(int[] nums) {
        int i = 0, j = nums.length - 1, cur = 0;
        while (cur <= j) {
            if (nums[cur] == 0) {
                swap(nums, cur, i);
                i++;
                cur++;
            } else if (nums[cur] == 2) {
                swap(nums, cur, j);
                j--;
            } else {
                cur++;
            }
        }
    }

    void swap(int[] num, int i, int j) {
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }
}
