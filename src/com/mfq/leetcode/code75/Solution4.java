package com.mfq.leetcode.code75;

import java.util.Arrays;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/4/19 11:24
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution4 {
    public void sortColors(int[] nums) {
        int i = 0, j = nums.length - 1, cur = 0;
        while (cur <= j) {
            if (nums[cur] == 0) {
                swap(nums, i, cur);
                cur++;
                i++;
            } else if (nums[cur] == 2) {
                swap(nums, j, cur);
                j--;
            } else {
                cur++;
            }
        }
    }

    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {2, 0, 1, 1};
        new Solution4().sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
}
